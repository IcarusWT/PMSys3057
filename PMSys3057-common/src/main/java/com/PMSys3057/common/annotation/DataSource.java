package com.PMSys3057.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import com.PMSys3057.common.enums.DataSourceType;

// 自定义多数据源切换注解
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource
{
    public DataSourceType value() default DataSourceType.MASTER;        // 换数据源名称
}
