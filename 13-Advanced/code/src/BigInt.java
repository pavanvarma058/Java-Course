import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        // BIG Integer is a class in java which is used to store large values
        // Initialization
        BigInteger A = new BigInteger("54");
        BigInteger B = new BigInteger("100");
        // operations
        System.out.println(A.add(B));
        System.out.println(B.subtract(A));
        System.out.println(A.multiply(B));
        System.out.println(A.divide(B));
        System.out.println(B.remainder(A));
        System.out.println(A.compareTo(B));
    }
}
