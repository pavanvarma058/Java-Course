import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        li.add(0, 2);
        li.add(1, 5);
        li.add(2, 8);
        System.out.println(li);

        List<Integer> li2 = new ArrayList<>();
        li.add(24);
        li.add(25);
        li.add(26);

        // adds all the li2 elements at 1st index in li
        li.addAll(1, li2);
        System.out.println(li);

        // removes the element
        li.remove(1);
        System.out.println(li);

        System.out.println(li.get(3));

        // replace
        li.set(0, 99);
        System.out.println(li);
    }
}
