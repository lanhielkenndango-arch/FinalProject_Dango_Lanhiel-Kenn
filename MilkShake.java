/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drinks;

/**
 *
 * @author Asus
 */
public class MilkShake extends MenuOfBeverages {
    
    public MilkShake(String name, double price){
        super(name, price); //super helps identifies that it has common parents
    }
    
    public String getCategory(){
        return "MilkShake";
    }

}
