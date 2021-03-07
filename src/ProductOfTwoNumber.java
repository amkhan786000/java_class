import java.util.Scanner;

public class ProductOfTwoNumber {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number");
        int num1 = sc.nextInt();
        System.out.println("Input second Number");
        int num2 = sc.nextInt();
        int mult=num1*num2;
        System.out.print(num1+"x"+num2+"="+mult);
    }
}
