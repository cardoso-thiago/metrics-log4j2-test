package br.com.cardoso.configuration;

import io.micrometer.core.instrument.binder.logging.Log4j2Metrics;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

public class LogMetricsConfiguration {

    //Se a criação do bean 'createCustomLogger' for comentada, esse conjunto de condições
    //faz com que não estoure erro na inicialização e faz com que o bean 'Log4j2Metrics' do
    //'Log4J2MetricsAutoConfiguration' seja criado no lugar. Se o bean existir, o conjunto de
    //condições também garante que esse bean só seja criado depois do 'createCustomLogger'.
    @Bean
    @ConditionalOnBean(name = "createCustomLogger")
    @DependsOn("createCustomLogger")
    public Log4j2Metrics log4j2Metrics() {
        return new Log4j2Metrics();
    }
}
