package ru.bossones.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.util.Objects.nonNull;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dependencyInjection/dependencyInjectionConf.xml");
        ThingOne thingOne = applicationContext.getBean(ThingOne.class);

        assert nonNull(thingOne);
        assert nonNull(thingOne.thingTwo());
        assert nonNull(thingOne.thingThree());

        SimpleTypeConstructor simpleTypeConstructor = applicationContext.getBean(SimpleTypeConstructor.class);

        assert simpleTypeConstructor.simpleTypeString().equals("test");
        assert simpleTypeConstructor.simpleTypeInt() == 42;

        SetterDi setterDi = applicationContext.getBean(SetterDi.class);

        assert setterDi.getIntSetter() == 1;

        ConstructorDiWithSameArgs constructorDiWithSameArgs = applicationContext.getBean(ConstructorDiWithSameArgs.class);
        assert constructorDiWithSameArgs.getA().equals("1");
        assert constructorDiWithSameArgs.getB() == 2;

        CollectionsDi collectionsDi = applicationContext.getBean(CollectionsDi.class);

        assert collectionsDi.stringList().contains("str1");
        System.out.println(collectionsDi);
    }
}
