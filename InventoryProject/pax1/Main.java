package pax1;
// Part 1. Classes and Objects.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Chair", 10, 45.99);
        Product product2 = new Product(2, "Table", 2, 89.99);
        Product product3 = new Product(3, "Lamp", 8, 25.50);
        Product product4 = new Product(4, "Bookshelf", 4, 120.75);
        Product product5 = new Product(5, "Desk", 4, 150.00);
        Product product6 = new Product(6, "Couch", 2, 300.00);

        Product[] products = {product1, product2, product3, product4, product5, product6};

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
