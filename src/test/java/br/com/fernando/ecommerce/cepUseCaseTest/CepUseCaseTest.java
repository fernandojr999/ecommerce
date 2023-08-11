package br.com.fernando.ecommerce.cepUseCaseTest;

import br.com.fernando.ecommerce.core.address.cep.CepDTO;
import br.com.fernando.ecommerce.core.address.cep.CepUseCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CepUseCaseTest {

    @Autowired
    CepUseCase cepUseCase;

    @Test
    public void queryCep_should_return_address_information(){
        CepDTO cepDTO = cepUseCase.queryCep("89031490");

        assertEquals(cepDTO.getCep(), "89031-490");
        assertEquals(cepDTO.getLogradouro(), "Rua Theodoro Lueders");


/*{
  "cep": "89031-490",
  "logradouro": "Rua Theodoro Lueders",
  "complemento": "",
  "bairro": "Escola Agrícola",
  "localidade": "Blumenau",
  "uf": "SC",
  "ibge": "4202404",
  "gia": "",
  "ddd": "47",
  "siafi": "8047"
}*/
    }
}
