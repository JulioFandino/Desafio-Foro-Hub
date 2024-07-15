package Challenge_ForoHub.api.Records;

import Challenge_ForoHub.api.Clases.RegistroAutor;
import Challenge_ForoHub.api.Clases.RegistroCurso;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, String fecha, String status, RegistroAutor autor, RegistroCurso curso) {
}
