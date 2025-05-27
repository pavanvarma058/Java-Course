public class SuperKeyDerived extends SuperKeyTest{
    int x = 20;

    void print(){
        System.out.println(super.x);
        System.out.println(x);
    }

    public static void main(String[] args) {
        SuperKeyDerived p1 = new SuperKeyDerived();
        p1.print();
    }
}
