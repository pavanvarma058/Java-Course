import java.util.Scanner;

public class BinToDecimal {
    public static void main(String[] args) {
        // Binary To Decimal
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number: ");
        String str = sc.nextLine();
        int n = binary_to_decimal(str);
        System.out.println(n);
    }
    public static int binary_to_decimal(String str) {
        // Code here
        int m = 0;
        int k = 1;
        for(int i=str.length()-1; i>=0; i--){
            m += (str.charAt(i)-'0')*k;
            k = k*2;
        }
        return m;
    }
}
