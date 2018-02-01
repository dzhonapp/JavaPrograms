import net.datastructures.DoublyLinkedList;
import net.datastructures.SinglyLinkedList;

/**
 * Created by bma on 11/17/17.
 */
public class TestNewMethods {

    public static void main(String[] args){

        SinglyLinkedList<String> myInt = new SinglyLinkedList<>();
        myInt.addFirst("45");
        myInt.addLast("AFDFD");
        myInt.addLast("DFDFD");
        myInt.addLast("John");
        myInt.addLast("Sarah");

        System.out.println(myInt); // Checking the list
        System.out.println(myInt.indexOf2("Sarah")); // using of indexof 2nd method
        System.out.println(myInt); // Checking the original list if changed after rotation in indexof 2n method , NO
        myInt.rotate(); // Rotate the list

        System.out.println(myInt); // Checking the original list if changed , yes
        System.out.println(myInt.indexOf("John"));// Chekcing if it will find Gordi in the list , yes
        System.out.println(myInt.indexOf2("Sarah")); // Using Indexof2 to find out if works properly (yes , it doesn't affect original list)
        System.out.println(myInt);


        DoublyLinkedList<Integer> firstDLL = new DoublyLinkedList<>();

        firstDLL.addFirst(5);
        firstDLL.addFirst(6);
        firstDLL.addLast(10);
        firstDLL.addLast(8);
        System.out.println(firstDLL);

        DoublyLinkedList<Integer> myDLL2 = new DoublyLinkedList<>();
        myDLL2.addLast(19);
        myDLL2.addLast(20);
        System.out.println(myDLL2);

// Concatination

        DoublyLinkedList<Integer> concatenation;
        concatenation = firstDLL.concatenate(myDLL2);
        System.out.println(concatenation + " Concatenated");
        System.out.println(firstDLL + " Old first list not affected! ");
        System.out.println(myDLL2 + " Old second list is not affected! ");

// Passing to constructor argument another doubly linked list
        DoublyLinkedList<Integer> acceptListConstructor = new DoublyLinkedList<>(concatenation);
        System.out.println("    Constructed with construction method List: \n" +
                " new DoublyLinkedList<>(concatenation) " + acceptListConstructor);


    }
}
