import java.util.Scanner;

public class DayBeforeNDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter d: ");
        int d = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int x = n % 7;
        int ans = d - x;
        if(ans >= 0){
            System.out.println(ans);
        }else {
            System.out.println(ans+7);
        }
    }
}
