public class StringOperations {
    public static void main(String[] args) {
        // String operations in java
        // equalsIgnoreCase()
        String str1 = "HEllo";
        String str2 = "heLLO";
        System.out.println(str1.equalsIgnoreCase(str2));
        // upperCase()
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toUpperCase());
        // capitalize()
        System.out.println(str2.substring(0,1).toUpperCase()+str2.substring(1,str2.length()));
        // subString()
        System.out.println(str1.substring(2,5));
    }
}
