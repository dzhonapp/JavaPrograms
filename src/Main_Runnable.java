public class Main_Runnable {

public static void main(String[] args) {
    ImplementRunnable runnable1 = new ImplementRunnable(1);
    Thread thread1 = new Thread(runnable1);
    thread1.start();

    ImplementRunnable runnable2 = new ImplementRunnable(2);
    Thread thread2 = new Thread(runnable2, " Server 2 ");

    System.out.println(thread2.getName());
    thread2.start();



    runnable2.start();
    }
}
