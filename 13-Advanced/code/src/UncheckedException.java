public class UncheckedException {
    public static void main(String[] args) {
        // Unchecked Exception
        int[] arr = new int[5];
        arr[10] = 10; // throws IndexOutOfBoundsException

        int sum = 100;
        int n = 0;
        int avg = sum / n; // Throws ArithmeticException: / by zero
    }
}
