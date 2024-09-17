public class FunctionExample3 {
    public static void main(String[] args) {
        fun();
        fun();
        int x = 15, y= 14;
        System.out.println(getMax(x,y));
    }
    public static void fun(){
        int x = 10, y = 5;
        System.out.println(x+y);
    }

    public static int getMax(int x, int y){
        if(x>y){
            return x;
        }else {
            return y;
        }
    }
}
