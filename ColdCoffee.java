/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drinks;

/**
 *
 * @author Asus
 */
public class ColdCoffee extends MenuOfBeverages {
    
    public ColdCoffee(String name, double price){
        super(name, price);
    }
    
    @Override
    public String getCategory(){
        return "ColdCoffee";
    }
}
