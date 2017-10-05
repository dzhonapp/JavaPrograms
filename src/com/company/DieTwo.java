package com.company;

/**
 * Created by bma on 10/1/17.
 */
import java.util.Random;

public class DieTwo implements Comparable<DieTwo>{
    private static Random rand = new Random();
    private final int currentValue;

    // constructor
    public DieTwo(){
        currentValue = rand.nextInt(6)+1;
    }

    public int getValue(){
        return currentValue;
    }

    @Override
    public String toString(){
        return "DieTwo: " + currentValue;
    }

    @Override
    public boolean equals( Object o ){
        if( !(o instanceof DieTwo) ){
            return false;
        }
        return ((DieTwo)o).currentValue == this.currentValue;
    }

    @Override
    public int compareTo( DieTwo d ){
        return this.currentValue - d.currentValue;
    }

}