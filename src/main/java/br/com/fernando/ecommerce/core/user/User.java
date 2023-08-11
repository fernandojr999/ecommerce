package br.com.fernando.ecommerce.core.user;

import br.com.fernando.ecommerce.core.BaseEntity;
import jakarta.persistence.Entity;

@Entity
public class User extends BaseEntity {
    private String name;
    private String email;
}
