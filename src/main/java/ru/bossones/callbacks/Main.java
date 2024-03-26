package ru.bossones.callbacks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("callbacks/callbacks.xml");

        applicationContext.getBean(CallbacksInitMethod.class);
//        applicationContext.getBean(CallbacksSpringInterfaces.class);

        applicationContext.refresh();
    }
}
