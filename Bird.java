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
class Bird extends Animal{
    
    @Override
    void eat(){
        System.out.println("Birds loves to eat seeds.");
    }
    
    @Override
    void sleep(){
        System.out.println("Birds sleeps for 12 hours a day.");
    }
    
    @Override
    void makeSound(){
        System.out.println("Tweet tweet");
    }
}
