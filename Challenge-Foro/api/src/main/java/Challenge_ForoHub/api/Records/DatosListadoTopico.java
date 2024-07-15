package Challenge_ForoHub.api.Records;

import Challenge_ForoHub.api.Clases.Topico;

public record DatosListadoTopico(Long id,String titulo, String mensaje, String fecha) {

    public DatosListadoTopico(Topico topico){
        this(topico.getId(),topico.getTitulo(), topico.getMensaje(), topico.getFecha());
    }
}
