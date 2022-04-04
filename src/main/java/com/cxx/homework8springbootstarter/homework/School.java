package com.cxx.homework8springbootstarter.homework;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class School implements ISchool {
    
    // Resource
    /**
     * 启动的时候，先找到这个class， 然后再装配到class1 上
     */
    @Autowired(required = true) //primary
    Klass class1;
    

    @Override
    public void ding(){
    
        System.out.println("Class1 have " + this.class1.getStudents().size() + " students and one" +
                " is " + this.class1.getStudents().get(0));
        
    }
    
}
