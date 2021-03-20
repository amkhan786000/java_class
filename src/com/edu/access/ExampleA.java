package com.edu.access;

public class ExampleA {
      private String firstName;

    public ExampleA(){
        firstName="Default Name";
        System.out.println("I am constructor of ExampleA");
    }
    public ExampleA(String firstName){
        this.firstName=firstName;
    }
    public ExampleA(String firstName, String welcome){
        this.firstName=welcome+" "+firstName;
    }

//    public void keepFirstName(String firstName){
//        this.firstName=firstName;
//    }

    public void yourFirstName(){
        System.out.println("My name is "+firstName);
    }
}
