package br.utpfr.td.tsi.transacaoapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class TransacaoService {
    public final RestClient restClient;

    public TransacaoService(RestClient restClient) {
        this.restClient = restClient;
    }

    public void executaTransacao(String transacao) {
        restClient.post()
                .uri("/transacao")
                .body(transacao)
                .retrieve()
                .body(String.class);

    }
}
