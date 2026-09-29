package br.utpfr.td.tsi.compraapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class TransacaoService {
    public final RestClient restClient;

    public TransacaoService(RestClient restClientTransacao) {
        this.restClient = restClientTransacao;
    }

    public void executaTransacao(String transacao) {
        restClient.post()
                .uri("/transacao")
                .body(transacao)
                .retrieve()
                .body(String.class);

    }
}
