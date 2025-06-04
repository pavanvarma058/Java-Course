import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        // Array List Methods
        ArrayList<String> str = new ArrayList<>();
        // add() method adds the value to the list at the end
        str.add("Geeks");
        str.add("for");
        str.add("Geeks");
        System.out.println(str);
        // add(index, value) will add at the specific index
        str.add(1, "Practice");
        System.out.println(str);
        System.out.println(str.size()); // will return the size of the list
        // contains method return true or false
        System.out.println(str.contains("for"));
        // remove method will removes the value or object at the specific index
        str.remove(3);
        System.out.println(str);
        System.out.println(str.remove("for"));
    }
}
