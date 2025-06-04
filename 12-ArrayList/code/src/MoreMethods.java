import java.util.ArrayList;

public class MoreMethods {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(10);
        n.add(20);
        n.add(10);
        n.add(30);
        // get(index) will return the value at the given index
        System.out.println(n.get(1));
        n.set(1, 40); // will replace the value at the specified index
        System.out.println(n.get(1));
        System.out.println(n. indexOf(10)); // will return the first index of the value in the list
        System.out.println(n.lastIndexOf(10)); // will return the last index of the value in the list
        System.out.println(n.indexOf(50)); // returns -1
        // isEmpty() method will check whether given list is empty or not
        System.out.println(n.isEmpty());
        // clear() will delete all the values/objects in the list
        n.clear();
        System.out.println(n.isEmpty());
    }
}
