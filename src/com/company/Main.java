package com.company;

import dsaj.design.ArithmeticProgression;
import dsaj.design.FibonacciProgression;
import dsaj.design.GeometricProgression;
import dsaj.design.Progression;

import dsaj.primer.CreditCard;

import java.io.PrintStream;

import java.util.Scanner;
import java.*;


public class Main {
   /*
   Lab : Practice with polymorphism, using Progression Have you extracted the source code?
   Do you understand Classpath/Import? (if not learn it)
   Progression p = new Arithmetic Progression();

    */
    public static void main(String[] args) {
        Progression p = new ArithmeticProgression(3, 5);
        System.out.println("Arithmetic Progressions! ");
        p.printProgression(8);
        p.printProgression(10);

        //1st Progression
        Progression a = new ArithmeticProgression(5, 10);
        a.printProgression(14);
        //2nd Progression
        Progression b = new ArithmeticProgression(3, 5);
        b.printProgression(16);
        //3rd Progression


        Progression c = new ArithmeticProgression(-1, 11); // Decreases instead of increasing

        c.printProgression(18);

        Progression d = new ArithmeticProgression(); // Default Construction
        d.printProgression(20);

        System.out.println("");

        System.out.println("Geometric Progressions power of 2, power of 3 and 10");
        Progression f = new GeometricProgression(2, 1);
        f.printProgression(5);
        Progression g = new GeometricProgression(3, 1);
        g.printProgression(5);
        Progression h = new GeometricProgression(10, 1);
        h.printProgression(5);

//
        System.out.println("");
        System.out.println("Fibonacci Sequence Progression! ");
        Progression e = new FibonacciProgression(0, 1);
        e.printProgression(50);

    } // end main


    } // Class End










 /*
    * Homework 1 Due Wedsnday, 9/20/2017 by 4.30pm
    * @Author Berdimyrat Mammedov (Murad) WIU ID: 917-21-9181
    *  Description of programs, the file contains indexOf, swaping, Bubble
    *  sorting algorithms in acsending and descending orders, printing and copying arrays!

    public static void main(String[] args) {

PrintStream print = new PrintStream(System.out);




CreditCard bankOfAmerica = new CreditCard("Berdimyrat Mammedov", "Bank of America", "3434 3434 1233 5932", 30000, 99383.00);
        bankOfAmerica.makePayment(200000); // It can go to minus!
        bankOfAmerica.printSummary();
        bankOfAmerica.printSummary(bankOfAmerica);
        int [] array = {2, 3, 4, 5,6, 6, 5};
        String s = new String ("Eat at Joe's");
       String t = s.toUpperCase();
        t = t.toLowerCase();
        s = s.toLowerCase();
if (s == t) {
    System.out.println("The strings are equal!");
}


 int a = 6, b, c ;
// reverses just words not letters in it!
String newstring  = "This is my string ! ";
        String[] splitedStrings = newstring.split("\\s");

        for (int i = splitedStrings.length-1 ; i>=0; i--) {
            String revWordsString = splitedStrings[i] + " ";

        }


        // Reverses letters and words
        StringBuilder j = new StringBuilder(newstring);
        j.reverse();
        System.out.println(j);


        System.out.println(Days.Monday);

        int fifty = 50;
        int four = 4;
        int zero = 4;
        System.out.println("and");
        System.out.println(fifty & four);

        System.out.println("OR");
        System.out.println(fifty | four);
        zero = ~zero;
        System.out.println(zero);
        Scanner input = new Scanner(System.in);
        Scanner name = new Scanner (System.in);
      String myName;


        System.out.println("Your name please!");

        System.out.println(name);

        System.out.println("Your age please! ");
        int age = input.nextInt();
        System.out.println(age);
*/


            /*





Homework 1
        int[] nullArray = null;
        int[] emptyArray = {};
        int[] fullArray = {3, 5, 4, 1, 6, 2, 3, 8, 0};
//Testing index of:


        // Printing the index of 3 in array b!
        System.out.println(File2.indexOf(fullArray, 3));

        System.out.println(File2.indexOf(emptyArray, 4));



// Testing Swap
        System.out.println("Before Swapping!");
        for (int i: fullArray) System.out.print(i + ", ");

        File2.swap(fullArray, 4, 5);

        System.out.println("After swapping!");
        for (int i: fullArray) System.out.print(i + ", ");

        System.out.println("Try to pass null array!");
        File2.swap(nullArray, 3, 5);

        System.out.println("Try to pass empty array!");
        File2.swap(emptyArray, 1, 2);


// Testing  Copy Array
        // Copying array b to copiedArray[].
        int[] copiedArray = File2.copyArray(fullArray);

        System.out.println("Printing copied array!");
        for (int i: copiedArray) System.out.print(i + ", ");
        System.out.println(" \n Trying to pass null for copyArray method");
        int[] nullArray1 = File2.copyArray(nullArray);

        System.out.println("Testing to pass empty array for copyArray method!");
        int[] emptyArray1 = File2.copyArray(emptyArray);


// Testing Print Function
        System.out.println("Passing normal array with items in it!");
        File2.print(fullArray);

        System.out.println("Passing as argument empty array to print function !");
        File2.print(emptyArray);

        System.out.println("Passing as argument null array to print function! ");
        File2.print(nullArray);

//Testing average function

        System.out.println("Passing normal array with integers in it to find average!");

        System.out.println(File2.average(fullArray));

        System.out.println("Passing empty array to find average!");
        File2.average(emptyArray);

        System.out.println(" Passing null array to find average!");
        File2.average(nullArray);


// Testing sorting Algorithms!
        System.out.println("Before sorting!");
        for (int i: fullArray) System.out.print(i + ", ");
        File2.buble_sort_acsending(fullArray);
        System.out.println(" \n After Sorting!");
        for (int i: fullArray) System.out.print(i + ", ");
// For Empty array it just doesn't sort !

        System.out.println("Passing null array to sorting function!");
        File2.buble_sort_acsending(nullArray);

// Testing descending bubble sorting funciton

        System.out.println("Before sorting! ");
        for (int i: fullArray) System.out.print(i + ", ");
        System.out.println(" \n After sorting! ");
        File2.bubleSortDescending(fullArray);
        for (int i: fullArray) System.out.print(i + ", ");

    /*
//Methods





   public static void print(int[] a){
       for (int i: a) {
           System.out.print(i);
     }
   }



    // Copy Array

   public static int[] copyArray(int [] a) {

       int[] b = new int[a.length];

        for (int i = 0; i<a.length; i++) {
            b[i]=a[i];
        }
        return b;
    }






    // Swapping method
    public static void swap(int[] a, int i, int j) {
        if (a.length<1){
            System.out.println("Sorry buddy I can't do it with empty array!");
        }

        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }




// Finding IndexOf item.
    public static int indexOf(int[]a, int key) {
        if (a.length<1) {
            System.out.println("Sorry buddy, your array has no item in it!");
        return -1;
        }
        for (int i =0; i<a.length; i++) {
            if (a[i]==key) {
                return i;
            }
        }

        return -1;
    }


    public static void bubbleSort(String arr[])
{
    int n = arr.length;
    for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j].compareTo(arr[j + 1]) > 0) {

                // swap
                String temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
}



    }// END CLASS
/*



// Print items in array of credit cards, (output null)
CreditCard[] mycards = new CreditCard[5];
for (int i =0; i<mycards.length; i++) {
    System.out.println(mycards[i]);

}

        // Create 5 credit card objects
        mycards[0] = new CreditCard("John Bowman", "California Savings",
                "5391 0375 9387 5309", 5000);
        mycards[1] = new CreditCard("John Bowman", "California Federal",
                "3485 0399 3395 1954", 3500);
        mycards[2] = new CreditCard("John Bowman", "California Finance",
                "5391 0375 9387 5309", 2500, 300);
        mycards[3] = new CreditCard("Murad", "BOFA",
                "3444 3445 4443 4456", 1400, 40000);
        mycards[4] = new CreditCard("J Cobalt", "Deutsche Bank", "4556 5667 6894 4432", 13000, 90000000);


//print items in array after declaring objects  in credit card array!
        for (int i =0; i<mycards.length; i++) {
            System.out.println(mycards[i]);
        }

        //Creating the array of String!
        String[] names = {"Me", "You", "He", "She", "balloon", "Entertainment", "MaX", "Thomas", "Tree", "Apple" };
        //Printing the items in the array!
        System.out.println("Before sorting!");
        for (String name:names) System.out.println(name);

bubbleSort(names);

        System.out.println("After sorting! ");
        for (String name:names) System.out.println(name);
CreditCard card = mycards[0];
        CreditCard.printSummary(card);


//        for (CreditCard card:mycards) {
  //          CreditCard.printSummary(card);
    //    }

// End of credit card













String a = new String();
        a = "Hello world! ";
        a = a.substring(2, 5);

        System.out.println(a);



    }

    public int[] plusTwo(int[] a, int[] b) {
        int[][] arr = {a, b};
        int[] resultArray = new int[4];
        int count = 0;
        for (int i = 0; i<arr.length; i++) {
            for (int y = 0; y<arr[i].length; y++) {
                resultArray[count] = arr[i][y];
            }
        }
        return resultArray;

    }







}

// STEP 4 Invoking the function!
        foo(); // Invoking or calling the function. In when the compiler reaches this line it executes
        // the function and the statements in it, as it finishes executing that function it will start
        // from here to execute the rest of code.

        // STEP 5 Add a loop to main:
        for (int i =0; i<20; i++) { // Loop goes from 0, to 19(included) and execute whatever in it 20 times.

            foo();
        }

//STEP 9. Add Loop to main in FIle 2
     File2.main(); // Here we go to File2 call the function main() and main runs 15 time the function bar() which prints something each time it called!.




     }// END OF MAIN

// Step 13. Modify foo() in FIle1
    public static void foo() {
        System.out.println("Ran method named foo! ");
       File2.bar();
    }


} //END of CLASS



        /*

        //String name;
   //     name = JOptionPane.showInputDialog("Type Your Name! ");


     //   System.out.println(name + "Your Name! ");

        * Write a code fragment to print out the largest value stored in a double array named grades. The array
*has already been declared and has values stored in it. You do not know how many grades were stored.
*SOLUTION: (Not solved yet!)
double[] grades ={2.9, 4.5, 5.4};

        double[] grades ={2.9, 4.5, 5.4};
        double max = grades[0];
         for (int i = 0; i<grades.length; i++) {
                if (grades[i]> max){
                    max = grades[i];
                }
         }
        System.out.println(max);







        /*4) Write a code fragment to take five command line arguments and store them in an integer array
        named values. The array hasn’t be declared or initialized yet. Command line arguments are Strings,
                you’ll need to convert them to ints to store them in the array. (Use Integer.parseInt() to do this for each
        value) Using a loop would require the least code to write this. */


