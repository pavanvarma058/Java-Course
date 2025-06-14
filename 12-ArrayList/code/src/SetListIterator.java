import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SetListIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        ListIterator<Integer> lt = list.listIterator(list.size());
        while (lt.hasPrevious()){
            int x = (Integer) lt.previous();
            lt.set( x * 2);
        }
        System.out.println(list);
    }
}
