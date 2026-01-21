/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drinks;

/**
 *
 * @author Asus
 */
public class ItemOrder {
    
    private MenuOfBeverages item;
    private int quantity;
    
    public ItemOrder(MenuOfBeverages item, int quantity){  // in here it classifies that it doesn't know if it milkshake,fruitdrink, or coffee
        this.item = item;
        this.quantity = quantity;
    }
    
    public double total(){
        return item.getPrice() * quantity;   
    }
    
    public String itemDetails(){
        return String.format("%s x %d = Php %.2f", item.getName(), quantity, total());
    }
}
