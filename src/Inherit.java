class Employee{
    private String id;
    private String firstName;
    private String lastName;
    private long number;
    int bonus=5000;
    public void work(){

        System.out.println("employee is working");
    }
}

class Accountant{
    int bouns=2000;
    int workhour=5;
    public void work(){
        System.out.println("Account is working");
    }
}

class Developer extends Employee{
int bonus=10000;

    @Override
    public void work() {
        System.out.println("Developer is working");
    }
}


public class Inherit {
    public static void main(String[] args) {
        Employee shakib= new Employee();
        Employee tanwir=new Employee();
        Employee firdosh=new Employee();
        System.out.println("shakib bonus: "+shakib.bonus);
        System.out.println("tanwir bonus: "+tanwir.bonus);
        System.out.println("firdosh bonus:"+firdosh.bonus);
        Developer d1 = new Developer();
        d1.work();
        System.out.println("Developer Bonus: "+d1.bonus);

        Accountant a1=new Accountant();
        a1.work();
        System.out.println("Accountant bonus: "+a1.bouns+" "+"Working Hour is "+a1.workhour+"Hrs");


    }
}



