package br.com.fernando.ecommerce.core.address.cep.provider;

import br.com.fernando.ecommerce.core.address.cep.CepDTO;

public interface QueryCepProviderViaCEP {
    CepDTO queryCep(String cep);
}
