package ru.bossones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ru.bossones")
public class Config {
    public record TestBean(int x, int y) {}

    @Bean
    public TestBean testBean() {
        return new TestBean(5, 6);
    }
}
