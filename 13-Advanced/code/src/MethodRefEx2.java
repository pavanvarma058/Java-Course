import java.util.Arrays;
import java.util.List;

public class MethodRefEx2 {
    public static void main(String[] args) {
        // ArrayList to check the function
        List<Integer> al = Arrays.asList(10, 20, 30, 40);

        // Method Reference to a static method
        al.forEach(MethodRefEx2::printSquare);
    }
    public static void printSquare(Integer x){
        System.out.println(x * x);
    }
}
