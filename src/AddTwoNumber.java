import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[]args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int num1= sc.nextInt();
        System.out.println("Enter Secound Number");
        int num2= sc.nextInt();
        int c=num1+num2;
        System.out.println(c);
    }
}
