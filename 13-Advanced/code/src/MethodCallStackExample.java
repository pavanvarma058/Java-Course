public class MethodCallStackExample {
    public static void main(String[] args) {
        try {
            methodA();  // Calling methodA
            System.out.println("Exit main()");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException caught...");
            ex.printStackTrace();  // Prints stack trace for debugging
        }
    }
    public static void methodA() {
        System.out.println("Enter methodA()");
        try {
            int a = 5, b = 0;
            int c = a / b;  // Division by zero will throw ArithmeticException
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in methodA");
        } finally {
            System.out.println("finally-block runs regardless of the state of exception");
        }
        System.out.println("Exit methodA()");
    }
}
