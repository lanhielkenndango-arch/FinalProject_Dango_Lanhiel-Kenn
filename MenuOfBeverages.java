/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drinks;

/**
 *
 * @author Asus
 */
public abstract class MenuOfBeverages {
    
    // attributes 
    private String name;
    private double price;
    
    // constructor
    public MenuOfBeverages (String name, double price){
        this.name = name;
        this.price = price;
    }
    
    // getters
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public abstract String getCategory();  // abstract means it can be used by another class only and not itself
}
