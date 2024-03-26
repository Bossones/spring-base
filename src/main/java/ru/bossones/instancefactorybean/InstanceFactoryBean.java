package ru.bossones.instancefactorybean;

public class InstanceFactoryBean {

    public int test() {
        return 5;
    }

    public static InstanceFactoryBean createInstance() {
        return new InstanceFactoryBean();
    }
}
