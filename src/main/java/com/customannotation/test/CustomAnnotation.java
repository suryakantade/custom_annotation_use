package com.customannotation.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomAnnotation {

    public  String featureName() default  "";
    public boolean isFeatureTurnedOn();
    public int howManyDaysToBeTurnedOn();

}
