package br.com.fernando.ecommerce.UserUseCaseTest;

import br.com.fernando.ecommerce.BaseTest;
import br.com.fernando.ecommerce.core.address.cep.CepDTO;
import br.com.fernando.ecommerce.core.address.cep.CepService;
import br.com.fernando.ecommerce.core.user.UserAddressDTO;
import br.com.fernando.ecommerce.core.user.UserDTO;
import br.com.fernando.ecommerce.core.user.UserUseCase;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserUseCaseTest extends BaseTest {
    @Autowired
    UserUseCase userUseCase;

    @Autowired
    CepService cepUseCase;

    @Test
    public void save_user_should_work(){
        UserDTO userDTO = UserDTO.builder()
                .name("FERNANDO")
                .email("fpjpro@gmail.com")
                .build();

        userDTO = userUseCase.save(userDTO);
        assertNotNull(userDTO.getId());
    }

    @Test
    public void find_users_should_work(){
        UserDTO userDTO = UserDTO.builder()
                .name("FERNANDO")
                .email("fpjpro@gmail.com")
                .build();

        userDTO = userUseCase.save(userDTO);
        assertNotNull(userDTO.getId());

        userDTO = userUseCase.findById(userDTO.getId());

        assertEquals("FERNANDO", userDTO.getName());
    }

    @Test
    public void queryCep_and_save_address_should_work(){
        UserDTO userDTO = UserDTO.builder()
                .email("fpjpro@gmail.com")
                .build();
        userUseCase.save(userDTO);

        List<UserAddressDTO> userAddressDTOS = userUseCase.findAllAddressByUserEmail(userDTO.getEmail());
        assertEquals(0, userAddressDTOS.size());

        CepDTO cepDTO = cepUseCase.queryCep("89031-300");
        UserAddressDTO addressDTO = UserAddressDTO.builder()
                .addressNumber("740")
                .state(cepDTO.getUf())
                .city(cepDTO.getLocalidade())
                .street(cepDTO.getLogradouro())
                .cep(cepDTO.getCep())
                .district(cepDTO.getBairro())
                .userEmail("fpjpro@gmail.com")
                .build();
        userUseCase.saveAddress(addressDTO);

        cepDTO = cepUseCase.queryCep("89031-490");
        addressDTO = UserAddressDTO.builder()
                .addressNumber("105")
                .state(cepDTO.getUf())
                .city(cepDTO.getLocalidade())
                .street(cepDTO.getLogradouro())
                .cep(cepDTO.getCep())
                .district(cepDTO.getBairro())
                .userEmail("fpjpro@gmail.com")
                .build();
        userUseCase.saveAddress(addressDTO);

        userAddressDTOS = userUseCase.findAllAddressByUserEmail(userDTO.getEmail());
        assertEquals(2, userAddressDTOS.size());

    }

}
