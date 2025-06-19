import java.math.BigInteger;

public class Conversion {
    public static void main(String[] args) {
        // How to convert Big Integer obj to variables
        BigInteger A = new BigInteger("150");
        int a = A.intValue();
        long l = A.longValue();
        String s = A.toString();
        System.out.println(a);
        System.out.println(l);
        System.out.println(s);
    }
}
