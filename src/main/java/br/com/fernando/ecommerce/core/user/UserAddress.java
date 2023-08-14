package br.com.fernando.ecommerce.core.user;

import br.com.fernando.ecommerce.core.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "user_address")
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress extends BaseEntity {

    @ManyToOne
    private User user;

    private String street;
    private String addressNumber;
    private String district;
    private String city;
    private String state;
    private String cep;
}
