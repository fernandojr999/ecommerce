package br.com.fernando.ecommerce.core.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserUseCase {
    UserRepository userRepository;
    UserAddressRepository userAddressRepository;

    public UserDTO save(UserDTO userDTO){
        User user = User.fromUserDto(userDTO);
        userRepository.save(user);

        return UserDTO.fromUser(user);
    }

    public UserDTO findById(UUID userId){
        Optional<User> userOptional = userRepository.findById(userId);
        User user = userOptional.orElseThrow(()-> new RuntimeException("Usuário não localizado"));

        return UserDTO.fromUser(userRepository.findById(userId).orElseThrow());
    }

    public void saveAddress(UserAddressDTO addressDTO){
        User user = userRepository.findByEmail(addressDTO.getUserEmail()).orElseThrow();

        UserAddress userAddress = UserAddress.builder()
                .user(user)
                .state(addressDTO.getState())
                .city(addressDTO.getCity())
                .district(addressDTO.getDistrict())
                .street(addressDTO.getStreet())
                .addressNumber(addressDTO.getAddressNumber())
                .cep(addressDTO.getCep())
                .build();

        userAddressRepository.save(userAddress);
    }

    public List<UserAddressDTO> findAllAddressByUserEmail(String email){
        return userAddressRepository.findAllByUserEmail(email).stream().map(UserAddressDTO::new).toList();
    }

}
