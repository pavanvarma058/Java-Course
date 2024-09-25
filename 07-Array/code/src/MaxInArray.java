import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        // Maximum in an array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = maximum(a);
        System.out.println(ans);
    }

    public static int maximum(int[] a){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
}
