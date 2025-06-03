import java.util.ArrayList;

public class CountDistinct {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(15);
        list.add(28);
        list.add(15);
        list.add(20);
        list.add(100);
        list.add(28);
        System.out.println(distinctCount(list));
    }
    public static int distinctCount(ArrayList<Integer> list){
        int count = 0;
        for(int i=0; i<list.size(); i++){
            int val = list.get(i);
            int lastIndex = list.lastIndexOf(val);
            if(i==lastIndex) count++;
        }
        return count;
    }
}
