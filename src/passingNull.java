/**
 * Created by bma on 1/6/18.
 */
public class passingNull {

    public static void javaHungry (Object o) {
        System.out.println("OBJECT");
    }
public static void javaHungry (String s) {
    System.out.println("String");
}


    public static void main (String[] args) {

        javaHungry(null);

        String a= "a";
        Object as = null;
        javaHungry(as);
    }
}
