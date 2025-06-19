import java.math.BigInteger;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(factorialNum(n));
    }
    public static BigInteger factorialNum(int n){
        BigInteger b = new BigInteger("1");
        for(int i = 2; i <= n; i++){
            BigInteger x = BigInteger.valueOf(i);
            b = b.multiply(x);
        }
        return b;
    }
}
