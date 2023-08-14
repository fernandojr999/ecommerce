package br.com.fernando.ecommerce.core.address.cep.provider;

import br.com.fernando.ecommerce.core.address.cep.CepDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CepProviderPostmon extends CepProvider{

    QueryCepProviderPostmon cepProviderPostmon;

    @Override
    public CepDTO queryCep(String cep) {
        return cepProviderPostmon.queryCep(cep);
    }
}
