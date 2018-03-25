/*
 * Gabriel hurtado
 * March 10th,2018
 * this program will allow customers to see the toal price of their meal after
 * entering the number of burgers, fries  or drinks , the final price will be based on taxes and tips.
 */
package fastfood;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class FastFood {

    private static double TotalBill;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // naming the variables
         Scanner scanner =  new Scanner( System.in );
        double friescost; 
        double burgerCost; 
        double Tax;
        double tip; 
        double TotalBil; 
        double softdrinks ; 
        // here with the scanner, the user will be able to press enter everytime they enter the number of food. 
        // Basically pressing enter 3 times to get the final price. 
       System.out.println( " Please enter the number of Fries: " );
       System.out.println( " Please enter the number of Burgers: " );
       System.out.println( " Please enter the number of Soft Drinks: " );
       
         friescost = scanner.nextDouble();
         burgerCost = scanner.nextDouble();
         softdrinks = scanner.nextDouble();
         
        Tax = (friescost + burgerCost + softdrinks * 0.13); 
        friescost = 1.89;
        burgerCost = 2.49;
        softdrinks = 0.99; 
        tip = 0.5 * Tax; 
        TotalBill = (friescost + burgerCost + softdrinks + Tax + tip);
        
    
        System.out.println( " Cost of your meal $" + TotalBill);
    }
    
}
