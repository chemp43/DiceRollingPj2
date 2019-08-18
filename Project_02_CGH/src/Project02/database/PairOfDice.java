/*
 * Written By: Curtis Hempstead
 * Project 02 
 * Date Written: 6/30/2017
 * 
 * Purpose: Provides PairOfDice method using Die class methods as objects to
 * generate a roll method for two dice, their individual values and sums.
 * 
 */
package Project02.database;

import Project02.business.Die;

public class PairOfDice {
    private Die die1; //Die class instance variable for die 1
    private Die die2; //Die class instance variable for die 2
    private int sum; //instance variable to store sum
    
    
    public PairOfDice(){  //decalre to two 6-sided dice
        die1 = new Die();
        die2 = new Die();
    }
    public PairOfDice(int sides){ //allow varianle number of sides for dice
        this.die1=new Die(sides);
        this.die2=new Die(sides);
    }
    public void roll(){ //call each die's roll method
        die1.roll();
        die2.roll();
    }
    public int getValue1(){ //get value of die1
        die1.getValue();
        return die1.getValue();
    }
    public int getValue2(){ //get value of die2
        die2.getValue();
        return die2.getValue();
    }
    public int getSum(){ //get sum of both dce
        sum=die1.getValue()+die2.getValue();
        return sum;
    }
}
