package kgorski.addresses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Main application.
 * 
 * @author kgorski
 */
@SpringBootApplication
@ImportResource("classpath:application-context.xml")
public class Application {
    /**
     * Application entry point.
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
