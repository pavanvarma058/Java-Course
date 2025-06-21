import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("b.txt"));

            // If every thing goes well, below statement would be executed
            System.out.println("Exit main()");
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found caught ...");
            // if the file is not found, the exception will caught in this catch-block
        }
        finally {
            System.out.println("finally-block runs regardless of the state of exception");
        }

    }
}
