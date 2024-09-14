import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //You have to declare and define the function returnValueFunction.
        // This function should take one argument n which will then doubled by doing return 2*n.
        // The driver code prints the returned value.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = returnValueFunction(n);
        System.out.println(ans);

    }

    public static int returnValueFunction(int n){
        return 2 * n;
    }
}