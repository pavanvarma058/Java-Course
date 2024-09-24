public class arraySum {
    public static void main(String[] args) {
        //You are given a array that contains integers. You need to return the sum of all array elements.
        int [] arr = {54, 32, 8, 10, 15};
        System.out.println(arraySum(arr));
    }
    public static int arraySum(int[] numbers){
        //Just return the sum of the list
        //Don't print here
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;

    }
}
