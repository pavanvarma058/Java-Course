public class TestInt implements MyInt{
    public void fun3(){
        System.out.println("Fun3()");
    }

    public static void main(String[] args) {
        TestInt t = new TestInt();
        t.fun1();
        MyInt.fun2();
        t.fun3();
    }
}
