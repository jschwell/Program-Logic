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
        giveInstructions();
        getUserInput();
    }
    
    private void giveInstructions(){
        //Tell user what the program does
        System.out.println("This program mixes a primary color of your choice with a primary color chosen by the computer.");
        System.out.println(); //Blank line for looks
    }

    private void getUserInput() {
        //Declare and initialize variables
        String userColor = "";
        String randomColor = "";
        int userAttempts = 0;
        final int TOTAL_ATTEMPTS = 3;
        
        //Declare and instantiate Scanner object
        Scanner input = new Scanner(System.in);
        
        
        //Prompt end-user for a primary color
        System.out.println("Please enter a primary color.");
        
	//Set input into the variable userColor
        userColor = input.next();
        System.out.println(); //Blank line for looks
        
        //Validate the primary color and give the user so many attempts
        while(!colorIsValid(userColor) && userAttempts < TOTAL_ATTEMPTS){
            //Increment userAttempts and account for the entry outside the loop
            userAttempts++;
            
            if(userAttempts < TOTAL_ATTEMPTS){
                //Prompt end-user for a primary color
                System.out.println("Please enter a primary color. You have " + 
                        (TOTAL_ATTEMPTS - userAttempts) + " attempt(s) left.");

                //Set input into the variable userColor
                userColor = input.next();
                System.out.println(); //Blank line for looks
            }
        }
        
        //Check if the color is valid in case all attempts have been used
        if(userAttempts < TOTAL_ATTEMPTS){
            //Generate a random primary color and set input into randomColor 
            randomColor = generateColor();
            //Call the method colorMixer()
            colorMixer(userColor, randomColor);
        }
        else {
            //Display message that all attempts have been used and end the program
            System.out.println("You have used all " + TOTAL_ATTEMPTS + 
                    " attempts. Please try again later.");
            System.exit(0);
        }
    }

    private boolean colorIsValid(String entry) {
        //Declare and initialize variables
        boolean isValid = false;
        
        //If entry equals a primary color, set isValid to true
        if(entry.equalsIgnoreCase("blue") || entry.equalsIgnoreCase("red") || entry.equalsIgnoreCase("yellow")){
            isValid = true;
        }
        
        return isValid;
    }

    private String generateColor() {
        //Declare and initialize variables
        int colorValue = 0;
        String colorName = "";
        
        //Generate a random number
        colorValue = (int)(Math.random() * 3) + 1;
        
        //Determine color name based on color value
        switch(colorValue){
            case 1:
                colorName = "blue";
                break;
            case 2:
                colorName = "red";
                break;
            case 3:
                colorName = "yellow";
                break;
        }
        
        return colorName;
    }

    private void colorMixer(String userColor, String randomColor) {
        //Declare and initialize variables
        String mixedColor = "";
        
        //Determine mixed color based on combination of userColor and randomColor
        if(userColor.equalsIgnoreCase("blue")){
            if(randomColor.equalsIgnoreCase("red")){
                mixedColor = "purple";
            }
            else if(randomColor.equalsIgnoreCase("yellow")){
                mixedColor = "green";
            }
            else { //randomColor is equal to blue
                mixedColor = "blue";
            }
        }
        else if(userColor.equalsIgnoreCase("red")){
            if(randomColor.equalsIgnoreCase("blue")){
                mixedColor = "purple";
            }
            else if(randomColor.equalsIgnoreCase("yellow")){
                mixedColor = "orange";
            }
            else { //randomColor is equal to red
                mixedColor = "red";
            }
        }
        else { //userColor is equal to yellow
            if(randomColor.equalsIgnoreCase("blue")){
                mixedColor = "green";
            }
            else if(randomColor.equalsIgnoreCase("red")){
                mixedColor = "orange";
            }
            else { //randomColor is equal to yellow
                mixedColor = "yellow";
            }
        }
        
        //Display userColor, randomColor, and mixedColor
        System.out.println("Your choice of " + userColor.toUpperCase() + 
                ", mixed with my choice of " + randomColor.toUpperCase() +
                " makes " + mixedColor.toUpperCase() + ".");
        System.out.println(); //Blank line for looks
        
        //Call mixAgain() to check if the user wants to mix another color
        mixAgain();
    }

    private void mixAgain() {
        //Declare and initialize variables
        String reply = "";
        
        //Declare and instantiate Scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt end-user for a primary color
        System.out.println("Would you like to mix another color?");
        
	//Set input into the variable userColor
        reply = input.next();
        System.out.println(); //Blank line for looks
        
        //Check to see if the reply is yes
        if(reply.equalsIgnoreCase("yes")){
            //Run the program again
            getUserInput();
        }
        else{
            //Display a thank you message and end the program
            System.out.println("Thank you for participating!");
            System.exit(0);
        }
    }
    
}
