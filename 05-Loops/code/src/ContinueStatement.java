import java.util.Scanner;

public class ContinueStatement {
    public static void main(String[] args) {
        // Continue Statement
//        for (int i = 0; i < 5; i++) {
//            if(i==3){
//                continue;
//            }
//               System.out.println(i);
//        }
        // Write a program to 5 pairs of integers from user. For every pair (x, y),
        // it should print (x/y) if y is not 0
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y==0){
                continue;
            }
            System.out.println(x/y);
        }
    }
}
