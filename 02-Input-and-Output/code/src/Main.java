import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader example
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String example
//        System.out.print("Enter a String: ");
//        String s = br.readLine();
//        System.out.println("You Entered: " + s);
        // Integer example
        System.out.print("Enter a Integer: ");
        int x = Integer.parseInt(br.readLine());
        System.out.println("You Entered: " + x);
    }
}