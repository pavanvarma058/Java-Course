import java.util.Scanner;

public class ConcateIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        String ans = a + "" + b;
        System.out.println(ans);
    }
}
