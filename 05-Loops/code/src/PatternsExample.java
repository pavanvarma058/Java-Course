public class PatternsExample {
    public static void main(String[] args) {
        // Patterns
        int n = 5;
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=n){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
