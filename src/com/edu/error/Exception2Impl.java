package com.edu.error;

public class Exception2Impl {
    public static void main(String[] args) {
        String name="";
        Exception2 exception21 = new Exception2(name);
        try {
            System.out.println(exception21.getUpperCaseName());
        }catch (NullStringException ex){
            System.out.println("Sorry you passed null value:"+name+". Exception Message:"+ex.getMessage());
        }catch (EmptyStringException ex){
            System.out.println("Sorry you passed empty value:"+name+". Exception Message:"+ex.getMessage());
        }

//        Exception2 exception22 = new Exception2(null);
//        System.out.println(exception22.getUpperCaseName());
//
//        Exception2 exception23 = new Exception2("Ayesha");
//        System.out.println(exception23.getUpperCaseName());
    }
}
