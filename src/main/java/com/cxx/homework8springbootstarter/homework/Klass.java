package com.cxx.homework8springbootstarter.homework;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Klass { 
    
    List<Student> students;

    public Klass(Student student) {
        students = new ArrayList<>();
        students.add(student);
    }
    
    public void dong(){
        System.out.println(this.getStudents());
    }
    
}
