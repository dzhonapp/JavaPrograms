/**
 * Created by bma on 11/2/17.
 */
import com.company.Die;
import java.util.Scanner;

public class DiceRoller {



    public static void main(String[] args) {


        System.out.println("Please set goal ! Number only! ");
           Scanner sc = new Scanner(System.in);
           Die d1 = new Die();
           Die d2 = new Die();
          int goal = sc.nextInt();
           int counter=0, score = 0;

           while (score<=goal) {
               d1.roll();
               d2.roll();
               score += (d1.getValue()+d2.getValue());
        counter++;

           //while () {
          // }
       }

        System.out.println("Total rolled " + counter);
for (double d =0; d<5; d++){
    System.out.println(d);
}

        //}
    }

}
