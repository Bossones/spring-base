package ru.bossones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        TestbeanService testBean = applicationContext.getBean(TestbeanService.class);
        System.out.println(testBean.sum());
    }
}