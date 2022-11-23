/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runanimal;
import java.util.Scanner;
/**
 *
 * @author ComputerLab4PC1
 */
public class RunAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Choose an animal. Press B for Bird, C for Cat and D for Dog: ");
        String choice = SC.nextLine();
        
        if(!choice.equalsIgnoreCase("B") && !choice.equalsIgnoreCase("C") && !choice.equalsIgnoreCase("D")){
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        
        if(choice.equalsIgnoreCase("B")){
            Bird b = new Bird();
            b.eat();
            b.sleep();
            b.makeSound();
        }
        
        if(choice.equalsIgnoreCase("C")){
            Cat c = new Cat();
            c.eat();
            c.sleep();
            c.makeSound();
        }
         
        if(choice.equalsIgnoreCase("D")){
            Dog d = new Dog();
            d.eat();
            d.sleep();
            d.makeSound();
        }
    }
    
}
