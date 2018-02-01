/**
 * Created by berdimyrat mammedov on 11/28/17.
 */
import net.datastructures.LinkedStack;
import net.datastructures.Queue;
import net.datastructures.LinkedQueue;

import java.lang.reflect.Array;
import java.util.Random;


public class queueExercise{
public static void main(String[] args) {

    LinkedQueue<Integer> a = new LinkedQueue<>();
    Random rn = new Random();
for (int i = 0; i<10; i++) {
    a.enqueue(rn.nextInt(1000)+1);
}


    System.out.println(a);
    a.invert();
    System.out.println(a);

    LinkedStack<Integer> stackTemp = new LinkedStack<>();
    stackTemp.push(5);
    stackTemp.push(6);

    LinkedQueue<Integer> fromConstructor = new LinkedQueue<>(stackTemp);
    System.out.println(fromConstructor);


    System.out.println("Usage of Clear method!");
    System.out.println("Before! ");
    System.out.println(stackTemp);
    stackTemp.clear();
    System.out.println("After! ");
    System.out.println(stackTemp);



    long startTime = System.currentTimeMillis();
    mergeSort(a);
    long endTime   = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println(totalTime/1000 + " Seconds roughly");



    // Test with Array
    Integer [] b = new Integer[1000001];
    for (int i = 0; i<1000000; i++) {
        b[i] = rn.nextInt(1000)+1;
    }
    startTime = System.currentTimeMillis();
   //bubble_Sort( b, b.length); // Bubble sort doent's want to run.
    endTime   = System.currentTimeMillis();
    totalTime = endTime - startTime;
    System.out.println(totalTime/1000 + " Seconds roughly!");

}
    public static <E extends Comparable <E>> void mergeSort(LinkedQueue <E> t) {
if (t.size() <=1) return;
        LinkedQueue<E> left = new LinkedQueue<E>();
        LinkedQueue<E> right = new LinkedQueue<E>();
        int mid  = t.size()/2;
        for (int i =0; i<mid; i++) {
            left.enqueue((t.dequeue()));
        }
        while (!t.isEmpty()) {
            right.enqueue(t.dequeue());
        }
        mergeSort(left);
        mergeSort(right);

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.first().compareTo(right.first()) < 0) {
                t.enqueue(left.dequeue());
            } else {
                t.enqueue(right.dequeue());
            }
        }
            while(!left.isEmpty()) {
                t.enqueue(left.dequeue());
            }
            while (!right.isEmpty()){
                t.enqueue(right.dequeue());
            }

    }







}

