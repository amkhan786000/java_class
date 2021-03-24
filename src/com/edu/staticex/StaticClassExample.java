package com.edu.staticex;

public class StaticClassExample {
    private int instanceVar=10;
    private static int staticVar=20;

    private String getExample(String name){
        return "I am "+name+" Example and my class value is "+staticVar+ " and my instance variable is "+instanceVar;
    }
    private static String getApplicationName(){
        return "Static Application Test";
    }
    public static void main(String[] args) {
        //System.out.println(staticVar);

        //System.out.println(getApplicationName());

        StaticClassExample example = new StaticClassExample();
        example.instanceVar++;
        System.out.println(example.getExample(""));

        staticVar++;

        StaticClassExample example1 = new StaticClassExample();
        System.out.println(example1.getExample("1"));

        StaticClassExample example2 = new StaticClassExample();
        System.out.println(example2.getExample("2"));
    }
}
