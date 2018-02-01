import net.datastructures.ArrayList;
import net.datastructures.LinkedQueue;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by bma on 1/31/18.
 */
public class mergeSort2 {
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



        public static void main(String[] args) {
            ArrayList<Integer> myArr = new ArrayList<>();
            Random rand = new Random();
        for (int i = 0; i<10; i++) {
            myArr.add(i, rand.nextInt(10));
        }
            //System.out.println("Before Sorting! ");
            System.out.println(myArr);
        mergeSort2(myArr);
            //System.out.println("After sorting!");
            System.out.println(myArr);
    }



        /*LinkedQueue<E> right = new LinkedQueue<E>();
        int mid = AL.size()/2;
        for (int i = 0; i<mid; i++){
            left.enqueue(AL.dequeue());
        }
        while (!AL.isEmpty()) {
            right.enqueue(AL.dequeue());
        }

        mergeSort1(left);
        mergeSort1(right); // End of Splitting!

        while (!left.isEmpty() && !right.isEmpty()) {
            if(left.first().compareTo(right.first())<0) {
                AL.enqueue(left.dequeue());
            }
            else {
                AL.enqueue(right.dequeue());
            }
        }
        while (! left.isEmpty()) {
            AL.enqueue(left.dequeue());
        }
        while (! right.isEmpty()){
            AL.enqueue(right.dequeue());
        }
*/
    }

