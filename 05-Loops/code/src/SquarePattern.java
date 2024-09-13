import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        // Square Pattern with spaces
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int s = sc.nextInt();
        for(int i = 1;i<=s;i++) {
            for (int j = 1; j <= s; j++) {
                if (i == 1 || i == s || j == 1 || j == s) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
