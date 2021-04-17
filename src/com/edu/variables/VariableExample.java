package com.edu.variables;

public class VariableExample {

    private static int staticVar=10;
    private final int finalVar=20;
    private int instanceVar=0;
    private final static  int finalStaticVar=30;

    public static void main(String[] args) {
        staticVar=staticVar+1;
    }
}
