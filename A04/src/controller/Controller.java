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
        getUserValue();     //Part B
        randomTimesTen();   //Part C
        getScoreAverage();  //Part D
    }
    
    //Start of Part B
    private void getUserValue() {
        //Declare and initialize variables
        int myValue = 0;

	//Declare and instantiate Scanner object
        Scanner input = new Scanner(System.in);

	//Prompt end-user for an integer
        System.out.println("Please enter an integer.");
        
	//Set input into the variable myValue
        myValue = input.nextInt();

	//Call timesTen()
        timesTen(myValue);
    }

    private void timesTen(int myValue) {
        //Declare and initialize variables
        int myNewValue = 0;
        
        //Multiply myValue times ten
        myNewValue = 10 * myValue;
        
        //Call displayResults()
        displayResults(myNewValue);
    }
    
    private void displayResults(int num1) {
        //Display number
        System.out.println("Your number times ten is:" + " " + num1);
    }
    
    //Start of Part C
    private void randomTimesTen() {
        //Declare and initialize variables
        int myValue = 0;
        int myNewValue = 0;
        
        //Set myValue equal to a random number
        myValue = (int)(Math.random()*100);
        
        //Set myNewValue equal to ten times myValue
        myNewValue = 10 * myValue;
        
        //Call displayResults()
        displayResults(myValue, myNewValue);
    }
    
    private void displayResults(int num1, int num2) {
        //Display numbers
        System.out.println("A random number is:" + " " + num1);
        System.out.println("The random number times ten is:" + " " + num2);
    }
    
    //Start of Part D
    private void getScoreAverage() {
        //Declare and initialize variables
        double testScore1 = 0.0;
        double testScore2 = 0.0;
        double testScore3 = 0.0;
        double average = 0.0;
        
        //Get test scores from getUserInput()
        testScore1 = getUserInput();
        testScore2 = getUserInput();
        testScore3 = getUserInput();
        
        //Send the test scores to the function calcAverage
        average = calcAverage(testScore1, testScore2, testScore3);
        
        //Send results to displayResults
        displayResults(testScore1, testScore2, testScore3, average);
    }

    private double getUserInput() {
        //Declare and initialize variables
        double testScore = 0.0;
        
        //Declare and instantiate Scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt end-user for a test score
        System.out.println("Please enter a test score.");
        
        //Set input into the variable testScore
        testScore = input.nextDouble();
        
        //Send testScore back to getScoreAverage()
        return testScore;
    }

    private double calcAverage(double num1, double num2, double num3) {
        //Declare and initialize variables
        double average = 0.0;
        
        //Calculate average
        average = (num1 + num2 + num3) / 3;
        
        //Send average back to getScoreAverage()
        return average;
    }

    private void displayResults(double num1, double num2, double num3, double average) {
        //Display test scores
        System.out.println("Test score #1:" + " " + num1);
        System.out.println("Test score #2:" + " " + num2);
        System.out.println("Test score #3:" + " " + num3);
        
        //Display average
        System.out.println("The average is:" + " " + average);
    }
    
    
}
