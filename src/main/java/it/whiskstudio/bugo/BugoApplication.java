package it.whiskstudio.bugo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("it.whiskstudio.bugo.repo")
@EntityScan("it.whiskstudio.bugo.model")
@SpringBootApplication
public class BugoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BugoApplication.class, args);
    }

}
