package ru.bossones.instancefactorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("instanceFactoryConf/instanceFactoryBeanConf.xml");
        InstanceFactoryBean instanceFactoryBean = applicationContext.getBean(InstanceFactoryBean.class);

        assert instanceFactoryBean.test() == 5;
    }
}
