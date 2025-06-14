import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BackwardTraversal {
    public static void main(String[] args) {
        List<Integer> lt = new ArrayList<>();
        lt.add(20);
        lt.add(30);
        lt.add(40);
        ListIterator<Integer> list = lt.listIterator(lt.size());
        while (list.hasPrevious()){
            System.out.println(list.previous());
        }
    }
}
