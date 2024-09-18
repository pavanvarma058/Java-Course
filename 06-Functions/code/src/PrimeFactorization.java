import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        // Prime Factorization
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(primeFactors(n));
    }
    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean primeFactors(int n){
        // code here

        for(int i=2; i<n;i++){
            if(isPrime(i)){
                int x = i;
                while(n%x==0){
                    System.out.print(i + " ");
                    x = x * i;
                }
            }
        }


        return false;
    }
}
