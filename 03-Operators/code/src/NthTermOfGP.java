import java.util.Scanner;

public class NthTermOfGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a rem: ");
        int r = sc.nextInt();
        System.out.print("Enter a N: ");
        int n = sc.nextInt();
        int ans = a * (int) (Math.pow(r, n-1));
        System.out.println("The Nth term of GP: " + ans);
    }
}
