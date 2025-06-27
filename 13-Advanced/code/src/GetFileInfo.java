import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        // Getting file information
        File obj = new File("D:\\File.txt");

        // check if the file exists
        if(obj.exists()){
            System.out.println("File name: " + obj.getName());
            System.out.println("Absolute Path: " + obj.getAbsolutePath());
            System.out.println("Writable: " + obj.canWrite());
            System.out.println("Readable: " + obj.canRead());
            System.out.println("File Size: " + obj.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
