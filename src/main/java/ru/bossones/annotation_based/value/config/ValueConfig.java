package ru.bossones.annotation_based.value.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import ru.bossones.annotation_based.value.beans.BeanOne;
import ru.bossones.annotation_based.value.beans.BeanTwo;

@Configuration
@ComponentScan("ru.bossones.annotation_based.value")
@PropertySource("classpath:application.properties")
public class ValueConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public BeanOne beanOne() {
        return new BeanOne(2);
    }

    @Bean
    public BeanTwo beanTwo() {
        return new BeanTwo(beanOne());
    }
}
