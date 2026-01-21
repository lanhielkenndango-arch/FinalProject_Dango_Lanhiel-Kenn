/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drinks;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Menu {
    
     private ArrayList<MenuOfBeverages> items;

    public Menu() {
        items = new ArrayList<>();
        availableMenu();
    }

    // this are the fix the prices in OOP 
    private void availableMenu() {
        // price can only be changed in this class
        // MilkShake
        MilkShake m1 = new MilkShake("Vanilla          ", 140);      // since the longest is 17 letters then all should have 17 letters to balance it in main
        MilkShake m2 = new MilkShake("Chocolate        ", 145);
        MilkShake m3 = new MilkShake("Cookies and Cream", 140);
        
        items.add(m1);
        items.add(m2);
        items.add(m3);
        
        // FruitDrinks 
        FruitDrinks  fd1 = new FruitDrinks("Apple Juice      ", 65);
        FruitDrinks  fd2 = new FruitDrinks("Mango Juice      ", 65);
        FruitDrinks  fd3 = new FruitDrinks("Orange Juice     ", 60);
        
        items.add(fd1);
        items.add(fd2);
        items.add(fd3);
        
        // Cold Coffee
        ColdCoffee  cc1 = new ColdCoffee("Iced Latte       ", 90);
        ColdCoffee  cc2 = new ColdCoffee("Iced Espresso    ", 95);
        ColdCoffee  cc3 = new ColdCoffee("Iced Cappuccino  ", 100);
        
        items.add(cc1);
        items.add(cc2);
        items.add(cc3);
    }

    public void displayMenu() {
        System.out.println();
        System.out.println("==== MENU ====");
        for (int i = 0; i < items.size(); i++) {
            MenuOfBeverages drinks = items.get(i);
            System.out.println((i + 1) + ". " + drinks.getName() + " \t- Php " + drinks.getPrice()); 
             // since ang array mag start sa 0 then "i+1" will help the user to choose an item from 1-9 not 0-8 
        }
        System.out.println("10. Done Ordering");
    }

    public MenuOfBeverages getItem(int index) {
        // Validate index to prevent crashing
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        } else{
        return null;
        }
    }
    
    public int getSize() {
        return items.size();
    }   
}
