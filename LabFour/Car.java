
class Car {
    String brand;
    String model;
    double price;


    Car(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    
    void displayCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: " + price);
    }

    
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2500000);
        car1.displayCar();
    }
}

