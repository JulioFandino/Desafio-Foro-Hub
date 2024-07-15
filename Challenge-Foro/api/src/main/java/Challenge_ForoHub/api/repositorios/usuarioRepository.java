package Challenge_ForoHub.api.repositorios;

import Challenge_ForoHub.api.Usuarios.usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface usuarioRepository extends JpaRepository<usuarios, Long> {
    UserDetails findByUsername(String username);
}
