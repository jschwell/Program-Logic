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
       //getSomethingFor();       //Part B - For Loop
       //getSomethingWhile();     //Part B - While Loop
       //calcSum();               //Part C
       getUserNumber();         //Part D
       //createGridOfStars();     //Part E - While Loop
       //createGridOfPluses();    //Part E - For Loop
    }

    private void getSomethingFor() {
        //Declare and initialize variables
        String userInput = "";
        String message = "";
        
        for(int i = 0; i < 5; i++){
            //Prompt end-user to enter something and set input into userInput
            message = "Please enter something.";
            userInput = getUserInput(message);
            
            //Display the end-user input
            message = "You entered: " + userInput + "\n";
            displayResults(message);
        }
        
        //Display thank you message afer loop ends
        message = "Thanks for participating!";
        displayResults(message);
    }
    
    private void getSomethingWhile() {
        //Declare and initialize variables
        String userInput = "";
        String message = "";
        int counter = 0;
        
        while(counter < 5){
            //Prompt end-user to enter something and set input into userInput
            message = "Please enter something.";
            userInput = getUserInput(message);
            
            //Display the end-user input
            message = "You entered: " + userInput + "\n";
            displayResults(message);
            
            //Add one to counter
            counter++;
        }
        
        //Display thank you message afer loop ends
        message = "Thanks for participating!";
        displayResults(message);
    }
    
    private void calcSum() {
        //Declare and initialize variables
        double number = 0.0;
        double total = 0.0;
        String message = "";
        
        //Prompt end-user for a number and set input into number
        message = "Please enter a number. \nWhen you want to quit, just enter the number zero.";
        number = Double.parseDouble(getUserInput(message));
        
        //Display number back to user
        message = "Number entered: " + number + "\n";
        displayResults(message);
            
        while(number != 0){
            //Add number to total (Do first so number outside of loop is added)
            total += number;
            
            //Prompt end-user for another number and set input into number
            message = "Please enter another number or zero to quit.";
            number = Double.parseDouble(getUserInput(message));
            
            //Display number back to end-user
            message = "Number entered: " + number + "\n";
            displayResults(message);
        }
        
        //Display total and good bye message
        message = "Total of all numbers entered: " + total + "\nGood bye!";
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

    private void getUserNumber() {
        //Declare and initialize variables
        int entry = 0;
        boolean isEven = false;
        
        //Declare and instantiate Scanner object
	Scanner input = new Scanner(System.in);
        
        //Prompt end-user to enter an even number
	System.out.println("This program only accepts even numbers");
	System.out.println("Please enter an even number");
	
        //Set input into the variable entry
	entry = input.nextInt();
	
        //Check if entry is even
	isEven = getEvensOnly(entry);
		
	if(isEven){
            //Display message and end program
            System.out.println("Thanks for entering an even number");
            System.exit(0);
	}
	else{
            input.next();//clear the scanner
	}
    }
    
    private boolean getEvensOnly(int entry) {
        //Declare and initialize variables
	boolean isEven = true;
        
        //If entry is not even, ask for user input again
	while (!checkForEven(entry)) {
            isEven = false;
            getUserNumber();
	}
	return isEven;	
    }
    
    private boolean checkForEven(int entry){
        //Declare and initialize variables
	boolean isEven = false;
        
        //If entry is even, set isEven to true
	if(entry % 2 == 0){
            isEven = true;
	}
	return isEven;
    }

    private void createGridOfStars() {
        //Declare and initialize variables
        int outerCount = 0;
	int innerCount = 0;
        //Declare constant
	final String STAR = " * ";
	
        //Run the outside loop 5 times
	while(outerCount < 5){
            //Run the inside loop 5 times every time the outside loop runs
            while(innerCount < 5){
                //Display an "*"
		System.out.print(STAR);     
                //Add one to innerCount
		innerCount++;               
            }//end the inner while loop	
            
            //Display line break
            System.out.println();
            //Reset innerCount
            innerCount = 0; 
            //Add one to outerCount
            outerCount++;
	}//end the outer while loop	
    }

    private void createGridOfPluses() {
        //Declare and initialize variables
        int outerCount = 0;
	int innerCount = 0;
        //Declare constant
	final String PLUS = " + ";
	
        //Run the outside loop 5 times
	for(outerCount = 0; outerCount < 5; outerCount++){
            //Run the inside loop 5 times every time the outside loop runs
            for(innerCount = 0; innerCount < 5; innerCount++){
                //Display a "+"
		System.out.print(PLUS);
            }//end the inner for loop	
            
            //Display line break
            System.out.println();
            //Reset innerCount
            innerCount = 0;
	}//end the outer for loop	
    }

    

    
}
