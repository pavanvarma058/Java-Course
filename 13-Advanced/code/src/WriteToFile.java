import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        // Writing to a file
        try {
            FileWriter writer = new FileWriter("D:\\File.txt");
            writer.write("Java is a programming language");

            writer.close();

            System.out.println("Successfully wrote to file");
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
