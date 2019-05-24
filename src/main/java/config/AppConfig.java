package config;

import entities.Client;
import entities.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.util.Date;

@Configuration
@PropertySource("classpath:client.properties")
public class AppConfig {

    @Autowired
    private Environment environment;

    @Bean
    public Client client() {
        Client client = new Client();
        client.setId(environment.getRequiredProperty("id"));
        client.setFullName(environment.getRequiredProperty("name"));
        client.setGreeting(environment.getProperty("greeting"));
        return client;

    }

    @Bean
    public Date newDate(){
        return newDate();
    }


    @Bean
    public DateFormat dateFormat(){
        return DateFormat.getDateTimeInstance();
    }

    @Bean
    public Event event() {
        return new Event();
    }
}
