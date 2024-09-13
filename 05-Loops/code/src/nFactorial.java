import java.util.Scanner;

public class nFactorial {
    public static void main(String[] args) {
        // Factorial of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = 1;
        for (int i = n; i > 0; i--) {
            ans = ans * i;
        }
        System.out.println("Factorial of given number is: " + ans);
    }
}
