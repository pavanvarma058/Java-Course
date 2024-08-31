public class TypeConversion {
    public static void main(String[] args) {
        // Implict conversion
        int x = 100;
        long y = x;
        float z = y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // Explict conversrion
        double d = 65.4;
        int i = (int) d;
        char c = (char) d;
        System.out.println(i);
        System.out.println(c);
    }
}
