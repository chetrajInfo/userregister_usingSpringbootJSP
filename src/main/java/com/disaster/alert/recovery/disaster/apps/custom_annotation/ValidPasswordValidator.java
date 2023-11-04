package com.disaster.alert.recovery.disaster.apps.custom_annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPasswordValidator implements ConstraintValidator<ValidPassword, String> {

    /* This code below is without using enum data type but it gives same functionality


    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]).*$";
    @Override
    public void initialize(ValidPassword constraintAnnotation){

    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context){
        if(password == null){
            return false;
        }
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    */


    //Below is same functionality using Enum Data type

    @Override
    public void initialize(ValidPassword constraintAnnotation){

    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context){
        if(password == null){
            return false;
        }
        Pattern pattern = Pattern.compile(ValidationPatterns.PASSWORD_PATTERN.getPattern());
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
