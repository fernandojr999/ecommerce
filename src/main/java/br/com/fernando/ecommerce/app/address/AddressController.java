package br.com.fernando.ecommerce.app.address;

import br.com.fernando.ecommerce.core.address.cep.CepDTO;
import br.com.fernando.ecommerce.core.address.cep.CepUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
@AllArgsConstructor
public class AddressController {
    CepUseCase cepUseCase;

    @GetMapping("/query-cep/{cep}")
    public CepDTO queryCep(@RequestParam String cep){
        return cepUseCase.queryCep(cep);
    }
}
