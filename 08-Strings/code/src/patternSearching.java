import java.util.Scanner;

public class patternSearching {
    public static void main(String[] args) {
        // Pattern Searching
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String txt = sc.nextLine();
        System.out.print("Enter a pattern from text: ");
        String pat = sc.nextLine();
        patSearch(txt, pat);
    }
    public static void patSearch(String txt, String pat){
        int pos = txt.indexOf(pat);
        while(pos >= 0){
            System.out.print(pos + " ");
            pos = txt.indexOf(pos, pos+1);
        }
    }
}
