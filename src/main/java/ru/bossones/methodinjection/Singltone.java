package ru.bossones.methodinjection;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Singltone implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void toDoSomething() {
        Prototype prototype = applicationContext.getBean(Prototype.class);
        System.out.println(prototype);
    }
}
