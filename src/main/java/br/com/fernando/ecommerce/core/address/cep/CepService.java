package br.com.fernando.ecommerce.core.address.cep;

import br.com.fernando.ecommerce.core.address.cep.provider.CepProvider;
import br.com.fernando.ecommerce.core.address.cep.provider.CepProviderFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CepService {
    CepProviderFactory cepProviderFactory;

    public CepDTO queryCep(String cep){
        CepProvider cepProvider = cepProviderFactory.getProvider();
        return cepProvider.getCep(cep);
    }
}
