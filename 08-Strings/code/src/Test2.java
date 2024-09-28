public class Test2 {
    public static void main(String[] args) {
        // concat example
        String s1 = "geeks";
        String s2 = s1;
        System.out.println(s1==s2);
//        s1 = s1 + "forgeeks";
        s1 = s1.concat("forgeeks");
        System.out.println(s1);
        System.out.println(s1==s2);
    }
}
