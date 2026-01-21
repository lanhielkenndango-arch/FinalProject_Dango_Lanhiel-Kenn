    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drinks;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class DrinksApp {
    
    private Menu menu;
    private Order myOrder;
    private Scanner input;

    public DrinksApp() {
        menu = new Menu();         
        myOrder = new Order();   
        input = new Scanner(System.in);
    }

    public void run() {
        System.out.println();
        System.out.println("Welcome to Drinks App!");

        while (true) {
            menu.displayMenu();
            System.out.print("Select item number: ");
            
            try {
                int choice = input.nextInt();

                if (choice == 10) {
                    break;
                } else {
                    addOrder(choice);
                }

            } catch (Exception e) {
                System.out.println("Error: Invalid input.");
                input.nextLine(); 
            }
        }
        
        checkout();
    }

    // Helper method to keep start() clean
    private void addOrder(int choice) {
        int index = choice - 1; // since i+1 is use but the original number starts at 0 , i - 1 wil help to pick the specific choice
        MenuOfBeverages item = menu.getItem(index);

        if (item != null) {
            System.out.print("Enter Quantity for " + item.getName().trim() + ": ");  // to trim the extra space in the menu
            int quantity = input.nextInt();

            if (quantity > 0) {
                ItemOrder newItem = new ItemOrder(item, quantity);
                myOrder.addItem(newItem);
                System.out.println("The Item is Added");
            } else {
                System.out.println("Error: Put atleast one quantity.");
            }
        } else {
            System.out.println("Invalid item number.");
        }
    }

    private void checkout() {
        if (myOrder.getTotal() > 0) {
            myOrder.printReceipt();
        } else {
            System.out.println("No ordered items.");
        }
    }
}
