public class Car {
//    实例方法或者字段 多个不同的都是分开的都不一样，但 static 字段或方法都是共享的
    // Instance fields
    String make;
    String model;
    int year;

    // Static field
    static int totalCars = 0;

    // Constructor
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year  = year;
        totalCars ++;
    }

    // Instance method
    public void startEngine(){
        System.out.println("Engine started for " + make + " " + model);
    }

    // Static method
    public static void displayTotalCars() {
    System.out.println("Total car: " + totalCars);
    }


    public static void main(String[] args) {
    Car car1 = new Car("BMW", "BM",2023);
    Car car2 = new Car("Aodi","AO",2020);

    car1.startEngine(); // Engine started for BMW BM
    car2.startEngine(); // Engine started for Aodi AO

    Car.displayTotalCars(); // Total car: 2
    }
}
