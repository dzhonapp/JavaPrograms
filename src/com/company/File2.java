package com.company;


/*
* Homework 1 Due Wedsnday, 9/20/2017 by 4.30pm
* @Author Berdimyrat Mammedov (Murad) WIU ID: 917-21-9181
*  Description of programs, the file contains indexOf, swaping, Bubble
*  sorting algorithms in acsending and descending orders, printing and copying arrays!
 */

public class File2 {
// Beginning of my Methods

    //IndexOf method however doesn't check for array
    public static int indexOf(int[] a, int key) {
        /**
         * Desc:This method takes as argument an array and integer and checks if there is in array the item what we are looking for and returns it's index number
         * otherwise it returns -1 if not fount the item!
         * Returns - Int!
         */

        if (a == null) {
            System.out.println("Sorry Array is null!");
            return -1;
        }
        else if (a.length<1) {
            System.out.println("I thing your array is empty!");
            return -1;
        }
        else if
            (key<0 || key>a.length-1) {
                System.out.println("Sorry you are out of range of array!");
                return -1;
        }
        for (int i = 0; i < a.length; i++) {
                if (a[i] == key) {
                    return i;
                }
            }//End For Loop
        return -1;
        }

    // End Method IndexOf


    public static void swap (int[] a, int i, int j){
        /**
         * Desc:This method takes as parameter an array of integers and 2 integers within the length of the array! Then swapping the values at given index, i,j.
         * Returns - VOID!
         */
        //Check if array is null
        if (a == null) {
            System.out.println("Your array doesn't contain anything! Try another!");
            return;
        }
        else if (a.length<1) {
            System.out.println("I thing your array is empty!");
            return ;
        }
        // Check if integers given out of range of length of array!
        else if (i<0 || j < 0 || i>a.length-1 || j>a.length-1) {
            System.out.println("Swap Unsuccessful! You are out of range of array length! Write something between 0 and " + a.length);
            return;

        }
        // Actual swapping!
        else {
            int temp;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        } // End If else

    } // end method swap


// COPY ARRAY method

    public static int [] copyArray(int[] a) {
        /**
         * Desc:This method takes an array of integers as an argument! does same as System.arraycopy
         * Returns - Array
         *
         */
        if (a == null ) {
            System.out.println("This is null array");
            return a;
        }
        if (a.length<1) System.out.println("Sorry but nothing to copy!!");
        int b[] = new int[a.length];
        for (int i =0; i<a.length; i++) {
            b[i]=a[i];
        }
        return b;

    }// end of COPY ARRAY methods


    // Print method
    public static void print(int [] a) {
        /**
         * Desc:This method prints each element in the array given as parameter!
         * Returns - Prints in seperate line the elements in array! if any!
         */
        if (a == null) {System.out.println("Your array is NULL");
        return;}
        if (a.length<1) { System.out.println("You have nothing to print in your array!");
        return;}

        for (int i: a) {
            System.out.println(i);
        }
    } // END of Print method!

    public static double average(int[] a) {
/**
 * Desc:This method adds each element in the array given as parameter divides into length of array to get average!
 * Returns - double
 */
        if (a == null) {
            System.out.println("Your array is null!");
            return -1.0;
        }
        if (a.length<1) {
            System.out.println("Your array is empty!");
            return -1.0;
        }

        int sum=0;
        for(int i: a) {
            sum+=i;
        }
        return sum/a.length;
    }

    public static void buble_sort_acsending (int[] array) {
        int temp; // Temporary variable which holds less number in array
        boolean replace; // Flag.
        if (array == null) {
            System.out.println("Array is null! ");
        return;
        }

        do
        {	replace = false;
            for (int z = 0; z < (array.length - 1); z++)  // Swapping procedure
            {
                if (array[z] > array[z + 1])
                {
                    temp = array[z];
                    array[z] = array[z + 1];
                    array[z + 1] = temp;
                    replace = true;
                }
            }
        } while (replace);
    }
        // When there is nothing to replace it will be false and quit.

public static void bubleSortDescending(int[] a) {
    if (a == null) {
        System.out.println("Array is null! ");
        return;
    }
    else if (a.length<2) {
        return;
    }
        int temp;
        boolean repl;
        do {
            repl = false;
            for (int y = 0; y < a.length-1; y++) {
                if (a[y]<a[y+1]) {
                    temp = a[y];
                    a[y] = a[y+1];
                    a[y+1] = temp;
                    repl = true;
                }

            }
        }
        while (repl);


    }

    }












/*
* Lab 2, File2
*
@author Jason Covert
 * @author 2nd Berdimyrat Mammedov (Murad), WIU ID: 917-219181
 *
 *


// Step 6 Created


public class File2 {

    // //STEP 8. Add the following method to FIle2

    public static void bar() {
       System.out.println("Ran method named bar! " );
        Main.foo();
   }

    //STEP 9. Add a loop to main in File2;
//public static void main(){

  //  for (int i=0; i<15; i++) {

        //bar();

    //}


}

} // End of class

 */