import java.util.Scanner;

public class RevOfString {
    public static void main(String[] args) {
        // Reverse of a String
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String a = sc.nextLine();
        StringBuilder str = new StringBuilder(a);
        str.reverse();
        String data = str.toString();
        System.out.println(data);
    }
}
