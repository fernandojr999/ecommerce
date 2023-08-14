package br.com.fernando.ecommerce.app.user;

import br.com.fernando.ecommerce.core.user.User;
import br.com.fernando.ecommerce.core.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class UserRepositoryImplementation implements UserRepository {
    UserRepositoryJpa userRepositoryJpa;

    @Override
    public User save(User user) {
        return userRepositoryJpa.save(user);
    }

    @Override
    public Optional<User> findById(UUID userId) {
        return userRepositoryJpa.findById(userId);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepositoryJpa.findByEmail(email);
    }
}
