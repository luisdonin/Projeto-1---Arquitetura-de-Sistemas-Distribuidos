package br.utpfr.td.tsi.compraapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ConfiguracaoRest {
    @Bean
    public RestClient restClientEmail() {

        return RestClient.builder().baseUrl("http://localhost:8081/").build();
    }

    @Bean
    public RestClient restClientTransacao() {
        return RestClient.builder().baseUrl("http://localhost:8082/").build();
    }

    @Bean
    public RestClient restClientNfe(){
        return RestClient.builder().baseUrl("http://localhost:8083/").build();
    }
    @Bean
    public RestClient restClientEntrega(){
        return RestClient.builder().baseUrl("http://localhost:8084/").build();
    }
}