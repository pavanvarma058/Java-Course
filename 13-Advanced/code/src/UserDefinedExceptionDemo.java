public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        int balance;

        try {
            balance = Integer.parseInt(args[0]);

            // call a method that throw User Defined Exception
            updateBalance(balance);
        }catch (InvalidBalanceException e){
            System.out.println("Caught in catch of InvalidBalanceException");
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("Caught in catch of NumberFormatException");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught in catch of ArrayIndexOutOfBoundsException");
        }catch(Exception e){
            System.out.println("Caught in catch of Exception");
        }
        System.out.println("Main method executed successfully");

    }
    public static void updateBalance(int number) throws InvalidBalanceException{
        if(number < 0){
            throw new InvalidBalanceException("Account balance cannot be less than zero");
        }
        System.out.println("No exception occurred in updateBalance() method.");
    }
}
