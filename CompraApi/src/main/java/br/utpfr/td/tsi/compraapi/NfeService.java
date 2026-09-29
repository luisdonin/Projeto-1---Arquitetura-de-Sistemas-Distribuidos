package br.utpfr.td.tsi.compraapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class NfeService {
    private final RestClient restClient;

    public NfeService(RestClient restClientNfe) {
        this.restClient = restClientNfe;
    }

    public void geraNfe(String nfe){
        restClient.post()
                .uri("/nfe")
                .body(nfe)
                .retrieve()
                .body(String.class);
    }

}
