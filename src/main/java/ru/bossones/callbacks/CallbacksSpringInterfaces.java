package ru.bossones.callbacks;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CallbacksSpringInterfaces implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("My work is done! Goodbye! " + this);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Okay, hello InitCallback! " + this);
    }

    public void initMethod() {

    }

    public void destroyMethod() {

    }
}
