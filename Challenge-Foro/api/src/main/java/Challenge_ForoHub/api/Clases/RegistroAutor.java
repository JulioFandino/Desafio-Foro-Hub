package Challenge_ForoHub.api.Clases;


import Challenge_ForoHub.api.Records.DatosRegistroAutor;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class RegistroAutor {

    private String nombre;
    private String email;
    private String contrasena;

    public RegistroAutor(DatosRegistroAutor autor) {
        this.nombre = autor.nombre();
        this.email = autor.email();
        this.contrasena = autor.contrasena();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
