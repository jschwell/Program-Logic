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
        mulitiplicativeOperators();
    }

    private void mulitiplicativeOperators() {
        //Declare and initialize variables
        double totalPrice = 0.0;
        double avgPrice = 0.0;
        double widgetPrice = 1.50;
        int widgetQuantity = 3;
        double dodadPrice = 2.50;
        int dodadQuantity = 6;
        double gadgetPrice = 3.50;
        int gadgetQuantity = 9;
        double widgetTotal = 0.0;
        double dodadTotal = 0.0;
        double gadgetTotal = 0.0;
        
        //Calculate the total price of the widgets
        widgetTotal = widgetPrice * widgetQuantity;
               
        //Calculate the total price of the dodads
        dodadTotal = dodadPrice * dodadQuantity;
        
        //Calculate the total price of the gadgets
        gadgetTotal = gadgetPrice * gadgetQuantity;
        
        //Calculate the total price of all items
        totalPrice = widgetTotal + dodadTotal + gadgetTotal;
        
        //Calculate the average price of the item totals
        avgPrice = totalPrice / 3;
        
        //Display prices
        System.out.println("The total cost of the widgets is: " + widgetTotal);
        System.out.println("The total cost of the dodads is: " + dodadTotal);
        System.out.println("The total cost of the gadgets is: " + gadgetTotal);
        System.out.println("The total cost of all items is: " + totalPrice);
        System.out.println("The average price of the item totals is: " + avgPrice);
        
        //Declare and initialize variables
        int firstNumber = 8;
        int secondNumber = 15;
        int thirdNumber = 37;
        int fourthNumber = 46;
        int theRemainder = 0;
        
        //Calculate firstNumber modulus 2
        theRemainder = firstNumber % 2;
        
        //Display remainder of firstNumber modulus 2
        System.out.println(theRemainder + " is the remainder of " + firstNumber + " modulus 2");
        
        //Calculate secondNumber modulus 2
        theRemainder = secondNumber % 2;
        //Display remainder of secondNumber modulus 2
        System.out.println(theRemainder + " is the remainder of " + secondNumber + " modulus 2");
        
        //Calculate thirdNumber modulus 2
        theRemainder = thirdNumber % 2;
        
        //Display remainder of thirdNumber modulus 2
        System.out.println(theRemainder + " is the remainder of " + thirdNumber + " modulus 2");
        
        //Calculate fourthNumber modulus 2
        theRemainder = firstNumber % 2;
        
        //Display remainder of fourthNumber modulus 2
        System.out.println(theRemainder + " is the remainder of " + fourthNumber + " modulus 2");
    }
}
