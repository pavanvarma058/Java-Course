import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        // Triangular Pattern
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        int i = 1;
//        while(i<=n){
//            int j = 1;
//            while(j<=i){
//                System.out.print("*");
//                j++;
//            }
//            i++;
//            System.out.println();
//        }

        // Right angled triangle 2
        int s = sc.nextInt();
        for (int i = 1; i < s; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (j == 1 && i > 1)
                    System.out.print("*  ");
                else if (j == 1)
                    System.out.print("*");
                else if (j == i)
                    System.out.print("*");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }

        for (int i = 1; i <= s; i++)
            System.out.print("* ");

        System.out.println();
    }
}
