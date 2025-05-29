public class SqaureAbstract extends  ShapeAbstract{
    double side;

    SqaureAbstract(String c, double s){
        super(c);
        side = s;
    }

    double getArea(){
        return side * side;
    }
}
