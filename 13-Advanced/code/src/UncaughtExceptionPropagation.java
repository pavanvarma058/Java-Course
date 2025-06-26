public class UncaughtExceptionPropagation {
    public static void main(String[] args) {
        try {
            methodA();  // Calling methodA
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException caught in main()");
            ex.printStackTrace();
        } finally {
            System.out.println("finally in main() - executed after try-catch");
        }
    }
    public static void methodA() {
        System.out.println("Enter methodA()");
        int a = 5, b = 0;
        int c = a / b;  // This will throw ArithmeticException
        System.out.println(c);
    }
}
