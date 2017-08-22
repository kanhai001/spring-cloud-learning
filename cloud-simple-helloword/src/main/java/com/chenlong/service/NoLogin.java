package com.chenlong.service;

import java.lang.annotation.*;

/**
 * Created by chenlong on 2017/8/17.
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NoLogin {
}
