public class StringBuilderOrBuffer {
    public static void main(String[] args) {
        // String Builder or Buffer
        String s1 = "geeks";
        String s2 = s1;
        s1 = s1 + "forgeeks";
        if(s1==s2){
            System.out.println("Same");
        }else {
            System.out.println("Not Same");
        }
        // Here we can use both String Builder or Buffer because they are mutable and Builder is single threaded
        // and buffer is thread safe i.e. means it is used as multithreaded.
        StringBuilder str1 = new StringBuilder("geeks");
        StringBuilder str2 = str1;
        str1.append("forgeeks");
        if(str1==str2) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }
}
