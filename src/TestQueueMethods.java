import net.datastructures.LinkedQueue;
import net.datastructures.LinkedStack;
import java.util.*;

import java.util.Random;

/**
 * Created by bma on 12/2/17.
 */
public class TestQueueMethods {
   /* public static <E> void mergeSort(LinkedQueue<E extends Comparable<E>> q) {
        if (q.size()<=1) return;
        LinkedQueue<E> left = new LinkedQueue<E>();
        LinkedQueue<E> right = new LinkedQueue<E>();

        int mid = q.size()/2;
        int i;
        for (i = 0; i<mid; i++) {
            left.enqueue(q.dequeue());
        }
        while(!q.isEmpty()) {
            right.enqueue(q.dequeue());
        }
        mergeSort(left);
        mergeSort(right);

        while(!(left.isEmpty() && right.isEmpty())) {
            if(left.first().compareTo(right.first())<=0) {
q.enqueue(left.dequeue());
            }
            else {
                q.enqueue(right.dequeue());
            }
        }

        while(!left.isEmpty()) q.enqueue(left.dequeue());
        while(!right.isEmpty()) q.enqueue(right.dequeue());

    } */
    public static void main(String[] args) {

        LinkedQueue<Integer> q = new LinkedQueue<>();
        q.enqueue(9);
        int temp = q.first();
        q.enqueue(temp/3);
        System.out.println(q);
        q.enqueue(17);
        q.enqueue(4);
        q.enqueue(q.dequeue());
        q.enqueue(q.dequeue());
        q.enqueue(8);
        System.out.println(q);
        temp = q.dequeue();
        q.enqueue(temp +q.first());
        System.out.println(q);


        LinkedQueue<Integer> emptyQueue = new LinkedQueue<>();


        LinkedQueue<Integer> a = new LinkedQueue<>();
        Random rn = new Random();
        for (int i = 0; i<10; i++) {
            a.enqueue(rn.nextInt(1000)+1);
        }

        System.out.println("Before invert method! ");
        System.out.println(a);
        a.invert();
        System.out.println("After Invert Method! ");
        System.out.println(a);
        System.out.println("Trying to call on empty Queue! ");
        emptyQueue.invert();
        System.out.println("No Crash, if you read this! ");



        // Usage of Constructor which takes, stack as an argument!
        LinkedStack<Integer> stackTemp = new LinkedStack<>();
        stackTemp.push(5);
        stackTemp.push(6);

        LinkedQueue<Integer> fromConstructor = new LinkedQueue<>(stackTemp);

        System.out.println("Handling null on construction! ");
        LinkedQueue<Integer> NullPassed = new LinkedQueue<>(null);
        System.out.println("\n");
        System.out.println("Printing a QUEUE which was built with constructor that takes stack as an argument! (Beneath!) ");
        System.out.println(fromConstructor);
        System.out.println();


        System.out.println("Usage of Clear method!");

        System.out.println("Before! ");
        System.out.println(fromConstructor);

        fromConstructor.clear();

        System.out.println("After! ");
        System.out.println(fromConstructor);

        System.out.println("Demonstrating on empty queue! ");
        emptyQueue.clear();
        System.out.println("If you read this, NO CRASH and clear() method works on empty queue without problem! ");


    }
}
