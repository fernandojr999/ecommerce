package br.com.fernando.ecommerce.app.address;

import br.com.fernando.ecommerce.core.address.cep.CepDTO;
import br.com.fernando.ecommerce.core.address.cep.CepService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
@AllArgsConstructor
public class AddressController {
    CepService cepUseCase;

    @GetMapping("/query-cep/{cep}")
    public CepDTO queryCep(@PathVariable String cep){
        return cepUseCase.queryCep(cep);
    }
}
