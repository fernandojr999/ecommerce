package br.com.fernando.ecommerce.core.address;

import br.com.fernando.ecommerce.core.BaseEntity;
import jakarta.persistence.Entity;

@Entity
public class Address extends BaseEntity {
    private String zipCode;
    private String city;
    private String state;
    private String district;
    private String street;
    private String addressNumber;
    private String complement;
}
