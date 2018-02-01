/**
 * Created by bma on 12/25/17.
 */
public class factorial {

    public static int Factorial (int e) {
        if (e<=1) return e;
        return e * Factorial (e-1);

    }
    public static void main(String[] args) {
        System.out.println(Factorial(10));
        fibonacciha(10);
        System.out.println();
for (int i = 0 ; i<10; i++ ) {
    System.out.println(fibbonacia(i));
}
    }

    public static void fibonacciha (int n) {

        int[] myArray2 = new int[n];
        myArray2[0] = 0;
        myArray2[1] = 1;
        for (int i = 2 ; i<n; i++) {
            myArray2[i] = myArray2[i-1]+myArray2[i-2];
            System.out.print(myArray2[i]+" ");
    }
}

    public static long fibbonacia(int n) {
        if (n<=1) return n;
    return fibbonacia(n-1)+fibbonacia(n-2);
    }
}
