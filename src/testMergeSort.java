import net.datastructures.LinkedQueue;
import java.util.Random;


/**
 * Created by bma on 1/31/18.
 */
public class testMergeSort {
    public static void main (String[] args){

        LinkedQueue<Integer> myLS = new LinkedQueue<>();
        Random rand = new Random();
        for (int i = 0; i<30; i++) {
            myLS.enqueue(rand.nextInt(30));
        }


        System.out.println(myLS);
        mergeSort.mergeSort1(myLS);

        System.out.println(myLS);
    }
}
