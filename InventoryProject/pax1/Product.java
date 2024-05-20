package pax1;

public class Product {
    private int productNumber;
    private String productName;
    private int unitsInStock;
    private double pricePerUnit;

    // Constructor 1
    public Product(int productNumber, String productName, int unitsInStock, double pricePerUnit) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.unitsInStock = unitsInStock;
        this.pricePerUnit = pricePerUnit;
    }

    // Constructor 2
    public Product() {
        this(0, "Unnamed", 0, 0.0);
    }

    // Getters and Setters
    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    // toString method
    @Override
    public String toString() {
        return "Product Number: " + productNumber + ", Name: " + productName +
                ", Units in Stock: " + unitsInStock + ", Price per Unit: €" + pricePerUnit;
    }
}

