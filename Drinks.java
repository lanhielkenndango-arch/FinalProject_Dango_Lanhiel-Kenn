/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package drinks;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Drinks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean running = true;

        while (running) {    // while running is true the will still continue 
            System.out.println();
            System.out.println("1. Drinks App");
            System.out.println("2. GUI");
            System.out.println("3. End");
            System.out.print("Choose a number: ");
            byte choose = input.nextByte();

            try {
                if (choose == 1) {
                    DrinksApp app = new DrinksApp();
                    app.run();

                } else if (choose == 2) {
                    java.awt.EventQueue.invokeLater(() -> {
                        // this will force to make the jframe appear in the screeen instead of clicking it in the taskbar
                        DrinksFrame gui = new DrinksFrame();

                        gui.setVisible(true);
                        gui.setAlwaysOnTop(true);
                    });

                } else if (choose == 0) {
                    running = false;  // since it is set as false then the program will end and will print the text below this line of code
                    System.out.println("\nThank you for using the app.");

                } else {
                    System.out.println("Invalid choice.");  // if the user's input is not in the given option then it is a invalid choice
                }

            } catch (InputMismatchException e) {   // if ma catch na wrong ang input then it is an error
                System.out.println("Error, invalid input.");
            }
            
        }

    }
}
