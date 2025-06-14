import java.util.*;

public class ForwardTraversal {
    public static void main(String[] args) {
        List<Integer> lt = new ArrayList<>();
        lt.add(20);
        lt.add(30);
        lt.add(40);
        ListIterator<Integer> list = lt.listIterator();
        while (list.hasNext()){
            System.out.println(list.next());
        }
    }
}
