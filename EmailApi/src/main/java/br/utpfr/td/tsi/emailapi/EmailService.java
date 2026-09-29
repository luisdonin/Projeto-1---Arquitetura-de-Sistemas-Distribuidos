package br.utpfr.td.tsi.emailapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class EmailService {
    private final RestClient restClient;

    public EmailService(RestClient restClient) {
        this.restClient = restClient;
    }

}
