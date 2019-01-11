import java.io.*;
import java.net.Socket;

public class fileOutput {

public static void main (String[] args) {

    try

    {
        FileOutputStream file = new FileOutputStream("example.txt", true);

        String text = "Everything is going fine, Alhamdulillah! ";

        file.write(text.getBytes());
        file.close();
    }
    catch(Exception e) {
        System.out.println(e.getMessage());
    }


    try {

        FileInputStream fileRead = new FileInputStream("example.txt");
        System.out.println(fileRead.read());
        int data = fileRead.read();

        while(data != -1 ) {
            System.out.print((char)data);
            data = fileRead.read();
        }
        fileRead.close();
    }
    catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

    public static class ClientThread extends Thread {

    private Socket socket = null;
        public ClientThread(Socket s) {
    this.socket = s;

        }
        @Override
        public void run() {

            try {
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println("Hello client ");
                BufferedReader input = new BufferedReader((new InputStreamReader(socket.getInputStream())));
                String clientInput = input.readLine();
                System.out.println(clientInput);
                input.close();
                out.close();
                socket.close();


            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
}
