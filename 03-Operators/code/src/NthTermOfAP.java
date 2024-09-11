import java.util.Scanner;

public class NthTermOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a diff: ");
        int d = sc.nextInt();
        System.out.print("Enter a N: ");
        int n = sc.nextInt();
        int ans = a + (n - 1) * d;
        System.out.println("The Nth term of AP: " + ans);

    }
}
