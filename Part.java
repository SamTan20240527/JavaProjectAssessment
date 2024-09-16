import java.util.Scanner;

public abstract class Part {
  private String partNumber;
  private String partDescription;

  // Default constructor to initialize member variables
  public Part() {
    this.partNumber = "PartNumber";
    this.partDescription = "PartDescription";
  }

  // Overloaded constructor to pass specific values from a new instance
  public Part(String partNumber, String partDescription) {
    this.partNumber = partNumber;
    this.partDescription = partDescription;
  }

  // Getters & setters to access private member variables
  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  public String getPartDescription() {
    return partDescription;
  }

  public void setPartDescription(String partDescription) {
    this.partDescription = partDescription;
  }

  // Method to display details in parent class
  public void displayDetails() {
    System.out.println("PART NUMBER:             " + getPartNumber());
    System.out.println("PART DESCRIPTION:        " + getPartDescription());
  }

  public void edit() {
      @SuppressWarnings("resource")
      Scanner scanner = new Scanner(System.in);
      System.out.println("EDIT PART NUMBER: ");
      String newPartNumber = scanner.nextLine();
      this.partNumber = newPartNumber;

      System.out.println("EDIT PART DESCRIPTION: ");
      String newPartDescription = scanner.nextLine();
      this.partDescription = newPartDescription;
  }
}
