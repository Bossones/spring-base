package ru.bossones.annotation_based.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ru.bossones.annotation_based.MultipleBean;
import ru.bossones.annotation_based.TestThree;
import ru.bossones.annotation_based.TestTwo;

@Configuration
@ComponentScan("ru.bossones.annotation_based")
public class TestConfig {

    @Bean
    public TestTwo testTwo() {
        return new TestTwo();
    }

    @Bean("mainTestThree")
    public TestThree testThree() {
        return new TestThree(4.2);
    }

    @Bean
    @Primary
    TestThree testThreeMain() {
        return new TestThree(5.2);
    }

    @Bean("multiple")
    MultipleBean multipleBean2() {
        return new MultipleBean(2);
    }

    @Bean("multiple")
    MultipleBean multipleBean() {
        return new MultipleBean(5);
    }

    @Bean("non-multiple")
    MultipleBean nonMultiple() {
        return new MultipleBean(3);
    }
}
