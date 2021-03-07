import java.util.Scanner;

public class DivideTwoNumber {
    public static void main(String[]args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        int c=num1/num2;
        System.out.println(c);
    }
}
