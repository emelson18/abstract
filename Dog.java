/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runanimal;

/**
 *
 * @author ComputerLab4PC1
 */
class Dog extends Animal{
    
    @Override
    void eat(){
        System.out.println("Dogs loves to eat bones.");
    }
    
    @Override
    void sleep(){
        System.out.println("Dogs sleeps for 6 to 10 hours a day.");
    }
    
    @Override
    void makeSound(){
        System.out.println("Arf arf");
    }
}
