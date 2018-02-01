/**
 * Created by Berdimyrat Mammedov on 11/17/17.
 */
import net.datastructures.DoublyLinkedList;
import net.datastructures.LinkedStack;
import net.datastructures.Stack;
import java.util.Scanner;


public class StackExercises {

    public static void main(String[] args) {

// 1.st question
        LinkedStack<Integer> s = new LinkedStack<>();



        // 2.nd question
        s.push(7);
        s.push(5);
        s.push(3);
        s.push(1);
        Stack<Integer> t = new LinkedStack<>();
        Stack<Integer> u = new LinkedStack<>();
        LinkedStack<Integer> dd = new LinkedStack<>();
        while (! s.isEmpty()) {
            t.push(s.top());
            u.push(s.pop());

        }
        System.out.println(t);
        System.out.println(u);

        while (!u.isEmpty()) {
            t.push(u.top());
            s.push(u.pop());

        }
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
        while (!s.isEmpty()){
            u.push(s.pop()+t.pop());
        }



        System.out.println(s);
        System.out.println(t);
        System.out.println(u);



        String userRespond = "";
        Scanner sc = new Scanner(System.in);

        LinkedStack<String> UserEntities = new LinkedStack<>();
        System.out.println("Type to push to stack! ");
        userRespond = sc.nextLine();
        while(!userRespond.equals("Quit")) {
            UserEntities.push(userRespond);
            System.out.println("Type next input, To quit type \"Quit\" case sensitive");
            userRespond = sc.nextLine();
        }
        System.out.println(UserEntities);



/*


        // 3.rd Question

        LinkedStack<Double> sequentialStack = new LinkedStack<>();
        for (int i=10; i>0; i --) {
            sequentialStack.push(i*1.0);
        } // End for loop

        System.out.println(sequentialStack);

        //4.th Question


        LinkedStack<Double> GSequentialStack = new LinkedStack<>();
        for (int i=80; i>4; i/=2) {

            GSequentialStack.push(i*1.0);
        } // End for loop

        System.out.println(GSequentialStack);


        // 5.th Question


        LinkedStack<Double> DecreasingStack = new LinkedStack<>();
        for (int i = 1; i<21; i ++) {
            DecreasingStack.push(i*1.0);
        } // End for loop
        System.out.println(DecreasingStack);



        //6.th Question
        int sizeOfstack = DecreasingStack.size();
        LinkedStack<Double> reversed = new LinkedStack<>();
        for (int i = 0; i<sizeOfstack; i++ ) {
            reversed.push(DecreasingStack.pop());

        }
        System.out.println(reversed);


        // 7.th Question
while (reversed.top() < 10) reversed.pop();
        System.out.println(reversed + " Reversed popped until reaches 10" );


        //8.th Question
        LinkedStack<Double> stackCopy1 = new LinkedStack<>();
        LinkedStack<Double> stackCopy2 = new LinkedStack<>();

        while(s.size() != 0) {
            stackCopy1.push(s.top());
            stackCopy2.push(s.top());
            s.pop();

        }
        s = stackCopy1;
        System.out.println(stackCopy1); // Needs to be reversed
        System.out.println(stackCopy2); // Needs to be reversed



        // 9.th Question
        LinkedStack<Double>  joined = new LinkedStack<>();
while (stackCopy1.size() != 0) {
    joined.push(stackCopy1.pop());
    joined.push(stackCopy2.pop());
}

        System.out.println(joined + " Joined");



        // 10.th Question

        LinkedStack<Double> reversedJoin = new LinkedStack<>();

        while (joined.size() != 0) {
            reversedJoin.push(joined.pop());

        }
        System.out.println(reversedJoin);


        int sizeOfstack1 = reversedJoin.size();

        LinkedStack<Double> reversedJoin1 = new LinkedStack<>();
        for (int i = 0; i<sizeOfstack1; i++ ) {
            reversedJoin1.push(reversedJoin.pop());

    }
        System.out.println(reversedJoin1);

        System.out.println(reversedJoin1 + " Before Passing to Constructor! ");
LinkedStack<Double> test = new LinkedStack<>(reversedJoin1);



        System.out.println(test);
        test.duplicateValues();
        System.out.println(test);

        test.clear();
        System.out.println(test +  "After Clearing! ");



        // 11. th Question

        // Using reservedJoin1


        Double max = reversedJoin1.pop();
        int size = reversedJoin1.size();
        for (int i = 0; i<size; i++) {
            if (max > reversedJoin1.top())  reversedJoin1.pop();
            else {
                max = reversedJoin1.top();
                reversedJoin1.pop();
            }
        }
        System.out.println(max);

*/


    }








}

