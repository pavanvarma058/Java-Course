public class ConstructorOverLoading {
    public static void main(String[] args) {
        User u1 = new User("geeks");
        System.out.println(u1.name);

        User u2 = new User();
        System.out.println(u2.name);
    }
}
