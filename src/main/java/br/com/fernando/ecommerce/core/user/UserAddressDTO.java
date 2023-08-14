package br.com.fernando.ecommerce.core.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAddressDTO {
    private String userEmail;

    private String cep;
    private String state;
    private String city;
    private String district;
    private String street;
    private String addressNumber;

    public UserAddressDTO(UserAddress userAddress){
        this.userEmail = userAddress.getUser().getEmail();
        this.cep = userAddress.getCep();
        this.state = userAddress.getState();
        this.city = userAddress.getCity();
        this.district = userAddress.getDistrict();
        this.street = userAddress.getStreet();
        this.addressNumber = userAddress.getAddressNumber();
    }
}
