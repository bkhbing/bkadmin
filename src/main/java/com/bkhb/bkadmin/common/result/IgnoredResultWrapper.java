package com.bkhb.bkadmin.common.result;


import java.lang.annotation.*;

/**
 * 不装饰controller相应
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface IgnoredResultWrapper {
}
