package br.com.cardoso.configuration;

import br.com.cardoso.log.CreateCustomLogger;
import org.springframework.context.annotation.Bean;

public class LogConfiguration {

    @Bean
    public CreateCustomLogger createCustomLogger() {
        return new CreateCustomLogger();
    }
}
