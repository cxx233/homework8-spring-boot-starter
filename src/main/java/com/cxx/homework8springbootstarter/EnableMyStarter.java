package com.cxx.homework8springbootstarter;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HomeworkautoConfiguration.class)
public @interface EnableMyStarter {
}
