package ru.bossones.annotation_based.profile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.bossones.annotation_based.profile.annotations.Female;
import ru.bossones.annotation_based.profile.annotations.Male;
import ru.bossones.annotation_based.profile.beans.User;

@Configuration
@ComponentScan("ru.bossones.annotation_based.profile")
public class ProfileConfig {


    @Bean
    @Male
    public User male() {
        return new User("John", "Wick", (short)42, true);
    }

    @Bean
    @Female
    public User female() {
        return new User("Felicia", "Patrick", (short)23, false);
    }
}
