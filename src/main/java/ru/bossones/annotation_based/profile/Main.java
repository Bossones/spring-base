package ru.bossones.annotation_based.profile;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.bossones.annotation_based.profile.beans.User;
import ru.bossones.annotation_based.profile.config.ProfileConfig;

public class Main {

    public static void main(String[] args) {
        noProfiles();
        maleProfiles();
        femaleProfiles();
        twoProfiles();
    }

    private static void noProfiles() {
        var context = new AnnotationConfigApplicationContext(ProfileConfig.class);

        try {
            var user = context.getBean(User.class);
            throw new IllegalCallerException("test no passed");
        } catch (NoSuchBeanDefinitionException exception) {
            System.out.println("Test Passed");
            context.registerShutdownHook();
        }
    }

    private static void maleProfiles() {
        var context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("male");
        context.register(ProfileConfig.class);
        context.refresh();

        var male = context.getBean(User.class);
        System.out.println(male);
        assert male.age() == 42;
        assert male.gender();
        assert male.name().equals("John");
        assert male.surname().equals("Wick");
        context.registerShutdownHook();
    }

    private static void femaleProfiles() {
        var context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("female");
        context.register(ProfileConfig.class);
        context.refresh();

        var female = context.getBean(User.class);
        System.out.println(female);
        assert female.age() == 23;
        assert !female.gender();
        assert female.name().equals("Felicia");
        assert female.surname().equals("Patrick");
        context.registerShutdownHook();
    }

    private static void twoProfiles() {
        var context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("female", "male");
        context.register(ProfileConfig.class);
        context.refresh();

        System.out.println("--------------TWO PROFILES----------------");
        var userProvider = context.getBeanProvider(User.class);
        userProvider.stream().forEach(System.out::println);
    }
}
