public class ClassObjectCar {
     private String brand;
     private String model;
     private int year;

    public ClassObjectCar(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        ClassObjectCar myCar = new ClassObjectCar("Toyota", "Camry", 2022);
        myCar.displayDetails();
    }
}
