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
 * Provides an empirical test of the efficiency of repeated string concatentation
 * versus use of the StringBuilder class.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
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
    ArrayList<Integer> integerArrayList = new ArrayList<>(100000);
    LinkedQueue<Integer> integerLinkedQueue = new LinkedQueue<>();
    int n = 50000;                           // starting value enough to test in 30 seconds
    int trials = 5;                            // Laptop gets stuck after 6 'th loop.
    try {
      if (args.length > 0)
        trials = Integer.parseInt(args[0]);
      if (args.length > 1)
        n = Integer.parseInt(args[1]);
    } catch (NumberFormatException e) { }
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
          mergeSort.mergeSort1(temp);
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
          integerArrayList = new ArrayList<>(100000);
          ArrayList <Integer> temp = repeat1(integerArrayList, n);
          long startTime = System.currentTimeMillis();
          mergeSort2.mergeSort2(temp);
          long endTime = System.currentTimeMillis();
          long elapsed = endTime-startTime;

          System.out.println(String.format("n: %9d took %12d milliseconds", n, elapsed));
          n *= 2;                                // double the problem size
      }




  }
}
