public class ExtendThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        // This is an example for Extend Thread class
        ExtendingThreadTest t = new ExtendingThreadTest();
        t.start();
        for(int i=1; i<=5; i++){
            System.out.println("Inside main method");
            Thread.sleep(1);
        }
    }
}
