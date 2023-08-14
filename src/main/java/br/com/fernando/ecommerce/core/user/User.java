package br.com.fernando.ecommerce.core.user;

import br.com.fernando.ecommerce.core.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@SuperBuilder
@Table(name = "user_ecommerce")
@NoArgsConstructor
public class User extends BaseEntity {
    private String name;
    private String email;

    public static User fromUserDto(UserDTO userDTO){
        return User.builder()
                .email(userDTO.getEmail())
                .name(userDTO.getName())
                .id(userDTO.getId())
                .build();
    }
}
