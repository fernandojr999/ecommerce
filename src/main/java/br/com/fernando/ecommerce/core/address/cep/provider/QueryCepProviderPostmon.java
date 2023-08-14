package br.com.fernando.ecommerce.core.address.cep.provider;

import br.com.fernando.ecommerce.core.address.cep.CepDTO;

public interface QueryCepProviderPostmon {
    CepDTO queryCep(String cep);
}
