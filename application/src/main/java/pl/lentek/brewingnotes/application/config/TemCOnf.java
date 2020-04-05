package pl.lentek.brewingnotes.application.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {
    "pl.lentek.brewingnotes.batches"
})
@EntityScan(basePackages = {
    "pl.lentek.brewingnotes.batches.domain"
})
@EnableJpaRepositories(basePackages = {
    "pl.lentek.brewingnotes.batches.domain"
}, repositoryBaseClass = JpaRepository.class)
public class TemCOnf {
}
