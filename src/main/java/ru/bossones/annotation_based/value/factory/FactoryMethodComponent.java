package ru.bossones.annotation_based.value.factory;

import org.springframework.stereotype.Component;

@Component
public class FactoryMethodComponent {

    // Why can't I do that in the config class?
    // If I'll declare code like in the example below,
    // I get an exception "Spring context cannot define a bean with name "frenchCoffeeShop".
//    @Bean
//    public FrenchCoffeeShop frenchCoffeeShop(
//        @Value("#{testCoffeeShop.shopName}") final String name
//    ) {
//        return new FrenchCoffeeShop(name);
//    }
//
//    @Bean
//    private FrenchCoffeeShop testCoffeeShop(Environment environment) {
//        return new FrenchCoffeeShop(environment.getProperty("frenchCoffeeShop.name"));
//    }
}
