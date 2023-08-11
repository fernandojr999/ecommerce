package br.com.fernando.ecommerce.core.address.cep;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CepUseCase {
    QueryCepProvider queryCepProvider;

    public CepDTO queryCep(String cep){
        return queryCepProvider.queryCep(cep);
    }
}
