package br.com.fernando.ecommerce.app.address;

import br.com.fernando.ecommerce.core.address.cep.CepDTO;
import br.com.fernando.ecommerce.core.address.cep.provider.QueryCepProviderViaCEP;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QueryCepProviderViaCEPImpl implements QueryCepProviderViaCEP {
    private RestTemplate restTemplate = new RestTemplate();

    private final String URL_TEMPLATE = "https://viacep.com.br/ws/%s/json/";

    @Override
    public CepDTO queryCep(String cep) {
        String apiUrl = String.format(URL_TEMPLATE, cep);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<?> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<CepDTO> response = restTemplate.exchange(apiUrl, HttpMethod.GET, requestEntity, CepDTO.class);

        if (response.getStatusCode() == HttpStatus.OK && response.getBody() != null) {
            return response.getBody();
        } else {
            return null;
        }
    }
}
