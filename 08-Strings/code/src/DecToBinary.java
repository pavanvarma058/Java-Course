import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        // Decimal to Binary Conversion
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        decToBin(n);
    }
    public static void decToBin(int n){
        String s = " ";
        while(n>0){
            s = (n%2)+s;
            n = n/2;
        }
        System.out.println(s);
    }
}
