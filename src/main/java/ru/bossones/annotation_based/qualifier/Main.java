package ru.bossones.annotation_based.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.bossones.annotation_based.qualifier.config.TestConfig;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfig.class);

        TestClass testClass = applicationContext.getBean(TestClass.class);
        ResourceTestClass resourceTestClass = applicationContext.getBean(ResourceTestClass.class);
//        System.out.println(testClass.getTestThree().a());
//        testClass.getMultipleBeans().forEach(multipleBean -> System.out.println(multipleBean.getX()));
//        for (MultipleBean multipleBean: testClass.getObjectProvider()) {
//            System.out.println(multipleBean.getX());
//        }
        System.out.println(resourceTestClass.getTestThree().a());
    }
}
