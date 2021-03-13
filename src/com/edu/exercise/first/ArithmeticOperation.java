package com.edu.exercise.first;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[]args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = sc.nextInt();
        System.out.println("Enter secound number");
        int sec = sc.nextInt();
        int c=first+sec;
        int c1=first-sec;
        int c2=first*sec;
        int c3=first/sec;
        int c4=first%sec;
        System.out.println(first+"+"+sec+"="+c);
        System.out.println(first+"-"+sec+"="+c1);
        System.out.println(first+"*"+sec+"="+c2);
        System.out.println(first+"/"+sec+"="+c3);
        System.out.println(first+"%"+sec+"="+c4);



    }
}
