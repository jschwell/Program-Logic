/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Joleen Schwellenbach
 */
public class Controller {
    
    public Controller() {
        compoundOperators();
    }

    private void compoundOperators() {
        //Declare and initialize variables
        int myNumber = 0;
        double mySalary = 0.0;
        int loopCounter = 0;
        
        //Assign values
        myNumber = 200;
        mySalary = 40000.00;
        loopCounter = 0;
        
        //Display the current value of myNumber
        System.out.println("The current value of myNumber is: " + myNumber);
        
        //Add 25 to myNumber
        myNumber += 25;
        
        //Display the current value of myNumber
        System.out.println("The current value of myNumber is: " + myNumber);
        
        //Subtract 75 from myNumber
        myNumber -= 75;
        
        //Display the current value of myNumber
        System.out.println("The current value of myNumber is: " + myNumber);
        
        //Give a 10% raise
        mySalary *= 1.1;
        
        //Display the current value of mySalary
        System.out.println("The current value of mySalary is: " + mySalary);
        
        //Add 5 to loopCounter
        loopCounter += 5;
        
        //Display the current value of loopCounter
        System.out.println("The current value of loopCounter is: " + loopCounter);
    }
}
