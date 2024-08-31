/*
 * Program: CostOfShipping.java
 * Programmer: Lydia Frame 
 * 
 * Purpose: Write a program that prompts the user to enter the weight of the package
 * and displays the shipping cost. If the weight is negative or zero, display a message “Invalid input.” 
 * If the weight is greater than 20, display a message “The package cannot be shipped.” 
 * Shipping cost per pound $1.50. 
 */
package costofshipping; 
 import java.util.Scanner;
 
 public class CostOfShipping {
     public static void main(String[] args){
         
         //Create Scanner
         Scanner input = new Scanner(System.in);
 
         //Variables 
         double PerPound = 1.50;
         double weight; 
         double shipping;
 
         //Prompt user to enter weight of package in pounds
         System.out.print("Enter package weight in pounds: "); 
         weight = input.nextDouble();
 
         //Determin wether inpute is invalid or exceds weight limit output appropriate message 
         if (weight <= 0){
            System.out.println ("Invalid input.");
         }
         else if (weight > 20){
            System.out.println("The package cannot be shipped."); 
         }
         else {
            shipping = weight * PerPound;
            System.out.println("Shipping cost: $" + shipping);
         }
 
        input.close();
     }
 }
