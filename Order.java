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
public class Order {
    
    private ArrayList<ItemOrder> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(ItemOrder item) {
        items.add(item);
    }

    public double getTotal() {
        
        double total = 0;
        for (ItemOrder item : items) {
            total += item.total();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println();  // blank line
        System.out.println("===== ORDER RECEIPT =====");
        for (ItemOrder item : items) {
            System.out.println(item.itemDetails());
        }
        System.out.println("Total: Php " + getTotal());
    }  
    
}
