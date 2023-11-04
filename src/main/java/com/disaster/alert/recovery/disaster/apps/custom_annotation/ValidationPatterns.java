package com.disaster.alert.recovery.disaster.apps.custom_annotation;

public enum ValidationPatterns {
PASSWORD_PATTERN("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]).*$");

private final String pattern;

ValidationPatterns(String pattern){
    this.pattern = pattern;

}

public String getPattern(){
    return pattern;
}


}
