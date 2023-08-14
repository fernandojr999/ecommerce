package br.com.fernando.ecommerce.core.address.cep.provider;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CepProviderFactory {

    @Value("${app.config.cep-provider}")
    private String CEP_PROVIDER;

    private final CepProviderViaCEP cepProviderViaCEP;
    private final CepProviderPostmon cepProviderPostmon;

    public CepProvider getProvider(){
        if (CEP_PROVIDER.equals("VIACEP")){
            return cepProviderViaCEP;
        }

        if (CEP_PROVIDER.equals("POSTMON")){
            return cepProviderPostmon;
        }

        throw new RuntimeException("Faltou configurar o padrão de pesquisa de CEP");
    }
}
