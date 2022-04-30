package org.example;

public class Student extends Person {
    int course;

    public Student (int height, String phrase, int course){
        super(height, phrase);
        this.course = course;
    }

    void tell (){
        System.out.println(super.phrase);
        System.out.println(super.height);
        System.out.println(course);
    }
}
