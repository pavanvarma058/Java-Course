public class BitwiseOperators2 {
    public static void main(String[] args) {
        // Bitwsie NOT
        int x = 5;
        System.out.println(~x);
        // Bitwise left shift
        int y = 3;
        System.out.println(y<<1);
        System.out.println(y<<2);
        System.out.println(y<<4);
        // Bitwise right shift
        int z = 33;
        System.out.println(x>>2);
        int n = -2;
        System.out.println(n>>1);
        System.out.println(n>>2);
        // Bitwise unsigned right shift
        int c = -2;
        System.out.println(x>>>1);
        System.out.println(x>>>2);
    }
}
