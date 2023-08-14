package br.com.fernando.ecommerce.core.address.cep.provider;

import br.com.fernando.ecommerce.core.address.cep.CepDTO;

public abstract class CepProvider {

    public CepDTO getCep(String cep){
        return queryCep(cep);
    }

    public abstract CepDTO queryCep(String cep);
}
