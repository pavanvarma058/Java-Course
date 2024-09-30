import java.util.Scanner;

public class DigitsDecimal {
    public static void main(String[] args) {
        // Digits after Decimal
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String num = sc.nextLine();
        String s = digitsAfterDecimal(num);
        System.out.println(s);
    }
    public static String digitsAfterDecimal(String no){
        int pos = no.indexOf('.');
        if(pos<0){
            return " ";
        }else {
            return no.substring(pos+1);
        }
    }
}
