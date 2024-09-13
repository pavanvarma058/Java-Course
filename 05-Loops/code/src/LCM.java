import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        // LCM of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int x = Math.max(a, b);
        int y = a*b;
        int ans = x;
        for (int i = x; i <= y; i++) {
            if(i%a==0 && i%b==0) {
                ans = i;
                break;
            }
        }
        System.out.println("LCM of given two numbers: " + ans);

    }
}
