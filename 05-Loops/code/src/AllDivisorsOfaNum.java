import java.util.Scanner;

public class AllDivisorsOfaNum {
    public static void main(String[] args) {
        // All Divisors of a Number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            if(n%i==0){
                System.out.print(i+ " ");
            }
            i = i+1;
        }
    }
}
