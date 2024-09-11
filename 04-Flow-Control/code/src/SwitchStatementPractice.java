import java.util.Scanner;

public class SwitchStatementPractice {
    public static void main(String[] args) {
        //Given a number, you have to use a switch statement to print "One" (without quotes)
        // if the given number is equal to 1 else print "Not One"(without quotes) in a new line.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        switch (number){
            case 1:
                if(number == 1){
                    System.out.println("One");
                }
                break;
            default:
                System.out.println("Not One");
        }
    }
}
