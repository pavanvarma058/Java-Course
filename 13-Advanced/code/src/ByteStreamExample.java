import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        // Byte Stream Example
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;

            while((c = in.read()) != -1){
                out.write(c);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if(in != null){
                    in.close();
                }
                if(out != null){
                    out.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
