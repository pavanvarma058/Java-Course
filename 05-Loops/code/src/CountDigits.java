import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Count Digits of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            n = n/10;
            count += 1;
        }
        System.out.println("Count = " + count);
    }
}
