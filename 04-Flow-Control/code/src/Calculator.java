import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Calculator
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an operation from 1, 2 & 3: ");
        int op = sc.nextInt();
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if(op == 1){
            System.out.println("Addition: " + (num1+num2));
        }
        else if (op == 2) {
            System.out.println("Subtraction: " + (num1-num2));
        } else if (op == 3) {
            System.out.println("Multiplication: " + (num1*num2));
        }
    }
}
