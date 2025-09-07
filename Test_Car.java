public class Test_Car {
    public static void main(String[] args) {
        Car car1 = new Car("M3", "BMW", 2025, 59999.0);
        Car car2 = new Car("Civic", "Honda", 2022, 39999.0);

        System.out.println("First Car:");
        System.out.println("Brand: " + car1.make);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);
        System.out.println("Price: " + car1.price);

        System.out.println("\nIs it running? " + car1.isRunning);
        car1.start();
        System.out.println("Is it running? " + car1.isRunning);

        System.out.println("\nSecond Car:");
        System.out.println("Brand: " + car2.make);
        System.out.println("Model: " + car2.model);
        System.out.println("Year: " + car2.year);
        System.out.println("Price: " + car2.price);

        System.out.println("\nIs it running? " + car2.isRunning);
        car2.start();
        System.out.println("Is it running? " + car2.isRunning);

        System.out.println("\n");

        car1.drive();
        car2.drive();
    }
}
