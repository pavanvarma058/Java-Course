public class Car {
    String make, model;
    int year;

    Car(String m, String mod, int y){
        make = m;
        model = mod;
        year = y;
    }

    public void displayInfo(){
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Ford", "Mustang", 2021);
        c1.displayInfo();
    }
}
