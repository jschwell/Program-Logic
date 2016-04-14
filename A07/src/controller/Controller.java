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
        //Declare and initialize variables
        String message = "";
        double[] precipitation = null;
        
        // Section B (1-D)
        message = "This program will allow you to enter in as many words as you\n" +
                "would like. You can quit entering words by entering a Q.";
        giveInstructions(message);  //Call to the method giveInstructions()
        getSentence();              //Call to the method getSentence()
        
        // Section B (2-D)
        message = "This program will allow you to enter in your students' names " +
                "and their grades.";
        giveInstructions(message);  //Call to the method giveInstructions()
        recordGrades();             //Call to the method recordGrades()
        
        // Section C
        message = "This program will allow you to enter the precipitation\n" + 
                  "in inches for each month.";
        giveInstructions(message);           //Call to the method giveInstructions()
        precipitation = getPrecipitation();  //Instantiate array  
        calcPrecipitationAvg(precipitation); //Call to the method calcPrecipitationAvg()
    }//End of constructor
    
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
    }//End of getUserInput
    
    private void giveInstructions(String message){
        System.out.println(message); //Display message
        System.out.println();        //Blank line for looks
    }//End of giveInstructions
        
    private int checkForInteger(String userInput){
        //Declare and initialize variable
        String message = "";
        
        //Check to see if the number is a positive integer
        //If not, run the loop and ask for a positive integer
        while(!userInput.matches("^[0-9]+$")){
            message = "Please enter a positive integer.";
            userInput = getUserInput(message);
        }
        
        System.out.println(); //Blank line for looks
        return Integer.parseInt(userInput); //Return and convert the String to an integer
    }//End of checkForInteger
    
    private void getSentence(){
        //Declare and initialize variables
        final String QUIT = "Q";
        int i = 0;
        int numberOfWords = 0;
        String[] sentence = null;
        String userInput = "";
        String message = "";
        
        //Prompt end-user for number of words and set input into userInput
        //Check if userInput is an integer and set it into numberOfWords
        message = "How many words do you want to enter?";
        userInput = getUserInput(message);
        numberOfWords = checkForInteger(userInput);
        
        //Instantiate array
        sentence = new String[numberOfWords];
        
        //Prompt end-user for a word and set input into userInput
        message = "Please enter a word or Q to quit.";
	userInput = getUserInput(message);
        
        //If userInput is not equal to Q and i is less than numberOfWords,
        //run the loop
        while(!userInput.equalsIgnoreCase(QUIT) && i < numberOfWords){
            sentence[i] = userInput;
            i++; //Advance to the next array element
            if(i < numberOfWords){
                //Prompt end-user for a word and set input into userInput
                message = "Please enter a word or Q to quit.";
                userInput = getUserInput(message);
            }
        }
        
        displaySentence(sentence, i);   //Call the method displaySentence
    }//End of getSentence
    
    private void displaySentence(String[] array, int numberOfEntries){
        System.out.println();   //Blank line for looks
        
	//Check if there are any entries in the array
	if(numberOfEntries > 0){
            System.out.print("You entered:");
            //Display each entry
            for(int i = 0; i < numberOfEntries; i++){				
            	System.out.print(" " + array[i]);
            }
            System.out.print(".\n");
	}
	else{ //There are no entries
            System.out.println("Perhaps you will have time later to enter data.");
	}
        
	System.out.println();   //Blank line for looks
	System.out.println("Thanks for participating!");
    }//End of displaySentence
    
    private void recordGrades(){
        //Declare and initialize variables
	int numberOfStudents = 0;
	int numberOfTests = 0;
        String[][] grades = null;
        String userInput = "";
        String message = "";
        
        //Prompt end-user for number of students and set input into userInput
        //Check if userInput is an integer and set it into numberOfStudents
        message = "How many students do you have?";
        userInput = getUserInput(message);
        numberOfStudents = checkForInteger(userInput);
        
        //Prompt end-user for number of tests and set input into userInput
        //Check if userInput is an integer and set it into numberOfTests
        message = "How many test scores do you need to record?";
        userInput = getUserInput(message);
        numberOfTests = checkForInteger(userInput);
        numberOfTests = numberOfTests + 1;
        
        //Instantiate array
        grades = new String[numberOfStudents][numberOfTests];
        
	for(int row = 0; row < numberOfStudents; row++){
            //Prompt end-user for student name and set input into the next row
            message = "Please enter the student's name.";
            grades[row][0] = getUserInput(message);
            for(int col = 1; col < numberOfTests; col++){
                //Prompt end-user for grade and set input into the next column
                message = "Please enter grade for test " + col + ".";
		grades[row][col] = getUserInput(message);				
            }
            System.out.println();   //Blank line for looks
	}
        
        displayGrades(grades);      //Call the method displayGrades
    }//End of recordGrades
    
    public void displayGrades(String[][]grades){
        //Display all students' names and grades
	for(int row = 0; row < grades.length; row++){
            for(int col = 0; col < grades[row].length; col++){				
                System.out.print( grades[row][col] + "\t");
            }
            System.out.println();   //Blank line for looks
	}	
    }//End of displayGrades

    private double[] getPrecipitation(){
        //Declare and initialize variables
        final int SIZE = 12;
        int i = 0;
        double[] precipitation = new double[SIZE];
        String userInput = "";
        String message = "";
        String month = "";
                
        while(i < SIZE){
            //Get month name
            month = checkMonth(i);
            //Prompt end-user for precipitation and set input into userInput
            message = "Please enter the precipitation for " + month + ".";
            userInput = getUserInput(message);
                
            //If userInput is a number, put the userInput value into the array
            if(userInput.matches("^[0-9\\.]+$")){
		precipitation[i] = Double.parseDouble(userInput);
		i++; //Advance to the next array element
            }
        }
        
        return precipitation;   //Return the array
    }//End of getPrecipitation
    
    private void calcPrecipitationAvg(double[] array){
        //Declare and initialize variables
        double total = 0.0;
        double average = 0.0;
        
        //Add each array element to the total
        for(int i = 0; i < array.length; i++){				
            total += array[i];
        }
        //Calculate the average
        average = total / array.length;
                
        displayPrecipitation(array, total, average); //Call the method displayPrecipitation
    }//End of calcPrecipitationAvg
    
    private void displayPrecipitation(double[] array, double total, double average){
        //Declare and initialize variable
        String month = "";
        
        System.out.println();   //Blank line for looks
        
        //Display each month's precipitation
        for(int i = 0; i < array.length; i++){	
            month = checkMonth(i);
            System.out.println(month + " - " + array[i] + " inches");
        }
        
        System.out.println();   //Blank line for looks
        System.out.println("The total amount of precipitation for the year was: " +
                String.format("%.2f", total) + " inches");//Display the total precipitation
        System.out.println("The average amount of precipitation for the year was: " + 
                String.format("%.2f", average) + " inches");//Display the average precipitation		
    }//End of displayPrecipitation
    
    private String checkMonth(int number){
        //Declare and initialize variable
        String month = "";
        //Choose the month name based on the iteration
        switch(number){
            case 0:
                month = "January";
                break;
            case 1:
                month = "February";
                break;
            case 2:
                month = "March";
                break;
            case 3:
                month = "April";
                break;
            case 4:
                month = "May";
                break;
            case 5:
                month = "June";
                break;
            case 6:
                month = "July";
                break;
            case 7:
                month = "August";
                break;
            case 8:
                month = "September";
                break;
            case 9:
                month = "October";
                break;
            case 10:
                month = "November";
                break;
            case 11:
                month = "December";
                break;
        }
        return month; //Return the month name
    }//End of checkMonth
}//End of class
