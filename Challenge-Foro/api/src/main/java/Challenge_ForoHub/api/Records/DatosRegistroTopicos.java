package Challenge_ForoHub.api.Records;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopicos(

        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fecha,
        @NotBlank
        boolean status,

        @NotNull
        @Valid
        DatosRegistroAutor autor,

        @NotNull
        @Valid
        DatosRegistroCurso curso) {


}
