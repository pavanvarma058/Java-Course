public class TestEncapsulation
{
    public static void main (String[] args)
    {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Pavan");
        obj.setAge(23);
        obj.setRoll(58);

        // Displaying values of the variables
        System.out.println("Student's name: " + obj.getName());
        System.out.println("Student's age: " + obj.getAge());
        System.out.println("Student's roll.no: " + obj.getRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
//         System.out.println("Geek's roll: " + obj.geekName);
    }
}
