package br.utpfr.td.tsi.compraapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class EntregaService {
    private final RestClient restClient;


    public EntregaService(RestClient restClientEntrega){
        this.restClient = restClientEntrega;
    }
    public void notificaEntrega(String entrega){
        restClient.post()
                .uri("/entrega")
                .body(entrega)
                .retrieve()
                .body(String.class);
    }
}
