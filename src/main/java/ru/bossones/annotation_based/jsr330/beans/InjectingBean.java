package ru.bossones.annotation_based.jsr330.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("testInjectingBean")
public record InjectingBean(@Value("2") int x, @Value("3") int y) {
}
