import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortedArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(15);
        list.add(8);
        list.add(6);
        System.out.println(isSorted(list));
    }
    public static Boolean isSorted(ArrayList<Integer> list){
        ArrayList<Integer> ascendList = new ArrayList<>(list);
        ArrayList<Integer> descendList = new ArrayList<>(list);
        Collections.sort(ascendList);
        Collections.sort(descendList);
        Collections.reverse((descendList));
        if(list.equals(ascendList) || list.equals((descendList))){
            return true;
        }else {
            return false;
        }
    }
}
