package com.cxx.homework8springbootstarter;

import com.cxx.homework8springbootstarter.homework.Klass;
import com.cxx.homework8springbootstarter.homework.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

/**
 * @ClassName HomeworkautoConfiguration
 * @author cxx
 * @Date 2022/4/4 10:34
 */
@ComponentScan("com.cxx.homework8springbootstarter.homework")
@Configuration
@EnableConfigurationProperties(Student.class)
@ConditionalOnProperty(prefix = "student", matchIfMissing = true, name = "enable", havingValue =
        "true")
//@Import(Student.class)
public class HomeworkautoConfiguration{

    @Bean
    @Autowired
    public Klass klass(Student student) {
        return new Klass(student);
    }


}
