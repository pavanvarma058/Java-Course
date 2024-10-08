public class FinalKeyword {
    // Java Program to demonstrate
// Reference of Final Variable
//    When a variable is declared with the final keyword, its value can't be modified, essentially, a constant.
//    This also means that you must initialize a final variable.
//    If the final variable is a reference, this means that the variable cannot be re-bound
//    to reference another object, but the internal state of the object pointed by that reference variable
//    can be changed i.e. you can add or remove elements from the final array or final collection.
//    It is good practice to represent final variables in all uppercase, using underscore to separate words.



    // Main class

        // Main driver method
    public static void main(String[] args)
    {
        // Creating sn object of StringBuilder class
        // Final reference variable
        final StringBuilder sb = new StringBuilder("Geeks");

        // Printing the element in StringBuilder object
        System.out.println(sb);

        // changing internal state of object reference by
        //  final reference variable sb
        sb.append("ForGeeks");

        // Again printing the element in StringBuilder
        // object after appending above element in it
        System.out.println(sb);
    }

}
