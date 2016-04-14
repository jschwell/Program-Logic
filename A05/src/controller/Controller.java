/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
/**
 *
 * @author Joleen Schwellenbach
 */
public class Controller {
    public Controller() {
       greaterThanTen();    //Part A
       checkBirthday();     //Part B
       checkRange();        //Part D
       getFamilyInfo();     //Part E
       calcDiscount();      //Part F
    }

    private void greaterThanTen() {
        //Declare and initialize variables
        double userNumber = 0.0;
        String message = "";
        
        //Get user input and convert it to a double
        message = "Please enter a number greater than 10.";
        userNumber = Double.parseDouble(getUserInput(message));
        
        //Display a message if the number is greater than 10
        if(userNumber > 10){
            message = userNumber + " is greater than 10.";
            displayResults(message);
        }
        //Display a message if the number is not greater than 10
        if(userNumber <= 10){
            message = "Sorry, " + userNumber + " is not greater than 10.";
            displayResults(message);
        }
    }

    private void checkBirthday() {
        //Declare and initialize variables
        String answer = "";
        String message = "";
        
        //Get user input
        message = "Is today your birthday?";
        answer = getUserInput(message);
        
        //Display happy birthday if the user entered yes
        if(answer.equalsIgnoreCase("yes")){
            message = "Happy Birthday!";
            displayResults(message);
        }
        //User did not enter yes
        else {
            message = "Make it a Great Day!";
            displayResults(message);
        }
    }

    private void checkRange() {
        //Declare constants
        final double LOW = 1;
        final double HIGH = 200;
        
        //Declare and initialize variables
        double userNumber = 0.0;
        String message = "";
        
        //Get user input and convert it to a double
        message = "Please enter a value that falls between " 
                + LOW + " and " + HIGH;
        userNumber = Double.parseDouble(getUserInput(message));
        
        //Display a message if the input is within range
        if(userNumber >= LOW && userNumber <= HIGH){
            message = userNumber + " is within range.";
            displayResults(message);
        }
        //Else display a message to say the user is out of range
        else {
            message = "Sorry, " + userNumber + " is out of range.";
            displayResults(message);
        }
    }

    private void getFamilyInfo() {
        //Declare and initialize variables
        int numberOfKids = 0;
        int numberOfBedrooms = 0;
        String message = "";
        
        //Get number of kids
        message = "How many kids were in your family when growing up, yourself included?";
        numberOfKids = Integer.parseInt(getUserInput(message));
        
        //Check to see if the user entered a number of 1 or greater
        if(numberOfKids >= 1){
            //Get number of bedrooms
            message = "How many bedrooms were in the house?";
            numberOfBedrooms = Integer.parseInt(getUserInput(message));
            
            //Check to see if the user entered a number of 1 or greater
            if(numberOfBedrooms >= 1){
                
                //Display a message based on combination of kids and bedrooms
                if(numberOfKids == 1) {
                    if(numberOfBedrooms == 1){
                        message = "With " + numberOfKids + " kid and " 
                                + numberOfBedrooms + " bedroom you must feel lucky!";
                        displayResults(message);
                    }
                    else if(numberOfBedrooms == 2){
                        message = "With " + numberOfKids + " kid and " 
                                + numberOfBedrooms + " bedrooms it must be spacious!";
                        displayResults(message);
                    }
                    else {
                        message = "With " + numberOfKids + " kid and " 
                                + numberOfBedrooms + " bedrooms you must have an empty feeling!";
                        displayResults(message);
                    }
                }
                else if(numberOfKids == 2){
                    if(numberOfBedrooms == 1){
                        message = "With " + numberOfKids + " kids and " 
                                + numberOfBedrooms + " bedroom you must be cozy!";
                        displayResults(message);
                    }
                    else if(numberOfBedrooms == 2){
                        message = "With " + numberOfKids + " kids and " 
                                + numberOfBedrooms + " bedrooms you must feel lucky!";
                        displayResults(message);
                    }
                    else {
                        message = "With " + numberOfKids + " kids and " 
                                + numberOfBedrooms + " bedrooms it must be spacious!";
                        displayResults(message);
                    }
                }
                else {
                    if(numberOfBedrooms == 1){
                        message = "With " + numberOfKids + " kids and " 
                                + numberOfBedrooms + " bedroom you must be crowded!";
                        displayResults(message);
                    }
                    else if(numberOfBedrooms == 2){
                        message = "With " + numberOfKids + " kids and " 
                                + numberOfBedrooms + " bedrooms you must be cozy!";
                        displayResults(message);
                    }
                    else {
                        message = "With " + numberOfKids + " kids and " 
                                + numberOfBedrooms + " bedrooms you must feel lucky!";
                        displayResults(message);
                    }
                }
            }
            //User did not enter a number that is greater than or equal to 1
            else {
                message = "Please enter a number of 1 or greater.";
                displayResults(message);
            }
        }
        //User did not enter a number that is greater than or equal to 1
        else {
            message = "Please enter a number of 1 or greater.";
            displayResults(message);
        }
    }

    private void calcDiscount() {
        //Declare and initialize variables
        double articlePrice = 0.0;
        String pricingCode = "";
        double discountAmount = 0.0;
        double totalPrice = 0.0;
        String message = "";
        
        //Get user input for article price
        message = "Enter the price of the article.";
        articlePrice = Double.parseDouble(getUserInput(message));
        
        //Get user input for pricing code
        message = "Enter the pricing code.";
        pricingCode = getUserInput(message);
        
        //Convert article price to cents to avoid rounding errors
	articlePrice = articlePrice * 100;
            
        //Determine discount based on pricing code
        switch(pricingCode.toUpperCase()){
            case "H":
                discountAmount = 0.5 * articlePrice;
                break;
            case "F":
                discountAmount = 0.4 * articlePrice;
                break;
            case "T":
                discountAmount = 0.3 * articlePrice;
                break;
            case "Q":
                discountAmount = 0.2 * articlePrice;
                break;
            case "Z":
                discountAmount = 0.0;
                message = "No Discount.";
                displayResults(message);
                break;
            default:
                message = "Invalid Pricing Code.";
                displayResults(message);
                break;
        }
        //Calculate discounted price
        totalPrice = articlePrice - discountAmount;
        
        //Convert cents back to dollars for output
	articlePrice = articlePrice / 100;
	discountAmount = discountAmount / 100;
	totalPrice = totalPrice / 100;
        
        //Display results
        message = "Original price: $" + String.format("%1$.2f", articlePrice);
        displayResults(message);
        message = "Discount Amount: $" + String.format("%1$.2f", discountAmount);
        displayResults(message);
        message = "Discounted price: $" + String.format("%1$.2f", totalPrice);
        displayResults(message);
    }
    
    private String getUserInput(String message){
        //Declare and initialize variables
        String userInput = "";
        
        //Declare and instantiate Scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt end-user with message
        System.out.println(message);
        
        //Set input into the variable userInput
        userInput = input.nextLine();
        
        return userInput;
    }

    private void displayResults(String message) {
        //Display message
        System.out.println(message);
    }
}
