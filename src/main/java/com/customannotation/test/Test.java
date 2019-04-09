package com.customannotation.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

    @CustomAnnotation(isFeatureTurnedOn = true, howManyDaysToBeTurnedOn = 20,featureName = "CallUser")
    public void checkFeature(){}
    public static  void main(String[] args) {
        Test t= new Test();
        Class c = t.getClass();
        System.out.println("hi");
        for(Method method : c.getMethods()){
            if(method.isAnnotationPresent(CustomAnnotation.class)){
                System.out.println(method.getAnnotation(CustomAnnotation.class).featureName()+" | " +
                        " "+method.getAnnotation(CustomAnnotation.class).isFeatureTurnedOn());
            }
        }
    }
}
