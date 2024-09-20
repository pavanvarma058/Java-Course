import java.util.Arrays;

public class LessThan {
    public static void main(String[] args) {
        // You are given a number k and a array numbers that contains integers.
        // You need to return array of numbers that are less than k.
        int[] numbers = {54, 43, 2, 1, 15, 4};
        int k = 6;
        int size = 0;
        for (int number : numbers) {
            if (number < k) {
                size++;
            }
        }

        int[] arr = new int[size];
        int count = 0;
        for (int number : numbers) {
            if (number < k) {
                arr[count] = number;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
