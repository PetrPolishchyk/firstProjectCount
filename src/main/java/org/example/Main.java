package org.example;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {

        }

        //functions
        public static int func1 (int a, int b) {
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
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
        }
        //reload functions
        public static int summ (int a, int b){
        return a + b;
        }
        public static int summ (int a, int b, int g){
        return a + b + g;
        }
        public static float summ (float a, float b){
        return a + b;
        }


}