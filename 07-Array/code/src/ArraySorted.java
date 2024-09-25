import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean ans = isSorted(a,n);
        if(ans==true){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    public static boolean isSorted(int[] a, int n){
        for (int i = 1; i < n; i++) {
            if(a[i] < a[i-1]){
                return false;
            }
        }
        return true;
    }
}
