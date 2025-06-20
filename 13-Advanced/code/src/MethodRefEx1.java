import java.util.*;
public class MethodRefEx1 {
    public static void main(String[] args) {
        // Method references in java provide a cleaner way to refer to methods in functional programming style.
        // It is often used as alternative to lambda expressions when the operation can directly map to a method call
        // They are concise and improve code readability.
        // ArrayList to check the function
        List<Integer> al = Arrays.asList(10, 20, 30, 40);

        // Method Reference
        al.forEach(System.out::println);

        System.out.println();

        // Typical Lambda Expression used in forEach
        al.forEach(x -> System.out.println(x));
    }
}
