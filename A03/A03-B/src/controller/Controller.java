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
        additiveOperators();
    }

    private void additiveOperators() {
        //Declare and initialize variables
        int addTotal = 0;
        int subtractTotal = 0;
        int total = 0;
        int numberOne = 101;
        int numberTwo = 202;
        int numberThree = 303;
        int numberFour = 404;
        
        //Add numberOne to numberTwo and put the results into addTotal
        addTotal = numberOne + numberTwo;
        
        //Subtract numberFour from numberThree and put the results into subtractTotal
        subtractTotal = numberThree - numberFour;
        
        //Add addTotal and subtractTotal and put the results into total
        total = addTotal + subtractTotal;
        
        //Display addTotal, subtractTotal, and total
        System.out.println("After calculations, the value of addTotal is: " + addTotal);
        System.out.println("After calculations, the value of subtractTotal is: " + subtractTotal);
        System.out.println("After calculations, the value of total is: " + total);
    }
}
