public class FunctionExample2 {
    public static void main(String[] args) {
        System.out.println("Main Begins");
        fun1();
        System.out.println("Main Ends");
    }
    public static void fun1(){
        System.out.println("Fun1 Begins");
        fun2();
        System.out.println("Fun2 Ends");
    }

    public static void fun2(){
        System.out.println("Inside fun2()");
    }
}
