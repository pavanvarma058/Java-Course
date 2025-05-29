abstract class ShapeAbstract {
    String color;
    String getColor(){
        return color;
    }
    ShapeAbstract(String c){
        color = c;
    }
    abstract double getArea();
}
