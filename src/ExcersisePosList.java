
import com.company.Node;
import net.datastructures.LinkedBinaryTree;
import net.datastructures.LinkedPositionalList;
import net.datastructures.Position;
import net.datastructures.SinglyLinkedList;

import java.util.Iterator;

/**
 * Created by bma on 1/14/18.
 */
public class ExcersisePosList {

    public static void main(String[] args){



        LinkedPositionalList<Integer> posList = new LinkedPositionalList<>();
        posList.addFirst(5);
        posList.addAfter(posList.first(), 8);
        posList.addFirst(9);
        posList.addFirst(19);

        System.out.println(posList);
        LinkedPositionalList<String> posList1 = new LinkedPositionalList<>();
        posList1.addFirst("Hello");
        System.out.println(posList1.positions().iterator().next());
        System.out.println(posList1.iterator().next()+ "Is there");

posList.addAfter(posList.positional(2), 4);
        System.out.println(posList);
        posList.addBefore(posList.positional(2), 1);

        System.out.println(posList.positional(2));
        System.out.println(posList.positional(2).getElement() + "Get Element!");


        System.out.println(posList);
        boolean b = posList.iterator().hasNext();
        Iterator<Integer> a = posList.iterator();
        System.out.println(a.next() + " a.next() ");
        System.out.println(a.getClass());
        System.out.println(posList.iterator().next());
        System.out.println(b);

    }
}
