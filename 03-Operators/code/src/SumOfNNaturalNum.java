import java.util.Scanner;

public class SumOfNNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = n * (n+1)/2;
        System.out.println("Sum of N Natural Numbers: " + sum);
    }
}
