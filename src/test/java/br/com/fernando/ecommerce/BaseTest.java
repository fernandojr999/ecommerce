package br.com.fernando.ecommerce;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
public class BaseTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @BeforeEach
    public void setup(){
        jdbcTemplate.execute("delete from user_address;");
        jdbcTemplate.execute("delete from user_ecommerce;");
    }
}
