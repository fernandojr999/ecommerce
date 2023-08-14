package br.com.fernando.ecommerce.app.user;

import br.com.fernando.ecommerce.core.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepositoryJpa extends JpaRepository<User, UUID> {
    User save(User user);

    Optional<User> findByEmail(String email);
}
