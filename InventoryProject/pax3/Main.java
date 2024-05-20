package pax3;
// Part 2. Class methods
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Predefined products
        products.add(new Product(1, "Chair", 50, 45.99));
        products.add(new Product(2, "Table", 20, 89.99));
        products.add(new Product(3, "Lamp", 100, 25.50));
        products.add(new Product(4, "Bookshelf", 15, 120.75));
        products.add(new Product(5, "Desk", 10, 150.00));
        products.add(new Product(6, "Couch", 5, 300.00));

        System.out.print("Would you like to add a new product? (yes/no): ");
        String response = scanner.nextLine();

        while (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter product number: ");
            int number = scanner.nextInt();
            scanner.nextLine();  // consume newline
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter units in stock: ");
            int units = scanner.nextInt();
            System.out.print("Enter price per unit: ");
            double price = scanner.nextDouble();
            scanner.nextLine();  // consume newline

            products.add(new Product(number, name, units, price));

            System.out.print("Would you like to add another product? (yes/no): ");
            response = scanner.nextLine();
        }

        for (Product product : products) {
            System.out.println(product);
        }

        scanner.close();
    }
}

