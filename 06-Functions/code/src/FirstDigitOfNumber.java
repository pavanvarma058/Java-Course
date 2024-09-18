import java.util.Scanner;

public class FirstDigitOfNumber {
    public static void main(String[] args) {
        // First Digit of a Number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(firstDigit(n));
    }
    public static int firstDigit(int n){
        double power = Math.log10(n);
        int p = (int) power;
        int a = (int) Math.pow(10, p);
        int ans = n/a;
        return ans;
    }
}
