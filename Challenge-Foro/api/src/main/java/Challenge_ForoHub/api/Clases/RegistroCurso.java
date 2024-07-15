package Challenge_ForoHub.api.Clases;


import Challenge_ForoHub.api.Records.DatosRegistroCurso;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class RegistroCurso {

    private String nombreCurso;
    private String categoria;

    public RegistroCurso(DatosRegistroCurso curso) {
        this.nombreCurso = curso.nombreCurso();
        this.categoria = curso.categoria();
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

