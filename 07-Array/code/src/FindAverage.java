import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        // Find average of given arrays
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(average(a));
    }
    public static int average(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int avg = sum/a.length;
        return avg;
    }
}
