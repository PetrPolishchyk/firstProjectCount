package org.example;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {
       // System.out.println("Hello world, I am back!");
        System.out.print("Hello World");
        System.out.println(", how are you?");
        System.out.println("Do you like mountains?");
        byte num = 12;
        int number = 2985574;
        float f = 12.88f;
        boolean trust = true;
        char loop = 'H';
        String button = "Hello again!";

        //System.out.println(num);
        //System.out.println(number);
        //System.out.println(button);

        //Scanner str = new Scanner(System.in);
        //System.out.println("Your string is:" + str.nextLine());

        Scanner numb = new Scanner(System.in);
        int first, second;
        float result;
        System.out.println("Enter first number, please: ");
        first = numb.nextInt();
        System.out.println("Enter second number, please: ");
        second = numb.nextInt();
        result = first + second;
        result /= 2;
        System.out.println("Your summ is : " + result);
        
    }
}