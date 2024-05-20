package pax5;
// Part 5. Composition
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Vendor vendor1 = new Vendor("Acme Corp", "123 Main St", "John Doe", "555-1234");
        Vendor vendor2 = new Vendor("Tech Supplies", "456 Elm St", "Jane Smith", "555-5678");

        // Predefined products
        products.add(new Product(1, "Chair", 50, 45.99, vendor1));
        products.add(new Product(2, "Table", 20, 89.99, vendor2));
        products.add(new Product(3, "Lamp", 100, 25.50, vendor1));
        products.add(new Product(4, "Bookshelf", 15, 120.75, vendor2));
        products.add(new Product(5, "Desk", 10, 150.00, vendor1));
        products.add(new Product(6, "Couch", 5, 300.00, vendor2));
        products.add(new DVD(7, "DVD Player", 30, 75.00, "Inception", vendor1));

        System.out.print("Would you like to add a new product? (yes/no): ");
        String response = scanner.nextLine();

        while (response.equalsIgnoreCase("yes")) {
            int number = 0;
            while (true) {
                System.out.print("Enter product number: ");
                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid integer for product number.");
                    scanner.nextLine();  // consume invalid input
                }
            }

            System.out.print("Enter product name: ");
            String name = scanner.nextLine();

            int units = 0;
            while (true) {
                System.out.print("Enter units in stock: ");
                if (scanner.hasNextInt()) {
                    units = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid integer for units in stock.");
                    scanner.nextLine();  // consume invalid input
                }
            }

            double price = 0.0;
            while (true) {
                System.out.print("Enter price per unit: ");
                if (scanner.hasNextDouble()) {
                    price = scanner.nextDouble();
                    scanner.nextLine();  // consume newline
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number for price per unit.");
                    scanner.nextLine();  // consume invalid input
                }
            }

            System.out.print("Is this a DVD? (yes/no): ");
            String isDVD = scanner.nextLine();

            System.out.print("Enter vendor name: ");
            String vendorName = scanner.nextLine();
            System.out.print("Enter vendor address: ");
            String vendorAddress = scanner.nextLine();
            System.out.print("Enter vendor representative: ");
            String vendorRepresentative = scanner.nextLine();
            System.out.print("Enter vendor phone number: ");
            String vendorPhone = scanner.nextLine();

            Vendor vendor = new Vendor(vendorName, vendorAddress, vendorRepresentative, vendorPhone);

            if (isDVD.equalsIgnoreCase("yes")) {
                System.out.print("Enter movie title: ");
                String movieTitle = scanner.nextLine();
                products.add(new DVD(number, name, units, price, movieTitle, vendor));
            } else {
                products.add(new Product(number, name, units, price, vendor));
            }

            System.out.print("Would you like to add another product? (yes/no): ");
            response = scanner.nextLine();
        }

        for (Product product : products) {
            System.out.println(product);
        }

        scanner.close();
    }
}


