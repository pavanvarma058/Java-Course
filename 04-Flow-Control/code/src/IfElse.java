import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // if else examples
        Scanner sc = new Scanner(System.in);
        // Even Odd
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
//        if(n % 2 == 0){
//            System.out.println("Given number is a even number");
//        }else {
//            System.out.println("Given number is a odd number");
//        }
//
        // Nested if else
        if(n > 0){
            System.out.print("Positive ");
            if(n%2==0){
                System.out.print("Even\n");
            }else {
                System.out.print("Odd\n");
            }
        } else if (n < 0) {
            System.out.print("Negative ");
            if(n%2==0){
                System.out.print("Even\n");
            }else {
                System.out.print("Odd\n");
            }
        } else {
            System.out.println("Zero");
        }
    }
}