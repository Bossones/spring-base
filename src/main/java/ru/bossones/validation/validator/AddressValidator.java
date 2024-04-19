package ru.bossones.validation.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ru.bossones.validation.domain.Address;

public class AddressValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Address.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "country", "empty_country");
        ValidationUtils.rejectIfEmpty(errors, "region", "empty_region");
        ValidationUtils.rejectIfEmpty(errors, "city", "empty_city");

        Address address = (Address) target;
        if (address.country().length() > 100) {
            errors.rejectValue("country", "big_country_value_length");
        }

        if (address.city().length() > 100) {
            errors.rejectValue("city", "big_city_value_length");
        }

        if (address.region().length() > 100) {
            errors.rejectValue("region", "big_region_value_length");
        }

        if (address.county().length() > 100) {
            errors.rejectValue("county", "big_county_value_length");
        }
    }
}
