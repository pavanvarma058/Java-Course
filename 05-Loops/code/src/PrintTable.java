import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        //While loop is another loop like for loop but unlike for loop it only checks for one condition.
        //
        //Here, we will use a while loop and print a number n's table in reverse order.
        //
        //Note : As the code is checked against multiple test cases,
        // don't forget to add a new line as it is necessary after every execution.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int multiplier = 10;
        while(multiplier>0){
            System.out.print(n*multiplier + " ");
            multiplier--;
        }
        System.out.println();
    }
}
