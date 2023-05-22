package InventoryProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inventorySystem  {


        private List<Product> inventory = new ArrayList<>();


        public void addProduct(String name, int quantity) {
            boolean productExists = false;
            for (Product product : inventory) {
                if (product.getName().equals(name)) {
                    product.setQuantity(product.getQuantity() + quantity);
                    productExists = true;
                    break;
                }
            }
            if (!productExists) {
                Product newProduct = new Product(name, quantity);
                inventory.add(newProduct);
            }
        }

        public void removeProduct(String name, int quantity) {
            for (Product product : inventory) {
                if (product.getName().equals(name)) {
                    if (product.getQuantity() <= quantity) {
                        inventory.remove(product);
                    } else {
                        product.setQuantity(product.getQuantity() - quantity);
                    }
                    break;
                }
            }
        }

        public void displayInventory() {
            System.out.println("Current Inventory:");
            for (Product product : inventory) {
                System.out.println(product.getName() + ": " + product.getQuantity());
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            inventorySystem inventorySystem = new inventorySystem();

            while (true) {
                System.out.println("1. Add Product");
                System.out.println("2. Remove Product");
                System.out.println("3. Display Inventory");
                System.out.println("4. Quit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter product name: ");
                        String name = scanner.next();
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        inventorySystem.addProduct(name, quantity);
                        System.out.println("Product added to inventory.");
                        break;
                    case 2:
                        System.out.print("Enter product name: ");
                        name = scanner.next();
                        System.out.print("Enter quantity: ");
                        quantity = scanner.nextInt();
                        inventorySystem.removeProduct(name, quantity);
                        System.out.println("Product removed from inventory.");
                        break;
                    case 3:
                        inventorySystem.displayInventory();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
                System.out.println();
            }
        }
    }



