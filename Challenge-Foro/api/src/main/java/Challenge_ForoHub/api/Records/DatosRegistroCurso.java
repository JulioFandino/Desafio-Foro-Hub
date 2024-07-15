package Challenge_ForoHub.api.Records;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroCurso(

        @NotBlank
        String nombreCurso,
        @NotBlank
        String categoria) {
    }
