/*
 * Written By: Curtis Hempstead
 * Project 02
 * Date Written: 6/30/2017
 * 
 * Purpose: Runs pairOfDice constructor and object, printing out to the user the
 * individual die value, runs if statement to check for win conditions, and
 * prompts user if they wish to roll.
 * 
 * Description; Project was to create a program that used a Die class
 * and corresponding roll(), and get methods that defaulted the number of sides 
 * of the die to 6, but allowed a variable of sides to be input if desired.  
 * Then using the die object, create two die objects that would receive their
 * own individual values via a roll() method, then sum the values in a getSum()
 * method.  Finally, in the DiceRollerApp class, print out a prompt to the user
 * if they wish to roll, if "y" or "Y" then create a new PairOfDice object, roll the
 * dice using the roll() method, then check for win conditions.  If the dice
 * have the sum of 7, program prints out "Craps!".  If both die equal a value
 * of 1, print out "Snake Eyes!".  If both die equal a value of 6, print out
 * "Box Cars!".  After, prompt user if they wish to roll again, if any string
 * besides "y" or "Y" is entered, then the program will end.
 */

package Project02.presentation;

import Project02.database.PairOfDice;
import java.util.Scanner;

public class DiceRollerApp {
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to the Paradise Roller\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll the dice? (y/n): ");
        String displayAnother = sc.nextLine();
        int rollCount=0;
        while (displayAnother.equalsIgnoreCase("y") || displayAnother.equalsIgnoreCase("Y")){
            rollCount++;
            PairOfDice pairOfDice = new PairOfDice();
            pairOfDice.roll();
            System.out.println("\nRoll "+rollCount+":   "+pairOfDice.getValue1()+" & "+pairOfDice.getValue2());
            if (pairOfDice.getSum()==7){
                System.out.println("Craps!");
            } else if (pairOfDice.getValue1()==1 && pairOfDice.getValue2()==1){
                System.out.println("Snake eyes!");
            } else if (pairOfDice.getValue1()==6 && pairOfDice.getValue2()==6){
                System.out.println("Box cars!");
            }
            System.out.print("\nRoll again? (y/n): ");
            displayAnother = sc.nextLine();
        }
    }
}

