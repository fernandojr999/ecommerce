package br.com.fernando.ecommerce.app.user;

import br.com.fernando.ecommerce.core.user.UserAddress;
import br.com.fernando.ecommerce.core.user.UserAddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class UserAddressRepositoryImplementation implements UserAddressRepository {
    UserAddressRepositoryJpa userAddressRepositoryJpa;
    @Override
    public void save(UserAddress userAddress) {
        userAddressRepositoryJpa.save(userAddress);
    }

    @Override
    public List<UserAddress> findAllByUserEmail(String email) {
        return userAddressRepositoryJpa.findAllByUserEmail(email);
    }
}
