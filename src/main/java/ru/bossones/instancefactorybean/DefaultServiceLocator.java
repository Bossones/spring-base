package ru.bossones.instancefactorybean;

import static java.util.Objects.isNull;

public class DefaultServiceLocator {

    private static InstanceFactoryBean instanceFactoryBean = null;

    public InstanceFactoryBean createInstance() {
        return isNull(instanceFactoryBean) ? instanceFactoryBean = new InstanceFactoryBean() : instanceFactoryBean;
    }
}
