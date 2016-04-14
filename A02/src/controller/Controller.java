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
        displayGreeting();
    }

    private void displayGreeting() {
        //Declare and initialize variables
        String firstName;
        String lastName;
        String greeting;
        
        //Declare and instantiate Scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt end-user for first name
        System.out.println("Please enter your first name.");
        
        //Set input into the variable firstName
        firstName = input.next();
        
        //Prompt end-user for last name
        System.out.println("Please enter your last name.");
        
        //Set input into the variable lastName
        lastName = input.next();
        
        //Set greeting
        greeting = "Hi, " + firstName + " " + lastName;
        
        //Display greeting
        System.out.println(greeting);
    }
    
} //end class
