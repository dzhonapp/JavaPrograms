public class ServerThread extends Thread{
public ServerThread(String threadName) {
    this.setName(threadName);
}


    @Override
    public void run(){
       try {
        int clinetNumber = 1;
        while (clinetNumber!=100) {
        System.out.println(this.getName()+ " Server sent data to client! "+ clinetNumber);
        Thread.sleep(1000);
        clinetNumber++;
        } }
       catch (InterruptedException e) {
           System.out.println(e.toString());
       }
    }
}