/*




       String[] classes = {"2.0", "3.4", "5.0", "10.0", "11.4"};
        for (int i=(classes.length/2); i<classes.length; i++) {
            System.out.println(classes[i]);
        }


       int result;
        Scanner scanner = new Scanner(System.in);


        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {

            System.out.println("Please type a number to store in array! ");
            result = Integer.parseInt(scanner.nextLine());
            array1[i] = result;
            System.out.print(array1[i]);


        }





        int result;
        Scanner scanner = new Scanner(System. in);
        int a, b , c , d , e ;

        int[] values = {a =0, b=0, c=0, d=0, e=0};

        for (int i = 0; i<values.length; i++) {

            System.out.println("Please type a number to store in array! ");
            result = Integer.parseInt(scanner. nextLine());
            values[i] = result;
            System.out.println(values[i]);
        }





    //  1) Write a code fragment to print out the largest value stored in a double array named grades. The array
        // has already been declared and has values stored in it. You do not know how many grades were stored.

       double[] grades ={2.9, 4.5, 5.4, 9.8, 8.4, 7.3};
        int i;
        double big_value = 0.0;
        for (i= 0; i<grades.length; i++) {
            for (int y = 0; y<grades.length-1; y++){

                if(grades[i+1]>grades[y]) {
                    big_value = grades[i];
                }
                else {
                    continue;
                }
            }
           
        }
        System.out.println(big_value);

        double[] arrayGpa = {3.4, 4.5, 2.6, 3.6, 3.5, 3.3, 99.3};
        double temp;
                int i, b, count;
        b=0;
        count =0;
        for (i = arrayGpa.length; i>0; i--){
            if (b == (i-1)) break;
                if (arrayGpa.length%2 == 0 && b == i) {
                    break;
                }
            temp = arrayGpa[b];
            arrayGpa[b] = arrayGpa[i-1];
            arrayGpa[i-1] = temp;
            b++;



        }

for (i = 0; i<arrayGpa.length; i++){
    System.out.println(arrayGpa[i]);
}

   


int i, b;
 int[] myArray = new int[100] ;
        b=0;
        for (i=1; i<=199; i+=2 ) {
            myArray[b]= i;
            b+=1;
        }

double[] myValues = {5.8, 7.2, 3.2, 4.9, 6.3, 8.5, 10.0, 12.5};
        if (myValues.length%2 == 0){
            System.out.println(myValues[myValues.length/2-1] + " and " + myValues[(myValues.length/2)]);

        }
        else {
            System.out.print("The Middle number is: " + myValues[(myValues.length-1)/2]);
        }

        */




