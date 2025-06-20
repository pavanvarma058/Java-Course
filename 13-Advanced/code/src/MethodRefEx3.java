import java.util.Arrays;

public class MethodRefEx3 {
    public static void main(String[] args) {
        // Arrays of Strings
        String a[] = {"GfG", "IDE", "Courses"};
        String b[] = {"gfg", "ide", "courses"};

        // Case-insensitive comparison
        if(Arrays.equals(a, b, String::compareToIgnoreCase)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
