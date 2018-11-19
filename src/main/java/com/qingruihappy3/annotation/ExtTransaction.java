package com.qingruihappy3.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 事务注解 设置传播行为
@Target({ ElementType.METHOD })//只在方法上起作用
@Retention(RetentionPolicy.RUNTIME)//运行时的注解
public @interface ExtTransaction {

}
