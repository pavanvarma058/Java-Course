public class CountWords {
    public static void main(String[] args) {
        // You are given a string s consisting of multiple words. You need to count the total words in the string.
        // Words are separated by a single space.
        //Note: It is guaranteed that the last character of the given string is not a white space.
        String str = "Geeks for geeks";
        System.out.println(countWords(str));
    }
    public static int countWords(String str){
        int words = str.split("\\s").length;
        return words;
    }
}
