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
        operatorPrecedence();
    }

    private void operatorPrecedence() {
        //Declare and initialize variables
        int results1 = 0;
        int results2 = 0;
        int results3 = 0;
        int results4 = 0;
        int results5 = 0;
        int results6 = 0;
        double results7 = 0.0;
        double results8 = 0.0;
        double results9 = 0.0;
        int results10 = 0;
        
        //Apply parens and calculate results1
        results1 = (25 * 10) / 2;
        
        //Display results1
        System.out.println("results1 is: " + results1);
        
        //Apply parens and calculate results2
        results2 = 3 + (4 * 5);
        
        //Display results2
        System.out.println("results2 is: " + results2);
        
        //Apply parens and calculate results3
        results3 = (3 + 4) * 5;
        
        //Display results3
        System.out.println("results3 is: " + results3);
        
        //Apply parens and calculate results4
        results4 = (1 + 2 + 3) - 4 + 5;
        
        //Display results4
        System.out.println("results4 is: " + results4);
        
        //Apply parens and calculate results5
        results5 = 1 + 2 + 3 - (4 + 5);
        
        //Display results5
        System.out.println("results5 is: " + results5);
        
        //Apply parens and calculate results6
        results6 = (20 * 10) / 2;
        
        //Display results6
        System.out.println("results6 is: " + results6);
        
        //Apply parens and calculate results7
        results7 = (2.0 / 3.0) * 3 * 3;
        
        //Display results7
        System.out.println("results7 is: " + results7);
        
        //Apply parens and calculate results8
        results8 = 2.0 / (3 * 3) * 3;
        
        //Display results8
        System.out.println("results8 is: " + results8);
        
        //Apply parens and calculate results9
        results9 = 2.0 / (3 * 3 * 3);
        
        //Display results9
        System.out.println("results9 is: " + results9);
        
        //Apply parens and calculate results10
        results10 = 2 * (2 - 2);
        
        //Display results5
        System.out.println("results10 is: " + results10);
    }
    
}
