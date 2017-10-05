package com.company;

/**
 * Created by bma on 10/1/17.
 */
import java.util.Random;

public class DieOne implements Comparable<DieOne>{
    private static Random rand = new Random();
    private int currentValue;

    // constructor
    public DieOne(){
        this.roll();
    }

    // mutator - define how data for this object can change
    public void roll(){
        currentValue = rand.nextInt(6)+1;
    }

    public int getValue(){
        return currentValue;
    }
    public void setValue(int a) {
        this.currentValue = a;
    }

    @Override
    public String toString(){
        return "DieOne: " + currentValue;
    }

    @Override
    public boolean equals( Object o ){
        if( !(o instanceof DieOne) ){
            return false;
        }
        return ((DieOne)o).currentValue == this.currentValue;
    }

    @Override
    public int compareTo( DieOne d ){
        return this.currentValue - d.currentValue;
    }

}