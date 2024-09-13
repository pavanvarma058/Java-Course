import java.util.Scanner;

public class InvRightAngleTriangle {
    public static void main(String[] args) {
        // Given an integer S. Write a program to print the Inverted "Right angle triangle" wall.
        // The length of the perpendicular and base is S.  Use nested loop.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int s = sc.nextInt();
//        for(int i=s; i>0; i--){
//            for(int j=i; j>0; j--){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
        int i=1;
        while(i<=s){
            int j=1;
            while(j<=(s-i)){
                System.out.print(" ");
                j++;
            }
            while (j<=s){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
