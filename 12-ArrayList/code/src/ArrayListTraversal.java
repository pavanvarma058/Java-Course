import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversal {
    public static void main(String[] args) {
        // Types of methods to traverse through Java ArrayList
        ArrayList<String> str = new ArrayList<>();
        str.add("Pavan");
        str.add("Varma");
        str.add("Yeswanth");
        // 1. get() method
        for(int i = 0; i < str.size(); i++){
            System.out.println(str.get(i));
        }
        System.out.println();
        // 2. for-each loop
        for(String s : str){
            System.out.println(s);
        }
        System.out.println();
        // 3. Using Iterator ->  hasNext(), next(), remove()
        Iterator<String> it = str.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
        System.out.println();
        // 4. forEach
        str.forEach(x -> System.out.println(x));
    }
}
