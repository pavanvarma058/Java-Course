import java.util.ArrayList;
import java.util.List;

public class SmallerElements {
    public static void main(String[] args) {
        int arr[] = {10, 20, 80, 25, 65, 55, 14};
        List<Integer> li = getSmaller(arr, 30);
        for(Integer i : li){
            System.out.println(i);
        }
    }
    public static List<Integer> getSmaller(int[] arr, int k){
        List<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] < k){
                al.add(arr[i]);
            }
        }
        return al;
    }
}
