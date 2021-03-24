class  Employee{
    private String firstName;
    public void name(){
        System.out.println("Employee is working");
    }
}




public class Inherit extends Employee {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name();
    }

}



