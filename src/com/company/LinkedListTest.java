package com.company;
import net.datastructures.LinkedStack;
import net.datastructures.SinglyLinkedList;
import net.datastructures.DoublyLinkedList;
import java.util.Scanner;
import javax.xml.bind.SchemaOutputResolver;
import java.awt.*;


/**
 * Created by bma on 10/27/17.
 */
public class LinkedListTest {

    public  static void main(String[] args) {





        SinglyLinkedList<Integer> numbers = new SinglyLinkedList<>();

        numbers.addFirst(9);
        int [] numArray = {8, 14, 275, 81, 43, 3};
        for (int i=0; i<numArray.length; i++) {
            numbers.addLast(numArray[i]);
        }


        System.out.println(numbers);

//Second SilgyLinkedList

        SinglyLinkedList<Integer> decimals = new SinglyLinkedList<>();
        decimals.addFirst(9);
        int [] numArray1 = {8, 14, 275, 81, 43, 3};
        for (int i=0; i<numArray1.length; i++) {
            decimals.addLast(numArray1[i]);
        }

        System.out.println(decimals);

        // 11) Add two lines to your code.

        System.out.println(decimals.equals(numbers));
        System.out.println(numbers == decimals);

        DoublyLinkedList<String> names = new DoublyLinkedList<>();
        names.addFirst("Bug");
        String[] strArray = {"Bag", "Tag", "Tug", "Mat", "Cat", "That"};
        for (String i: strArray) {
            names.addLast(i);
        }
        System.out.println(names);

        SinglyLinkedList<SinglyLinkedList> listOfLists = new SinglyLinkedList<>();
        listOfLists.addFirst(numbers);
        listOfLists.addLast(decimals);
        System.out.println("Printing List of Lists!");
        System.out.println(listOfLists);



        // 15

        SinglyLinkedList<String> names1 = new SinglyLinkedList<>();
        names1.addFirst("Alice");
        String[] nameString = {"Jane", "Sue", "Mary", "Joe"} ;
        for(String i: nameString) {
            names1.addLast(i);
        }
        System.out.println(names1);


        //16
        SinglyLinkedList<Double> doubles = new SinglyLinkedList<>();

        for (int i = 1; i<101; i++) {
            doubles.addLast(i*1.0);
        }

        System.out.println(doubles);
        System.out.println("Printing function! ");
        doubles.printing();


        DoublyLinkedList<String> adding = new DoublyLinkedList<>();
        Scanner sc = new Scanner (System.in);
        String userRespond = " ";

        System.out.println("To Exit TYPE Quit, case sensetive! ");
        System.out.println("Write what you want to add to your doubly linked list! ");
        while (!(userRespond.equals("Quit"))){
            userRespond = sc.nextLine();
            adding.addLast(userRespond);
        }



    } // End of Main
} // Endof Class
