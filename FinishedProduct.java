// Inherit from parent class
public class FinishedProduct extends Part {
    private String productCategory;
    private double sellingPrice;
    private int stockQuantity;

    // Inherit from parent default constructor
    public FinishedProduct() {
        super();
        this.productCategory = "ProductCategory";
        this.sellingPrice = 0.00;
        this.stockQuantity = 0;
    }

    // Inherit from parent overloaded constructor
    public FinishedProduct(String partNumber, String partDescription, String productCategory, double sellingPrice,
            int stockQuantity) {
        super(partNumber, partDescription);
        this.productCategory = productCategory;
        this.sellingPrice = sellingPrice;
        this.stockQuantity = stockQuantity;
    }

    // Getters & setters for member variables in child class
    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    // Override method in parent class
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("PRODUCT CATEGORY:        " + getProductCategory());
        System.out.println("SELLING PRICE:           $" + getSellingPrice());
        System.out.println("STOCK(EA):               " + getStockQuantity());
        System.out.println("-".repeat(80));
    }
}
