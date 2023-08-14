package br.com.fernando.ecommerce.app.user;

import br.com.fernando.ecommerce.core.user.UserAddressDTO;
import br.com.fernando.ecommerce.core.user.UserDTO;
import br.com.fernando.ecommerce.core.user.UserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UserController {

    UserUseCase userUseCase;

    @PostMapping
    public UserDTO save(@RequestBody UserDTO userDTO){
        return userUseCase.save(userDTO);
    }

    @PostMapping("/address")
    public void saveAddress(@RequestBody UserAddressDTO addressDTO){
        userUseCase.saveAddress(addressDTO);
    }

    @GetMapping("/address")
    public List<UserAddressDTO> findByUserEmail(@RequestParam String email){
        return userUseCase.findAllAddressByUserEmail(email);
    }
}
