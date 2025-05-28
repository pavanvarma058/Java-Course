public class Polymorphism {
    public int sum(int x, int y){
        return x + y;
    }
    public int sum(int x, int y, int z){
        return x + y + z;
    }
    public double sum(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        // This is a example for Method Overloading in which we use same name for all methods
        // But we insert different parameters and different parameter types
        Polymorphism n = new Polymorphism();
        System.out.println(n.sum(10, 20));
        System.out.println(n.sum(10, 20, 30));
        System.out.println(n.sum(10.5, 30.5));
    }
}
