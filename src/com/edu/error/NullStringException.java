package com.edu.error;

public class NullStringException extends Exception{
    public NullStringException(){
        super();
    }
    public NullStringException(String message){
        super(message);
    }
}
