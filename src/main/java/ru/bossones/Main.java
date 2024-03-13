package ru.bossones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("core.xml");
        TestbeanService testBean = applicationContext.getBean("testBeanServiceId", TestbeanService.class);
        System.out.println(testBean.sum());
    }
}