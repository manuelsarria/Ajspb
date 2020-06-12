package net.java.microservices.users.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;


/**
 * Generate a bean of RestOperation Interface.
 * @author Victor sarria
 *
 */
@Configuration
public class RestConfiguration {

    @Bean
    public RestOperations restOperations (){
        return new RestTemplate();
    }
   
 
}