/*
// STEP 1 Download CS250StringsLab.java - DONE
// STEP 2 In the forst comments section, add your name as a second author - DONE
// STEP 3 Create four text strings - DONE
        String name, name1, favColor, favFood, favSong;
        name = "Murad";
        name1 = "Murad";
        System.out.println(name);
        System.out.println(name);
        printVertical(name);

        favColor ="Aqua";
        favFood = "Beef Steak";
        favSong = "Lalala";

// STEP 4 Print your name twice - DONE
        System.out.println(name);
        System.out.println(name);
        System.out.println("\n");
        printVertical(name);
        System.out.println(name.length() + " This is the lenght of my name! ");
        System.out.println(name.charAt(3) + " This is the character of my name at the index 3! ");

//STEP 5 Add additional String operations
        //A)
        System.out.println(name.compareTo(name.toUpperCase() + " Here we compare my name to it UPPER case format! "));
        System.out.println("Above my name - Murad was compared to MURAD (uppercase) and it returns the integer! 0 means they \n " +
                "are equal negative means Murad is less than MURAD etc." );
        //B)
        System.out.println(favColor.compareTo(favColor)); // Result explained above printout!
        //C)
        favFood = favFood.toLowerCase();
        //D)
        printVertical(favFood);
        //E)
        System.out.println(name.toLowerCase() + " My name used lowercase method");
        System.out.println(name + " My name as is assigned before! LowerCase Method doesn't \n" +
                "change and assign to variable \"name\" ");
        //F)
        System.out.println(name.concat(favFood) + " - name.concat(favFood) usage! \n");
        //G)
        System.out.println(favFood.concat(name) + " - favFood.concat(name) usage! \n");
        //H)
        System.out.println(name.contains("Son") +  " - name.contains(\"Son\"), False if not contains the keyword Son in my name! else true! \n");
        //i)
        System.out.println(favSong.contains("a") + " - favSong.contains(\"a\", if it does contain letter a will return True, else False \n");
        //J)
        String lastThree = new String();
        lastThree = favSong.substring(favSong.length()-3, favSong.length());
        System.out.println(lastThree + " - Ther result of favSong.substring(favSong.length()-3, favSong.length()) ");
        // K)
        System.out.println(name.length() + " - name.lenght()");
        System.out.println(favColor.length() + " - favColor.length()");
        System.out.println(favSong.length() + " - favSong.length()");
        System.out.println(favFood.length() + " - favFood.length()");

        //L)
        System.out.println(favFood.replace("a", "e") + " favFood.replace(\"a\", \"e\")");

        //M)
        favSong = favSong.replace("a", "e");

        //N)
        System.out.println(favSong + "after favSong.replace(\"a\", \"e\")" );
        for (int i = 0; i <1; i++) {
            System.out.println(" UNDERNEATH 4 lines are SUBSTRING USAGE FOR first 3 char of original strings! ");
            System.out.println(name.substring(i, i+3));
            System.out.println(favColor.substring(i, i+3));
            System.out.println(favSong.substring(i, i+3));
            System.out.println(favFood.substring(i, i+3));
        }
        //O)
        System.out.println("Next 4 lines substring for last 2 chars of original strings!  Murad, Aqua, Lalala(replaced), Beef Steak");
        System.out.println(name.substring(name.length()-2, name.length()));
        System.out.println(favColor.substring(favColor.length()-2, favColor.length()));
        System.out.println(favSong.substring(favSong.length()-2, favSong.length()));
        System.out.println(favFood.substring(favFood.length()-2, favFood.length()));

        //P)
        System.out.println(name.indexOf("a") + " name.indexOf(\"a\")");

        // Q)
        System.out.println(name.indexOf("a", name.indexOf("a")+1)); // it returns -1 why? if I add next a if finds next index number!

        //R) endsWith(), compareToIgnoreCase(), equalsToIgnoreCase(), equals()
        System.out.println(name.endsWith("d") + " - name.endsWith(\"d\") : Returns BOOL");
        System.out.println(name.compareToIgnoreCase(name.toUpperCase()) + " - name.compareToIgnoreCase(name.toUpperCase()) , Should return 0 if same! ");
        System.out.println(name.equals(name1.toUpperCase()) + " - name.equals(name1) ");
        System.out.println(name.equalsIgnoreCase(name1.toUpperCase()) + " - name.equalsIgnoreCase(name1.toUpperCase())");



//STEP 6. Submit the completed or partially completed file by the end of class - DONE Friday
*/

             // END OF MAIN

   // public static void printVertical( String s ){
   //     for( int i = 0; i < s.length(); i++ ){
     //       System.out.println( s.charAt(i) );
       //      }
        //}


