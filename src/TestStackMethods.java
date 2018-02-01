import net.datastructures.LinkedQueue;
import net.datastructures.LinkedStack;
import net.datastructures.DoublyLinkedList;

import static net.datastructures.LinkedStack.converter;


/**
 * Created by Berdimyrat Mammedov on 11/20/17.
 */
public class TestStackMethods {





        public static void main(String[] args) {


LinkedStack<Integer> q = new LinkedStack<>();
            for (int i =0; i <=100; i+=10) {
                q.push(i);
            }
            System.out.println(q);


            LinkedStack<Double> four_item_stack = new LinkedStack<>();
            LinkedStack<Double> one_item_stack = new LinkedStack<>();
            LinkedStack<Double> zero_item_stack = new LinkedStack<>();

// Adding Items to stacks
            four_item_stack.push(4.2);
            four_item_stack.push(0.3);
            four_item_stack.push(1.4);
            four_item_stack.push(8.5);

            one_item_stack.push(5.5);


            LinkedStack<String> integerStack = new LinkedStack<>();
            integerStack.push("A");
            integerStack.push("ABD");

            converter(integerStack);




            System.out.println();

            // Testing Methods

            // Invert method
            System.out.println("Stack Before Inverting ");
            System.out.println(four_item_stack);
            System.out.println("Stack After Inverting");
            four_item_stack.invert();
            System.out.println(four_item_stack);
            System.out.println();
            System.out.println("Trying with empty stack!");
            zero_item_stack.invert();
            System.out.println(zero_item_stack);


            // Constructor which accepts an argument another Linked Stack as parameter!


            LinkedStack<Double> constructorTesting = new LinkedStack<>(four_item_stack);
            System.out.println(constructorTesting);


            // Clear() method
            System.out.println("Before Clearing! ");
            System.out.println(constructorTesting);
            constructorTesting.clear();
            System.out.println(constructorTesting +  "After Clearing! ");
            System.out.println("Clearing empty Stack");
            zero_item_stack.clear();
            System.out.println(zero_item_stack + " Printing empty stack after usage of clear() method on it!  ");



            // Duplicate values Method
            zero_item_stack.duplicateValues();
            System.out.println("Empty stack Duplicate method usage: " + zero_item_stack);
            one_item_stack.duplicateValues();
            System.out.println(" One item in the stack duplicate method usage " + one_item_stack);
            System.out.println();
            four_item_stack.duplicateValues();
            System.out.println("4 items in the stack duplicate method usage " + four_item_stack);






        }










    }


