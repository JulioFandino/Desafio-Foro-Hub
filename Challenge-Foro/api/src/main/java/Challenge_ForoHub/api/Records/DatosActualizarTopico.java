package Challenge_ForoHub.api.Records;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, String fecha) {
}
