public class InputErrors {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int sum = a + b;
            System.out.println("Addition is: " + sum);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Insufficient input arguments.");
        } catch (NumberFormatException n){
            System.out.println("Error: Invalid input format");
        }
    }
}
