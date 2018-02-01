
import net.datastructures.ArrayList;
import sun.jvm.hotspot.utilities.IntArray;

import java.lang.reflect.Array;
import java.util.Random;

public class myArrayList {

    public static void main (String[] args) {

        ArrayList<Integer> IntArrL = new ArrayList<>();

for (int i =0; i<16; i++) {
    IntArrL.add(i, i * 2);
}
        ArrayList<Integer> myArr = new ArrayList<>(100);
        Random rand = new Random(100);
        for (int i =0; i<=99; i++){
            myArr.add(i, rand.nextInt());
            System.out.println(myArr.get(i));
        }



        System.out.println(IntArrL);

    IntArrL.remove(3);

        System.out.println(IntArrL.size());
        IntArrL.add(IntArrL.size(), 6);
        System.out.println(IntArrL.size());


    }


}