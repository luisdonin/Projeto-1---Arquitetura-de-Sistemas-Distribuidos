package br.utpfr.td.tsi.nfeapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ConfiguracaoRest {
    @Bean
    public RestClient restClient() {
        return RestClient.builder().baseUrl("http://localhost:8080").build();
    }
    @Bean
    public RestClient restClientNfe(){
        return RestClient.builder().baseUrl("http://localhost:8082").build();
    }
    @Bean
    public RestClient restClientEmail() {
        return RestClient.builder().baseUrl("http://localhost:8081/").build();
    }
}