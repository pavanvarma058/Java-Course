import java.util.ArrayList;

public class AverageArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(-30);
        list.add(-40);
        list.add(50);
        System.out.println(SumAverage(list));
    }
    public static double SumAverage(ArrayList<Integer> list){
        double sum = 0;
        int count = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) >= 0){
                sum += list.get(i);
                count++;
            }
        }
        return sum/count;
    }
}
