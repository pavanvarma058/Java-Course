import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        // Example for checked
        Scanner sc = new Scanner(new File("a.txt"));

        // The above code will not compile if we do not add exception handling code
        try{
            sc = new Scanner(new File("a.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
