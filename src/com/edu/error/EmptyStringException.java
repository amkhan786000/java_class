package com.edu.error;

public class EmptyStringException extends Exception{
    public EmptyStringException(){
        super();
    }
    public EmptyStringException(String message){
        super(message);
    }
}
