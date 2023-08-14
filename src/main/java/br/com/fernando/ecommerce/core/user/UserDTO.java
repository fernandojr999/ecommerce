package br.com.fernando.ecommerce.core.user;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class UserDTO {
    private UUID id;
    private String name;
    private String email;

    public static UserDTO fromUser(User user){
        return UserDTO.builder()
                .email(user.getEmail())
                .name(user.getName())
                .id(user.getId())
                .build();
    }
}


