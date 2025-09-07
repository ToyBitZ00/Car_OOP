import java.util.Scanner;

public class Test_Car {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        Car car1 = new Car("BMW", "M3", 2025, 59999.0);
        Car car2 = new Car("Honda", "Civic", 2022, 39999.0);

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

        System.out.println("What car would you like to use [1,2]: ");
        int car = object.nextInt();

        System.out.println("\n");

        if (car == 1) {
            System.out.println("You chose the " + car1.model);
            car1.start();
            System.out.println("Is it running? " + car1.isRunning);
            car1.drive();
            car1.stop();
        } else if (car == 2) {
            System.out.println("You chose the " + car2.model);
            car2.start();
            System.out.println("Is it running? " + car2.isRunning);
            car2.drive();
            car2.stop();
        } else {
            System.out.println("You only have 2 cars at the moment!");
            object.close();
            return;
        }
        object.close();
    }
}
