package br.com.fernando.ecommerce.core.address.cep.provider;

import br.com.fernando.ecommerce.core.address.cep.CepDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CepProviderViaCEP extends CepProvider{

    QueryCepProviderViaCEP cepProviderViaCEP;

    @Override
    public CepDTO queryCep(String cep) {
        return cepProviderViaCEP.queryCep(cep);
    }
}
