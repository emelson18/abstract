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
class Cat extends Animal{
    
    @Override
    void eat(){
        System.out.println("Cat loves to eat fish.");
    }
    
    @Override
    void sleep(){
        System.out.println("Cats sleeps for 8 to 12 hours a day.");
    }
    
    @Override
    void makeSound(){
        System.out.println("Meow meow");
    }
}
