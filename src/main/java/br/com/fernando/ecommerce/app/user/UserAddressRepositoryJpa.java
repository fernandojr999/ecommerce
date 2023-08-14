package br.com.fernando.ecommerce.app.user;

import br.com.fernando.ecommerce.core.user.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface UserAddressRepositoryJpa extends JpaRepository<UserAddress, UUID> {

    @Query("""
            SELECT ua
            FROM UserAddress ua
            INNER JOIN User u on u.id = ua.user.id
            WHERE u.email = :email
            """)
    List<UserAddress> findAllByUserEmail(String email);
}
