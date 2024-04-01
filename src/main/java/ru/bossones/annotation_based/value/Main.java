package ru.bossones.annotation_based.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import ru.bossones.annotation_based.value.beans.FrenchCoffeeShop;
import ru.bossones.annotation_based.value.config.ValueConfig;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(ValueConfig.class);

        var frenchCoffeeShop = applicationContext.getBean("frenchCoffeeShop", FrenchCoffeeShop.class);

        System.out.println(frenchCoffeeShop.getShopName());
    }
}
