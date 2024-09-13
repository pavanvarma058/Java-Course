import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        // GCD of Two numbers - Greatest Common Divisor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int ans = 1;
        int x = Math.min(a,b);
        for (int i = 1; i <= x; i++) {
            if(a%i==0 && b%i==0){
                ans = i;
            }
        }
        System.out.println("GCD of Two numbers: " + ans);

    }
}
