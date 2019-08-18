/*
 * Written By: Curtis Hempstead
 * Project 02 
 * Date Written: 6/30/2017
 * 
 * Purpose: Provides Die class and method with default sides, variance sides,
 * roll method to generate value and getter method.
 * 
 */
package Project02.business;

public class Die {
    private int sides; //six sided die
    private int value; //variable number of sided die
    
    public Die(){ //default 6 sides
        sides = 6;
    }
    public Die(int sides){ //allow variable of sides
        this.sides = sides;
    }
    public void roll(){ //roll method to determine value
        value=1+(int)(Math.random()*sides);
    }
    public int getValue(){ //getter for value
        return value;
    }
}
