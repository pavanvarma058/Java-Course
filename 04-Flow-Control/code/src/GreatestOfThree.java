import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        //Given three numbers a, b, and c; you need to find which is the greatest of them all.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        int greatest = 0;
        if(a >= b && a >= c){
            greatest = a;
        }else if(b >= a && b >= c){
            greatest = b;
        }else {
            greatest = c;
        }
        System.out.println("Greatest of three " + greatest);
    }
}
