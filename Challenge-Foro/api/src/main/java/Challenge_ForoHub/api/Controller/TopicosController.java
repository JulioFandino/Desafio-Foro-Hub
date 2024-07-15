package Challenge_ForoHub.api.Controller;


import Challenge_ForoHub.api.Clases.Topico;
import Challenge_ForoHub.api.Records.DatosActualizarTopico;
import Challenge_ForoHub.api.Records.DatosListadoTopico;
import Challenge_ForoHub.api.Records.DatosRegistroTopicos;
import Challenge_ForoHub.api.Records.DatosRespuestaTopico;
import Challenge_ForoHub.api.repositorios.TopicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarMedico(@RequestBody @Valid DatosRegistroTopicos datosRegistroTopicos) {
        topicoRepository.save(new Topico(datosRegistroTopicos) );
    }

    @GetMapping
    public ResponseEntity<DatosListadoTopico> listadoTopico(@PageableDefault Pageable paginacion){
        return ResponseEntity.ok(topicoRepository.findAll(paginacion).map(DatosListadoTopico::new));
    }

    @PutMapping
    @Transactional
    public ResponseEntity actualizarTopicos(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico){
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        DatosRespuestaTopico datosRespuestaTopico = (new DatosRespuestaTopico(topico.getTitulo(), topico.getMensaje(), topico.getFecha(), topico.getAutor(), topico.getCurso()));
        URI url = UriComponentsBuilder.fromPath("/topicos/{id}").buildAndExpand(topico.getid()).toUri();
        return  ResponseEntity.created(url).body(datosRespuestaTopico);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity borrarTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topicoRepository.delete(topico);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestaTopico> retornarDatos(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        var datosTopico = (new DatosRespuestaTopico(topico.getTitulo(), topico.getMensaje(), topico.getFecha(), topico.getAutor(), topico.getCurso()));
        return ResponseEntity.ok(datosTopico);
    }

}
