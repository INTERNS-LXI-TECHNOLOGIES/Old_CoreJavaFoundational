package com.lxisoft.quizapp.repository.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ForeignKey {

    public String table();
    public String column();

}

