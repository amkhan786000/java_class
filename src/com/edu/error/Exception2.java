package com.edu.error;

public class Exception2 {
    private String name;
    public Exception2(String name){
        this.name=name;
    }
    public String getUpperCaseName() throws NullStringException, EmptyStringException{
        if(this.name==null){
            throw new NullStringException("Name can not be null");
        }else if(this.name.length()==0){
            throw new EmptyStringException("Name can not be empty");
        }

        return this.name.toUpperCase();
    }
}
