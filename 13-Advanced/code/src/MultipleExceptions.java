import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        try{
            methodA();

            Scanner sc = new Scanner(new File("test.txt"));
            /* Many more statements here which may possibly raise an
             Exception, but the type of exception is unknown*/
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception Caught....");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found exception caught....");
        }
        catch (Exception ex){
            System.out.println("A new type exception has occurred");
        }
        finally {
            System.out.println("Finally-block runs regardless of the state of exception");
        }
        System.out.println("After try-catch-finally, life goes on...");
    }
    public static void methodA(){
        try {
            System.out.println(1 / 0);
        }
        finally {
            System.out.println("Exit method A()");
        }
    }
}
