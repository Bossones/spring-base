package ru.bossones.beanpostprocessors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanpostprocessors/beanpostprocessors.xml");
        Testbean testbean = applicationContext.getBean(Testbean.class);

        assert testbean.testInt() == 42;
    }
}
