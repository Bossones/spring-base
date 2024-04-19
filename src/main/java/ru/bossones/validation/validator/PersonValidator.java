package ru.bossones.validation.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ru.bossones.validation.domain.Address;
import ru.bossones.validation.domain.Person;

import static java.util.Objects.isNull;

public class PersonValidator implements Validator {

    private final Validator addressValidator;

    public PersonValidator(Validator addressValidator) {
        if (isNull(addressValidator)) {
            throw new IllegalArgumentException("The supplied [Validator] must not be null");
        }
        if (!addressValidator.supports(Address.class)) {
            throw new IllegalArgumentException("The supplied [Validator] has to support the validation of [Address] instances");
        }
        this.addressValidator = addressValidator;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.empty");
        Person p = (Person) target;

        try {
            errors.pushNestedPath("address");
            ValidationUtils.invokeValidator(addressValidator, p.address(), errors);
        } finally {
            errors.popNestedPath();
        }
    }

}
