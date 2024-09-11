import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Given an integer y. Check whether it can represent a leap year or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int y = sc.nextInt();
        if(y % 4 == 0 && y % 100 != 0){
            System.out.println("Leap Year");
        } else if (y % 400 == 0) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a Leap Year");
        }
    }
}
