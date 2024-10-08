import java.util.Scanner;

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
        System.out.println("SELLING PRICE/EA:        $" + getSellingPrice());
        System.out.println("STOCK(EA):               " + getStockQuantity());
        System.out.println("-".repeat(80));
    }

    @Override
    public void edit() {
        super.edit();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("EDIT PRODUCT CATEGORY(Cup,Coaster,Keychain,Medal,etc.): ");
        String productCategory = scanner.nextLine();
        this.productCategory = productCategory;

        System.out.println("EDIT SELLING PRICE/EA: $");
        double sellingPrice = scanner.nextDouble();
        this.sellingPrice = sellingPrice;

        System.out.println("EDIT STOCK(EA): ");
        int stockQuantity = scanner.nextInt();
        this.stockQuantity = stockQuantity;
        }
}
