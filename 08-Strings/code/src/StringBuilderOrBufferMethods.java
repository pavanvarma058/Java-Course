public class StringBuilderOrBufferMethods {
    public static void main(String[] args) {
        // StringBuilderOrBuffer Methods
        StringBuilder str = new StringBuilder("dcba");
        str.reverse();
        System.out.println(str);
        str.append("efg");
        System.out.println(str);
        str.setCharAt(1, 'h');
        System.out.println(str);
        str.delete(0, 2);
        System.out.println(str);
        str.insert(1, "efg");
        System.out.println(str);
    }
}
