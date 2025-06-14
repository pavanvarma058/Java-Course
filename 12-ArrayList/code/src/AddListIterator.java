import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AddListIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        ListIterator<Integer> lt = list.listIterator();
        while (lt.hasNext()){
            lt.add(5);
            lt.next();
        }
        System.out.println(list);
    }
}
