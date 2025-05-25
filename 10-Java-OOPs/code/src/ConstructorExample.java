public class ConstructorExample {
    int x, y;

    ConstructorExample(int a, int b){
        x = a;
        y = b;
    }

    void print(){
        System.out.println("X = " + x + " and " + "Y = " + y);
    }

    public static void main(String[] args) {
        ConstructorExample p1 = new ConstructorExample(10, 20);
        p1.print();
    }
}
