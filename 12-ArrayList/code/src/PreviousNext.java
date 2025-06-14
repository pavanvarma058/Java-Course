import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PreviousNext {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        ListIterator<Integer> lt = list.listIterator(3);
        System.out.println(lt.previousIndex());
        System.out.println(lt.nextIndex());
    }
}
