package ru.itsjava.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.services.IService;
import ru.itsjava.services.MyService;

@Configuration
public class MeConfiguration {

    @Bean
    @ConditionalOnProperty(name = "create", havingValue = "true")
    public IService myService(){
        return new MyService();
    }
}
