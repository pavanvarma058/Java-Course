public interface MyInt {
    default void fun1(){
        System.out.println("Fun1()");
    }
    static void fun2(){
        System.out.println("Fun2()");
    }
    void fun3(); // this is abstract method we don't have to mention
}
