package ru.bossones.annotation_based.value.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import ru.bossones.annotation_based.value.annotation.CoffeeShop;

@CoffeeShop(name = "frenchCoffeeShop")
public record FrenchCoffeeShop(@Value("${frenchCoffeeShop.name:Default Qui Bonno}") String shopName) {

    @PostConstruct
    public void init() {
        System.out.println("Hello, from @PostConstruct annotation!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Good bye!");
    }
}
