import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File obj = new File("D:\\File.txt");

            if(obj.createNewFile()){
                System.out.println("file created: " + obj.getName());
            } else {
                System.out.println("file already exits.");
            }
        } catch (IOException e){
            System.out.println("An error occurred");
        }
    }
}
