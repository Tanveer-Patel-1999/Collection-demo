package com.demo;

import lombok.*;

//public class Student implements Comparable<Student> {
//@Getter
//@Setter
//@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Student {


    private String name;
    private int id;
    private String mail;

/*
    //important sorting using id
    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mail='" + mail + '\'' +
                '}';
    }

*/
}




