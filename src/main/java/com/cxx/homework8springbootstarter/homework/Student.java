package com.cxx.homework8springbootstarter.homework;


import lombok.*;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;


/**
 * BeanNameAware, ApplicationContextAware
 * 这两个东西 的实现类，被放在spring 容器前，整个初始化过程中，被spring 看到这两个接口，
 * 会调用     void setBeanName(String var1); 和void setApplicationContext(ApplicationContext var1) throws BeansException; 方法，
 * 把当前真实的beanName set 给beanName 属性，以及applicationContext set 给 applicationContext 属性
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ConfigurationProperties(prefix = "student")
public class Student {
    private int id;
    private String name;
}
