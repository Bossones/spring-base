package ru.bossones.validation;

import org.springframework.core.ResolvableType;
import org.springframework.validation.DataBinder;
import ru.bossones.validation.domain.Address;
import ru.bossones.validation.domain.Person;
import ru.bossones.validation.validator.AddressValidator;
import ru.bossones.validation.validator.PersonValidator;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        DataBinder dataBinder = new DataBinder(null);
        dataBinder.setTargetType(ResolvableType.forClass(Address.class));
    }
}
