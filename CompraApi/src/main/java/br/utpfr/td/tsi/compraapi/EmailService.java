package br.utpfr.td.tsi.compraapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class EmailService {
    private final RestClient restClient;

    public EmailService(RestClient restClientEmail) {
        this.restClient = restClientEmail;
    }

    public void sendEmail(String email) {
        restClient.post()
                .uri("/email")
                .body(email)
                .retrieve()
                .body(String.class);
    }


}
