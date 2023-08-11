package br.com.fernando.ecommerce.core.address;

import org.springframework.stereotype.Service;

@Service
public class AddressUseCase {
    public AddressDTO save(AddressDTO addressDTO){
        return AddressDTO.builder().build();
    }
}
