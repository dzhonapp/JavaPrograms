import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadedServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            boolean stop = false;
            while(!stop){
                System.out.println("waiting for client ");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client is connected ");
                fileOutput.ClientThread clientThread = new fileOutput.ClientThread(clientSocket);
                clientThread.start();


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
