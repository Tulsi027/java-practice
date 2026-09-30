import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first numbers:");
        int a= sc.nextInt();
        System.out.println("Enter the second number:");
        int b= sc.nextInt();
        int sum= a+b;
        System.out.println("The sum of two numbers is:" + sum);
        

    }
}