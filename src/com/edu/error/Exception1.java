package com.edu.error;

public class Exception1 {
    private int age;
    public Exception1(int age){
        this.age=age;
    }
    public int getAgeDevidedBy2(){
        return age/2;
    }
    public int get100DevidedByage() {
        try {
            return 100 / age;
        }catch(ArithmeticException ex){
            System.out.println("Exception is here because of some one passed incorrect value as age,"+age);
            return -1;
        }catch(Exception ex){
            return -2;
        }
    }
}
