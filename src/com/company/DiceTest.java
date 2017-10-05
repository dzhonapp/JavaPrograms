package com.company;

import org.omg.CORBA.Object;

/**
 * Created by bma on 10/1/17.
 */
/*
   CS250 Fall 2017
   Covert
   Lsb file for 9/29/17
   Test class for Dice
*/

public class DiceTest{
    public static void main( String[] args ){
        //DieOne d1 = new DieOne();
        //DieTwo d2 = new DieTwo();

        //System.out.println( d1 );
        //System.out.println( d2 );

        int[] dice = { 6, 5, 4, 6, 6, 5, 4, 2 };


      DieOne[] dieArray = new DieOne[9];
        for (int i =0; i<dieArray.length; i++) {
            dieArray[i] = new DieOne();
            System.out.println(dieArray[i]);
        }

        System.out.println("After Sorting" );
        bubbleSort(dieArray);
        for (int i=0; i<dieArray.length; i++){
            System.out.println(dieArray[i]);
        }







    }

    public static void bubbleSort( DieOne[] a ){
        for( int j = a.length - 1; j > 0 ; j-- ){
            boolean swapped = false;
            for( int i = 0; i < j; i++ ){
                if( a[i].getValue() > a[i+1].getValue() ){
                    swapped = true;
                    swap( a, i, i+1 );
                }
            }
            if( !swapped )
                return;
        }
    }

    public static void swap (DieOne [] a, int i, int j){
        DieOne temp = (DieOne) a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    // Here is another method of swapping just works for this only!
//    public static void swap( DieOne[] a, int i, int j ){
  //       int temp = a[i].getValue();
    //    a[i].setValue(a[j].getValue());
      //  a[j].setValue(temp);
 //   }
}

