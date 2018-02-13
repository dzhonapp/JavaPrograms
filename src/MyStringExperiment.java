/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


import net.datastructures.ArrayList;
import net.datastructures.LinkedQueue;


import java.util.Random;

/**
 *
 * Modified from the program dsaj.asymptotics.StringExperiment.java provided with the book:
 * Data Structures and Algorithms in Java, Sixth Edition
 * Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 * John Wiley & Sons, 2014
 *
 * Provides an empirical test of the efficiency of creation, filling and sorting ArrayList
 * versus use Linked Queue.
 * @author J.Covert
 * @author B.Mammedov
 */
public class MyStringExperiment {
// MODIFIED FROM ORIGINAL
  /** Uses repeated concatenation to compose a String with n copies of character c. */
  public static ArrayList repeat1(ArrayList E, int n) {
    Random rand = new Random();
    for (int j=0; j < n; j++)
      E.add(j, rand.nextInt(10000));
    return E;
  }

  /** Uses StringBuilder to compose a String with n copies of character c. */
  public static LinkedQueue repeat2(LinkedQueue Q, int n) {
    Random rand = new Random();
    for (int j=0; j < n; j++)
     Q.enqueue(rand.nextInt(10000));
    return Q;
  }

  /**
   * Tests the two versions of the 'repeat' algorithm, doubling the
   * size of n each trial, beginning with the given start value. The
   * first command line argument can be used to change the number of
   * trials, and the second to adjust the start value.
   */
  public static void main(String[] args) {
    //Creates ArrayLIst and a LinkedQueue with n random Integers in it!!
    ArrayList<Integer> integerArrayList = new ArrayList<>();
    LinkedQueue<Integer> integerLinkedQueue = new LinkedQueue<>();
    int n = 500;                           // Intentionally kept 500 to run faster!
    int trials = 3;                            // TRIALS for 3 times
//    try {
//      if (args.length > 0)
//        trials = Integer.parseInt(args[0]);
//      if (args.length > 1)
//        n = Integer.parseInt(args[1]);
//    } catch (NumberFormatException e) { }
    int start = n;  // remember the original starting value

    // let's run version 2 (the quicker one) first
    System.out.println("Testing repeat2...Filling the QUEUE DS with random integer! ");
    for (int t=0; t < trials; t++) {
      long startTime = System.currentTimeMillis();
      LinkedQueue <Integer> temp = repeat2(integerLinkedQueue, n);

      long endTime = System.currentTimeMillis();
      long elapsed = endTime - startTime;
      System.out.println(String.format("n: %9d took %12d milliseconds", n, elapsed));
      n *= 2;                                // double the problem size
    }

      System.out.println("SORTING WITH MERGE SORT");
      n = start;
      for (int t=0; t < trials; t++) {
          integerLinkedQueue = new LinkedQueue<>();
          LinkedQueue<Integer> temp = repeat2(integerLinkedQueue, n);

          long startTime = System.currentTimeMillis();
          mergeSort1(temp);
          long endTime = System.currentTimeMillis();
          long elapsed = endTime-startTime;

          System.out.println(String.format("n: %9d took %12d milliseconds", n, elapsed));
          n *= 2;                                // double the problem size

      }

    System.out.println("Testing repeat1... Filling the ArrayList DS with random integer! ");
    n = start;                               // restore n to its start value
    for (int t=0; t < trials; t++) {
      long startTime = System.currentTimeMillis();
      ArrayList <Integer> temp = repeat1(integerArrayList, n);
      long endTime = System.currentTimeMillis();
      long elapsed = endTime - startTime;
      System.out.println(String.format("n: %9d took %12d milliseconds", n, elapsed));
      n *= 2;                                // double the problem size
    }
      System.out.println("SORTING WITH MERGE SORT");
      n = start;
      for (int t=0; t < trials; t++) {
          integerArrayList = new ArrayList<>(100000); // Not very effective way of doing this but works ! :)
          ArrayList <Integer> temp = repeat1(integerArrayList, n);
          long startTime = System.currentTimeMillis();
          mergeSort2(temp);
          long endTime = System.currentTimeMillis();
          long elapsed = endTime-startTime;

          System.out.println(String.format("n: %9d took %12d milliseconds", n, elapsed));
          n *= 2;                                // double the problem size
      }


      LinkedQueue<Integer> myLS = new LinkedQueue<>();
      Random rand = new Random();
      for (int i = 0; i<30; i++) {
          myLS.enqueue(rand.nextInt(30));
      }

      System.out.println("\nTESTING MERGESORT IF IT IS WORKING! ON QUEUE!");
      System.out.println("BEFORE SORTING! ");
      System.out.println(myLS);
      mergeSort1(myLS);
      System.out.println("AFTER SORTING");
      System.out.println(myLS);

      ArrayList<Integer> myAL = new ArrayList<>();

      for (int i = 0; i<30; i++) {
          myAL.add(i, rand.nextInt(30));
      }

      System.out.println("\nTESTING MERGESORT IF IT IS WORKING! ON ARRAY LIST!");
      System.out.println("BEFORE SORTING! ");
      System.out.println(myAL);
      mergeSort2(myAL);
      System.out.println("AFTER SORTING");
      System.out.println(myAL);

  }
    // Merge sorting method for ArrayList
    public static <E extends Comparable <E>> void mergeSort2 (ArrayList<E> AL) {

        if (AL.size() <= 1) return;
        ArrayList<E> left = new ArrayList<E>();
        ArrayList<E> right = new ArrayList<E>();

        int mid = AL.size() / 2;

        for (int i = 0; i < mid; i++) {
            left.add(i, AL.remove(AL.size()-1));

        }


        int counter = 0;
        while (!AL.isEmpty()) {

            right.add(counter, AL.remove(AL.size()-1));
            counter++;
        }


        mergeSort2(left);
        mergeSort2(right); // Splitting ENDS HERE and WORKS PERFECTLY



        while (!left.isEmpty() && !right.isEmpty()) {


            if((left.get(0).compareTo(right.get(0))<0)) {
                AL.add(AL.size(), left.remove(0));
            }
            else {
                AL.add(AL.size(), right.remove(0));
            }
        } // END WHILE LOOP

        while (!left.isEmpty()) {

            AL.add(AL.size(), left.remove(0));
        }
        while (!right.isEmpty()) {
            AL.add(AL.size(), right.remove(0));
        }
    }
// MergeSorting for LinkedQueue
    public static <E extends Comparable <E>> void mergeSort1 (LinkedQueue<E> q) {
        //Divide the length of q
        if (q.size() <= 1) return;
        LinkedQueue<E> left = new LinkedQueue<E>();
        LinkedQueue<E> right = new LinkedQueue<E>();
        int mid = q.size()/2;
        for (int i = 0; i<mid; i++){
            left.enqueue(q.dequeue());
        }
        while (!q.isEmpty()) {
            right.enqueue(q.dequeue());
        }

        mergeSort1(left);
        mergeSort1(right); // End of Splitting!
// Beginning of merging Process!
        while (!left.isEmpty() && !right.isEmpty()) {
            if(left.first().compareTo(right.first())<0) {
                q.enqueue(left.dequeue());
            }
            else {
                q.enqueue(right.dequeue());
            }
        }
        while (! left.isEmpty()) {
            q.enqueue(left.dequeue());
        }
        while (! right.isEmpty()){
            q.enqueue(right.dequeue());
        }

    }// End LinkedQueue merge sort method



}
