package com.edu.oops;

class Employee {
    public long id;
    public String firstName="Employee First Name";
    public String lastName="Employee Last Name";
    private String myWifeName="Wife";

    public Employee(){
    }
    private void work(){
        System.out.println(firstName+" is working");
        //System.out.println("My wife name is "+myWifeName);
    }
}

class Accountant extends Employee{

    public void work(){
        System.out.println(firstName+"  is working");
    }
}
class Administrator extends Employee{
    public String myWifeName="Admin Wife";
    public Administrator(){
        super.firstName="Admin";
    }
    public void work(){
        //super.work();
        System.out.println(firstName+"  is working and my last name is "+lastName);
        //System.out.println("My wife name is "+myWifeName);
    }

    public void study(){
        System.out.println(" I study");
    }
}


public class InheritanceImplementor{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        //e1.work();
        Accountant a1 = new Accountant();
        //a1.work();

        Employee accountEmployee = new Accountant();
        //accountEmployee.work();

        Employee adminEmployee = new Administrator();
        //adminEmployee.wi
        //adminEmployee.work();

        Administrator admin1 = new Administrator();
        //admin1.myWifeName
        //admin1.study();
    }
}
