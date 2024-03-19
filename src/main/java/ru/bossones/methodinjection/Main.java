package ru.bossones.methodinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.util.Objects.nonNull;

public class Main {

    public static void main(String[] args) {
        final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/methodinjection/methodinjection.xml");
        final Singltone singltone = applicationContext.getBean(Singltone.class);

        assert nonNull(singltone);
        singltone.toDoSomething();
        singltone.toDoSomething();
    }
}
