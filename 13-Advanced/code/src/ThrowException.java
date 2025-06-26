import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) {
        try {
            methodB();
            System.out.println("Exit of try main()");
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception caught");

            e.printStackTrace();
        }
        System.out.println("Exit main() successfully");
    }
    public static void methodB() throws ArithmeticException {
        int a = 5, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // Below statement may throw an exception
        int b = sc.nextInt();

        if(b==0){
            throw new ArithmeticException();
        }else {
            c = a/b;
        }
        System.out.println("Exit method B");
    }
}
