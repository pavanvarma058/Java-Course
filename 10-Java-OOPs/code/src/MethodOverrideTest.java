public class MethodOverrideTest {
    public static void main(String[] args) {
        Parent c = new Child();
        Parent g = new GrandChild();
        c.fun();
        g.fun();
    }
}
