import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            showMenu();
            System.out.print("Choose: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the Celsius temperature: ");
                    double celsius = input.nextDouble();
                    double fahrenheit = celsius * 1.8 + 32;
                    System.out.printf("Fahrenheit = %.2f\n\n", fahrenheit);
                }
                case 2 -> {
                    System.out.print("Enter the Fahrenheit temperature: ");
                    double fahrenheit = input.nextDouble();
                    double celsius = (fahrenheit - 32) / 1.8;
                    System.out.printf("Celsius = %.2f\n\n", celsius);
                }
                case 3 -> {
                    System.out.print("Enter the value in kilometers: ");
                    double km = input.nextDouble();
                    double miles = km * 0.621371;
                    System.out.printf("Miles = %.2f\n\n", miles);
                }
                case 4 -> {
                    System.out.print("Enter the value in miles: ");
                    double miles = input.nextDouble();
                    double km = miles / 0.621371;
                    System.out.printf("Kilometers = %.2f\n\n", km);
                }
                case 0 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.\n");
            }
        }
    }

    public static void showMenu() {
        System.out.println("==== Unit Conversion Menu ====");
        System.out.println("1. Celsius ---> Fahrenheit");
        System.out.println("2. Fahrenheit ---> Celsius");
        System.out.println("3. Kilometer ---> Mile");
        System.out.println("4. Mile ---> Kilometer");
        System.out.println("0. Exit");
    }
}
