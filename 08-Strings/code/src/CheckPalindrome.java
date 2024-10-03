import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        // check given string is palindrome or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String a = sc.nextLine();
        int start = 0;
        int end = a.length()-1;
        boolean isPal = true;
        while(start<end){
            if(a.charAt(start)!=a.charAt(end)){
                isPal = false;
                break;
            }
            start++; end--;
        }
        if(isPal==true){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    public static boolean isPalin(String s){
        // code here
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        String data = str.toString();
        if(s.equalsIgnoreCase(data)){
            return true;
        } else {
            return false;
        }

    }
}
