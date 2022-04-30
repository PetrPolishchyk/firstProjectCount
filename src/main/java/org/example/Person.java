package org.example;

public class Person {
    public int height = 180;
    public String phrase = "Default name";
    public int weight = 80;
    public void sayName (String name){
        System.out.println("Hello, " + name);
    }
    //constructor
    public Person (int h, String n){
        height = h;
        phrase = n;
    }
    public Person(){}
    public Person (int h){
        height = h;
    }

}
