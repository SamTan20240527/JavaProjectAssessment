// Inherit from parent class
public class RawMaterial extends Part {
  private String materialClassification;
  private double purchaseCost;
  private double stockKg;

  // Inherit from parent default constructor
  public RawMaterial() {
    super();
    this.materialClassification = "OTHER";
    this.purchaseCost = 0.00;
    this.stockKg = 0.00;
  }

  // Inherit from parent overloaded constructor
  public RawMaterial(String partNumber, String partDescription, String materialClassification, double purchaseCost,
      double stockKg) {
    super(partNumber, partDescription);
    this.materialClassification = materialClassification;
    this.purchaseCost = purchaseCost;
    this.stockKg = stockKg;
  }

  // Getters & setters for member variables in child class
  public String getMaterialClassification() {
    return materialClassification;
  }

  public void setMaterialClassification(String materialClassification) {
    this.materialClassification = materialClassification;
  }

  public double getPurchaseCost() {
    return purchaseCost;
  }

  public void setPurchaseCost(double purchaseCost) {
    this.purchaseCost = purchaseCost;
  }

  public double getStockKg() {
    return stockKg;
  }

  public void setStockKg(double stockKg) {
    this.stockKg = stockKg;
  }

  // Override method in parent class
  @Override
  public void displayDetails() {
    super.displayDetails();
    System.out.println("MATERIAL CLASSIFICATION: " + getMaterialClassification());
    System.out.println("PURCHASE UNIT COST:      $" + getPurchaseCost());
    System.out.println("STOCK(KG):               " + getStockKg());
    System.out.println("-".repeat(80));
  }
}