public class Test_Car {
    public static void main(String[] args) {
        Car car1 = new Car("M3", "BMW", 2025, 59999.0);
        Car car2 = new Car("Civic", "Honda", 2022, 39999.0);
        Car car3 = new Car("Vios", "Toyota", 2024, 49000.0);
        Car car4 = new Car("Innova", "Toyota", 2025, 59999.0);

        System.out.println("First Car:");
        System.out.println("Brand: " + car1.make);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);
        System.out.println("Price: " + car1.price);

        System.out.println("\nSecond Car:");
        System.out.println("Brand: " + car2.make);
        System.out.println("Model: " + car2.model);
        System.out.println("Year: " + car2.year);
        System.out.println("Price: " + car2.price);

        System.out.println("\nThird Car:");
        System.out.println("Brand: " + car3.make);
        System.out.println("Model: " + car3.model);
        System.out.println("Year: " + car3.year);
        System.out.println("Price: " + car3.price);

        System.out.println("\nFourth Car:");
        System.out.println("Brand: " + car4.make);
        System.out.println("Model: " + car4.model);
        System.out.println("Year: " + car4.year);
        System.out.println("Price: " + car4.price);
    }
}
