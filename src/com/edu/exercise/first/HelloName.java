package com.edu.exercise.first;

import java.util.Scanner;

public class HelloName {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name= sc.nextLine();
        System.out.println("Hello"+"\n"+name);
    }
}
