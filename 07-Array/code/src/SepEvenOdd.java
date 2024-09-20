import java.util.Arrays;

public class SepEvenOdd {
    public static void main(String[] args) {
        // Separate Even, Odd numbers in an array
        int[] numbers = {54, 43, 2, 5, 14, 17, 18, 19};
        int n = numbers.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i=0; i<n; i++){
            if(numbers[i]%2==0){
                ans[j++] = numbers[i];
            }
        }

        for (int i=0; i<n; i++){
            if(numbers[i]%2!=0){
                ans[j++] = numbers[i];
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
