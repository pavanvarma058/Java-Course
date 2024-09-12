import java.util.Scanner;

public class TableDifference {
    public static void main(String[] args) {
        // Given two number n1 and n2, n1 > n2. Find the differences between mathematical tables of n1 and n2.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int n2 = sc.nextInt();
        int i = 1;
        while(i<=10) {
            System.out.print((n1 * i) - (n2 * i) + " ");
            i++;
        }
    }
}
