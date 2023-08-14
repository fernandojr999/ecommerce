package br.com.fernando.ecommerce.cepServiceTest;

import br.com.fernando.ecommerce.core.address.cep.CepDTO;
import br.com.fernando.ecommerce.core.address.cep.CepService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CepServiceTest {

    @Autowired
    CepService cepUseCase;

    @Test
    public void queryCep_VIACEP_should_return_address_information(){
        CepDTO cepDTO = cepUseCase.queryCep("89031490");

        assertEquals(cepDTO.getCep(), "89031-490");
        assertEquals(cepDTO.getLogradouro(), "Rua Theodoro Lueders");
    }

    @Test
    public void queryCep_POSTMON_should_return_address_information(){
        CepDTO cepDTO = cepUseCase.queryCep("89031490");

        assertEquals(cepDTO.getCep(), "89031-490");
        assertEquals(cepDTO.getLogradouro(), "Rua Theodoro Lueders");
    }



}
