package ru.bossones.annotation_based.jsr330;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.bossones.annotation_based.jsr330.beans.TestBean;
import ru.bossones.annotation_based.jsr330.config.Config;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var testBean = context.getBean(TestBean.class);

        System.out.println(testBean.getInjectingBean().x());
    }
}
