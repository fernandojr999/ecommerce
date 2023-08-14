package br.com.fernando.ecommerce.core.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserAddressRepository {
    void save(UserAddress userAddress);

    List<UserAddress> findAllByUserEmail(String email);
}
