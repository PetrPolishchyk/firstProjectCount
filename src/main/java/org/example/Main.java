package org.example;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {
       // System.out.println("Hello world, I am back!");
        System.out.println("Hello World");
 /*
        System.out.println(", how are you?");
        System.out.println("Do you like mountains?");
        byte num = 12;
        int number = 2985574;
        float f = 12.88f;
        boolean trust = true;
        char loop = 'H';
        String button = "Hello again!";

        System.out.println(num);
        System.out.println(number);
        System.out.println(button);*/

        //Scanner str = new Scanner(System.in);
        //System.out.println("Your string is:" + str.nextLine());

/*
        Scanner numb = new Scanner(System.in);
        int first, second;
        float result;
        System.out.println("Enter first number, please: ");
        first = numb.nextInt();
        System.out.println("Enter second number, please: ");
        second = numb.nextInt();
        result = first + second;
        result /= 2;
        System.out.println("Your result is : " + result);*/
/*
        //if constructor
        Scanner operator = new Scanner(System.in);
        int oneNum, twoNum;
        System.out.println("Enter first number:");
        oneNum = operator.nextInt();
        System.out.println("Enter second number:");
        twoNum = operator.nextInt();
        if (oneNum > twoNum) {
            System.out.println("First number is bigger than second number");
        } else if (oneNum < twoNum) {
            System.out.println("First number is lower than second number");
        } else System.out.println("First number is equal with second number");

        //System.out.print("\n");

        switch (oneNum) {
            case  1000:
                System.out.println("Your first number is 1000");
                break;
            case  2000:
                System.out.println("Your first number is 2000");
                break;
            case  3000:
                System.out.println("Your first number is 3000");
                break;
            default:
                System.out.println("Your first number is not in 1000, 2000, 3000");
        }
 */
 /*
        //for circle
        Scanner book = new Scanner(System.in);
        int m, n;
        System.out.println("Enter the first number of circle");
        m = book.nextInt();
        System.out.println("Enter the second number of circle");
        n = book.nextInt();
        for (int i = m, k = n; i <= k; i++) {
            if (i < k) {
            System.out.print(i + ",");
        } else System.out.print(i + ".");
        }
        System.out.print("\n");
        //while circle
        int j = 10;
        while (j <= 20) {
            if (j < 20) {
            System.out.print(j + ",");
        } else System.out.print(j + ".");
            j += 2;
    }
        System.out.print("\n");
        //do while
        boolean isTrue = true;
        do {
            System.out.println(isTrue);
        } while (isTrue = false);

        for (int x = 0; x <= 30; x +=5){
            if (x < 25) {
                System.out.println(x);
            } else {
                System.out.println("x can't to be more than 20");
                break;
            }
        }
*/
/*
        //Array
        int[] name = new int[3];
        name[0] = 10;
        name[1] = 20;
        name[2] = 30;

        int[] name2 = new int[] {25, 74, 120, 511, 877};
        System.out.println(name2[3]);

        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of array: ");
        n = sc.nextInt();
        a = new int [n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        char[][] array = new char[3][3];
        array[0][0] = 'C';
        array[0][1] = 'B';
        array[0][2] = 'A';
 */
        //functions
        int temp = func(3, 4);
        System.out.println(temp);
        readArray();
        }
        public static int func (int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++){
            result *= a;
        }
        return result;
        }

        public static int[] readArray (){
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        return arr;
        }

}