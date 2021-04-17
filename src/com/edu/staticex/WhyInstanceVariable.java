package com.edu.staticex;

public class WhyInstanceVariable {
    private int age;
    private static int birthYear=100;
    public WhyInstanceVariable(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        WhyInstanceVariable w1 = new WhyInstanceVariable(10);
        w1.age++;
        System.out.println(w1.age);
        w1.birthYear++;
        System.out.println(w1.birthYear);
        WhyInstanceVariable w2 = new WhyInstanceVariable(20);
        System.out.println(w2.age);
        System.out.println(w2.birthYear);
        WhyInstanceVariable w3 = new WhyInstanceVariable(30);
        System.out.println(w3.age);
        System.out.println(w3.birthYear);

    }
}
