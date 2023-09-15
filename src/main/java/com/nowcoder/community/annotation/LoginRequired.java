package com.nowcoder.community.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //此annotation用来描述方法
@Retention(RetentionPolicy.RUNTIME) //此annotation程序运行时有效
public @interface LoginRequired {}
