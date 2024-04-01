package ru.bossones.annotation_based.qualifier.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ru.bossones.annotation_based.qualifier.MultipleBean;
import ru.bossones.annotation_based.qualifier.TestThree;
import ru.bossones.annotation_based.qualifier.TestTwo;
import ru.bossones.annotation_based.qualifier.annotation.ComplexQualifier;
import ru.bossones.annotation_based.qualifier.enums.Format;

@Configuration
@ComponentScan("ru.bossones.annotation_based.qualifier")
public class TestConfig {

    @Bean
    public TestTwo testTwo() {
        return new TestTwo();
    }

    @Bean("testName")
    @Primary
    public TestThree testThreeMain() {
        return new TestThree(4.2);
    }

    @Bean
    TestThree testThree() {
        return new TestThree(5.2);
    }

    @Bean
    @Qualifier("multiple")
    MultipleBean multipleBean2() {
        return new MultipleBean(2);
    }

    @Bean
    @ComplexQualifier(genre = "Action", format = Format.DVD)
    MultipleBean acitonDvd() {
        return new MultipleBean(5);
    }

    @Bean
    @Qualifier("multiple")
    MultipleBean nonMultiple() {
        return new MultipleBean(3);
    }
}
