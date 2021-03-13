package com.edu.exercise.first;

public class ArthOperatorMethod {
    public static void main(String[]args){
        add(2,6);
        sub(10,5);
        mult(10,10);
        divide(10,2);
        mod(10,2);

    }

    public static void add(int a,int b){
        System.out.println(a+b);

    }
    public static void sub(int a,int b){
        System.out.println(a-b);

    }
    public static void mult(int a,int b){
        System.out.println(a*b);

    }
    public static void divide(int a,int b){
        System.out.println(a/b);

    }
    public static void mod(int a,int b){
        System.out.println(a%b);

    }
}
