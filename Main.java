import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  private static ArrayList<Part> partList = new ArrayList<>();
  private static Scanner scanner;

  // CRUD
  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    do {
      int choice = displayMenu();
      if (choice == 1) {
        addNewPart();
      } else if (choice == 2) {
        displayParts();
      } else if (choice == 3) {
        editPart(partList);
      } else if (choice == 4) {
        System.out.print("DELETE PART FROM INDEX: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < partList.size()) {
          partList.remove(index);
          System.out.println(">".repeat(10) + "Part Deleted" + "<".repeat(10));
        } else {
          System.out.println(">".repeat(10) + "Invalid Index" + "<".repeat(10));
        }
      } else if (choice == 5) {
        break;
      }
    } while (true);
  }

  private static int displayMenu() {
    int option = 0;
    while (true) {
      System.out.println("=".repeat(35));
      System.out.println("SOUVENIR WORKSHOP INVENTORY SYSTEM");
      System.out.println("=".repeat(35));
      System.out.println("(1)ADD NEW PART");
      System.out.println("(2)LIST ALL PARTS");
      System.out.println("(3)EDIT PART");
      System.out.println("(4)DELETE PART");
      System.out.println("(5)EXIT");
      System.out.print("SELECT OPTION: ");
      option = scanner.nextInt();
      scanner.nextLine();
      if (option >= 1 && option <= 5) {
        break;
      }
    }
    return option;
  }

  private static void addNewPart() {
    System.out.print("NEW PART NUMBER: ");
    String partNumber = scanner.nextLine();
    System.out.print("NEW PART DESCRIPTION: ");
    String partDescription = scanner.nextLine();
    System.out.println();

    while (true) {
      System.out.print("ADD (1)RAW MATERIAL OR (2)FINISHED PRODUCT: ");
      int choice = scanner.nextInt();
      System.out.println();

      if (choice == 1) {
        scanner = new Scanner(System.in);
        System.out.print("MATERIAL CLASSIFICATION(Ceramic,Metal,Polymer,Other): ");
        String materialClassification = scanner.nextLine();
        System.out.print("PURCHASE COST/KG: $");
        double purchaseCost = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("STOCK(KG): ");
        double stockKg = scanner.nextDouble();

        Part rm = new RawMaterial(partNumber, partDescription, materialClassification, purchaseCost, stockKg);
        partList.add(rm);
        System.out.println(">".repeat(10) + "Part " + rm.getPartNumber() + " Added" + "<".repeat(10));
        break;

      } else if (choice == 2) {
        scanner = new Scanner(System.in);
        System.out.print("PRODUCT CATEGORY(Cup,Coaster,Keychain,Medal,etc.): ");
        String productCategory = scanner.nextLine();
        System.out.print("SELLING PRICE/EA: $ ");
        double sellingPrice = scanner.nextDouble();
        System.out.print("STOCK(EA): ");
        int stockQuantity = scanner.nextInt();

        Part fp = new FinishedProduct(partNumber, partDescription, productCategory, sellingPrice, stockQuantity);
        partList.add(fp);
        System.out.println(">".repeat(10) + "Part " + fp.getPartNumber() + " Added" + "<".repeat(10));
        break;

      } else {
        System.out.println("INVALID CHOICE, TRY AGAIN");
      }
    }
  }

  // Include array index in display
  private static void displayParts() {
    for (int i = 0; i < partList.size(); i++) {
      Part p = partList.get(i);
      System.out.println("PART INDEX: " + i + "-".repeat(67));
      p.displayDetails();
    }
  }

  public static void editPart(ArrayList<Part> partList) {
    for (int i = 0; i < partList.size(); i++) {
      System.out.println(i + ": " + partList.get(i).getPartNumber());
    }
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.print("PART INDEX TO EDIT: ");
    int partIndex = scanner.nextInt();
    Part partToEdit = partList.get(partIndex);
    partToEdit.edit();
  }
}
