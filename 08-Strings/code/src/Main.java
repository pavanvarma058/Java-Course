public class Main {
    public static void main(String[] args) {
        // String Example
        String str = "geeks";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,5));

        String s1 = "geeksforgeeks";
        String s2 = "geeks";
        System.out.println(s1.contains(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.indexOf(s2, 1));

        String s3 = "geeksforgeeks";
        String s4 = "for";
        // The compareTo() method lexographically caluclates the value alphabetically which comes first
        int res = s1.compareTo(s2);
        if(res==0){
            System.out.println("Same");
        }
        if(res>0){
            System.out.println("S1 greater");
        }
        if(res<0){
            System.out.println("S1 Smaller");
        }

    }
}