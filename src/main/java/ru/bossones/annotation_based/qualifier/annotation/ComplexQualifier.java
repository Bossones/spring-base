package ru.bossones.annotation_based.qualifier.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import ru.bossones.annotation_based.qualifier.enums.Format;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface ComplexQualifier {

    String genre();
    Format format();
}
