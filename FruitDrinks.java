/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drinks;

/**
 *
 * @author Asus
 */
public class FruitDrinks extends MenuOfBeverages{
    
    public FruitDrinks(String name, double price){
        super(name, price);
    }
    
    public String getCategory(){
        return "FruitDrinks";
    }
}
