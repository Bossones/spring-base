package ru.bossones.beanpostprocessors;

import org.springframework.beans.factory.InitializingBean;

public class Testbean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AfterPropertiesSet " + this);
    }

    public int testInt() {
        return 42;
    }
}
