package com.edu.error;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionImpl {

    /**
     *
     * @return list of employees
     */
    public static List<Employee> giveMeEmployee(){
        List<Employee> list= new ArrayList<>();
        list.add(new Employee("Amjad"));
        list.add(new Employee("Sakeb"));
        //list.add("");

        return Arrays.asList(new Employee("Amjad"), new Employee("Sakeb"), new Employee());
    }
    public static void main(String[] args) {
        List<Employee> employees = giveMeEmployee();
        for(Employee employee: employees){
            try {
                String [] str = {"amjad"};
                System.out.println(str[1]);
                //System.out.println("Hi " + employee.getName().toUpperCase() + ".");
            }catch (IndexOutOfBoundsException ex){
                System.out.println("IndexOut of bound ");
                ex.printStackTrace();
            }catch (Exception ex){
                System.out.println("Error due to null value ");
                ex.printStackTrace();
            }
        }

        System.out.println("The End");







    }
}
