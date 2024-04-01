package ru.bossones.annotation_based.value.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import ru.bossones.annotation_based.value.annotation.CoffeeShop;

@CoffeeShop(name = "frenchCoffeeShop")
public class FrenchCoffeeShop {

    private final String shopName;

    public FrenchCoffeeShop(@Value("${frenchCoffeeShop.name:Default Qui Bonno}") String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    @PostConstruct
    public void init() {
        System.out.println("Hello, from @PostConstruct annotation!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Good bye!");
    }
}
