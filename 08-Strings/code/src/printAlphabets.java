import java.util.Scanner;

public class printAlphabets {
    public static void main(String[] args) {
        // Given two char c1 and c2.  you need to print all the alphabet starting from c1 to c2 in a single line.
        char c1 = 'a';
        char c2 = 'z';
        alphabets(c1, c2);
        System.out.println();
    }
    public static void alphabets(char c1, char c2){
        for (char i = c1; i <= c2; i++) {
            System.out.print(i + " ");
        }
    }
}
