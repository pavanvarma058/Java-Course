public class RunnableDemo {
    public static void main(String[] args) {
        // This is an example of Implementing runnable interface with multithreading
        Thread t = new Thread(new RunnableTest());
        t.start();
        System.out.println("Inside main method");
    }
}
