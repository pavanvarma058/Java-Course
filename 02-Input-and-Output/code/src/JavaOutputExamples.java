public class JavaOutputExamples {
    public static void main(String[] args) {
        // Java Output
        int x = 10, y = 20;
        char z = 'G';
        String str = "gfg";

        System.out.println(x);
        System.out.println(x+y);
        System.out.println(x + " " + y);
        System.out.println(str + " ");
        System.out.print("courses\n");

        float f = (float) Math.PI;
        System.out.printf("x=%d, y=%d", x,y);
        System.out.println();
        System.out.println(f);
        System.out.format("Value of PI= %.2f", f);
        System.out.println();
        System.out.format("Value of PI= %5.2f", f);
        System.out.println();
        System.out.format("Value of PI= %05.2f", f);
    }
}
