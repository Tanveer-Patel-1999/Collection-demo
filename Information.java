package com.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Information<students> {
    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();
        students.add(new Student("Tanveer",12,"tas@123"));
        students.add(new Student("anik",2,"anik@321"));
        students.add(new Student("asif",3,"asif@321"));
        System.out.println(students);

        //comparable
     /*   Collections.sort(students);
        System.out.println(students);*/

        //comparator
        Collections.sort(students,new  IdComparator());
        System.out.println(students);

        List<Student> students1 = new ArrayList<>(students);
        Collections.sort(students1,new NameComparator());
    }


}
