package Challenge_ForoHub.api.Clases;

import Challenge_ForoHub.api.Records.DatosActualizarTopico;
import Challenge_ForoHub.api.Records.DatosRegistroCurso;
import Challenge_ForoHub.api.Records.DatosRegistroTopicos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name="Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String titulo;
    private String mensaje;
    private String fecha;
    private boolean status;

    @Embedded
    RegistroAutor autor;
    @Embedded
    RegistroCurso curso;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public RegistroAutor getAutor() {
        return autor;
    }

    public void setAutor(RegistroAutor autor) {
        this.autor = autor;
    }

    public RegistroCurso getCurso() {
        return curso;
    }

    public void setCurso(RegistroCurso curso) {
        this.curso = curso;
    }

    public Topico(DatosRegistroTopicos datosRegistroTopicos) {
        this.titulo = datosRegistroTopicos.titulo();
        this.mensaje = datosRegistroTopicos.mensaje();
        this.fecha = datosRegistroTopicos.fecha();
        this.status = datosRegistroTopicos.status();
        this.autor = new RegistroAutor(datosRegistroTopicos.autor());
        this.curso = new RegistroCurso(datosRegistroTopicos.curso());



    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if(datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if(datosActualizarTopico.fecha() != null){
            this.fecha = datosActualizarTopico.fecha();
        }
        if (datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }

        this.titulo = datosActualizarTopico.titulo();
        this.fecha = datosActualizarTopico.fecha();
        this.mensaje = datosActualizarTopico.mensaje();
    }
}
