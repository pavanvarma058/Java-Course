import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // for loop example
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i + " Pavan");
//        }

        //You are given a String S, you need to print its characters at even indices(index starts at 0).
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i=i+2) {
            System.out.print(str.charAt(i));
        }
    }
}