public class ArrayTraversal {
    public static void main(String[] args) {
        // Array Traversal
        int[] a = {10, 12, 15, 18, 55, 49, 45, 25};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Array Traversal Reverse
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
