public class Solution {
    public int findMin(int a, int b) {
        int min = Integer.MAX_VALUE;

        // Addition
        try {
            int sum = a + b;
            min = Math.min(min, sum);
        } catch (Exception e) {
            System.out.println("Addition Error: " + e.getMessage());
        }

        // Subtraction
        try {
            int diff = a - b;
            min = Math.min(min, diff);
        } catch (Exception e) {
            System.out.println("Subtraction Error: " + e.getMessage());
        }

        // Multiplication
        try {
            int prod = a * b;
            min = Math.min(min, prod);
        } catch (Exception e) {
            System.out.println("Multiplication Error: " + e.getMessage());
        }

        // Division
        try {
            int div = a / b;
            min = Math.min(min, div);
        } catch (ArithmeticException e) {
            System.out.println("Division Error (possibly divide by zero): " + e.getMessage());
        }

        return min;
    }
}
