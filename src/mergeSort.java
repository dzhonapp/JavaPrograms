import net.datastructures.LinkedQueue;

/**
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 *
 */
public class mergeSort {


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

    }



}
