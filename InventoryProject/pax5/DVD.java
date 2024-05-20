package pax5;

public class DVD extends Product {
    private String movieTitle;

    public DVD(int productNumber, String productName, int unitsInStock, double pricePerUnit, String movieTitle, Vendor vendor) {
        super(productNumber, productName, unitsInStock, pricePerUnit, vendor);
        this.movieTitle = movieTitle;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    @Override
    public double calculateInventoryValue() {
        return super.calculateInventoryValue() * 1.05; // Add 5% restocking fee
    }

    @Override
    public String toString() {
        return super.toString() + ", Movie Title: " + movieTitle + ", Inventory Value with Restocking Fee: $" + calculateInventoryValue();
    }
}

