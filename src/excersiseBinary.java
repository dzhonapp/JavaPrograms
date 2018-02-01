

import net.datastructures.*;

import sun.awt.image.ImageWatched;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.ArrayList;

/**
 * Created by bma on 1/17/18.
 */
public class excersiseBinary {

    public static void main(String[] args){


        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        pqueue.add(5);
        pqueue.offer(6);
        pqueue.add(9);
        pqueue.offer(1);


        Integer [] ba = new Integer[pqueue.size()];
        Object[] arr = pqueue.toArray(ba);
        System.out.println(ba);




        System.out.println("___________()_________");
        System.out.println(pqueue.remove(5));
        while(!pqueue.isEmpty()) {
            System.out.println(pqueue.poll());
        }
        System.out.println(pqueue);

      SortedPriorityQueue<Integer, String> spq = new SortedPriorityQueue<>();

        spq.insert(1, "Men");
        spq.insert(4, "You");
        spq.insert(0, "We");

        System.out.println();



      LinkedBinaryTree<String> tree = new LinkedBinaryTree<>();

        tree.addRoot("*");
        tree.addLeft(tree.root(), "+");

        tree.addLeft(tree.left(tree.root()), "3");
        tree.addRight(tree.left(tree.root()), "-");
        tree.addRight(tree.right(tree.left(tree.root())), "5");
        tree.addLeft(tree.right(tree.left(tree.root())), "9");
        tree.addRight(tree.root(), "6");

        System.out.println(tree.breadthfirst());

        System.out.println("GET ELEMENT TEST! ");
        System.out.println(tree.inorder().iterator().next().getElement());
        System.out.println(tree.inorder().iterator().next().getElement());
        System.out.println(tree.preorder());
        System.out.println(tree.postorder().getClass());

      Iterator<Position<String>> a = tree.inorder().iterator();
        Iterator<String> temp = tree.iterator();

        LinkedStack<String> myStack = new LinkedStack<>();


        Scanner sc = new Scanner(System.in);

      System.out.println("DIFF TEST");
      for(int i = 0; i< tree.size(); i++) {
        Position<String>  posString = (Position<String>) a.next();

        System.out.println(posString.getElement());

      }
       // for (int i =0; i<tree.size(); i++){
         //   System.out.println(temp.next());
        //}



        LinkedList<HashMap<Integer, String>>  trytest = new LinkedList<>();
HashMap<Integer, String> hash = new HashMap<>();
      hash.put(4, "Hi");
      hash.put(5, "Hello");
      trytest.add(hash);

      System.out.println(trytest.size());
        System.out.println(trytest.get(0));








    }
}
