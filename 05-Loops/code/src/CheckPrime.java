import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        // Check given number is Prime or Not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
//        if(n==1)
//            System.out.println("False");
//        if(n==2||n==3)
//            System.out.println("True");
//        if(n%2==0 || n%3==0)
//            System.out.println("False");
//        for (int i = 5; i*i <= n; i=i+6) {
//            if(n%i==0 || n%(i+2) == 0){
//                System.out.println("False");
//            }else {
//                System.out.println("True");
//            }
//        }
        boolean ans = isPrime(n);
        if(ans){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int n){
        int p = n;
        do{
            p++;
        }
        while(!isPrime(p));
        return p;
    }
}
