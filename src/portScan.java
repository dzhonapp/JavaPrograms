import java.io.IOException;
import java.net.ServerSocket;

public class portScan {

    public static void main(String[] args) {
        int port = 1;
        while (port < 65535) {
            try {
                ServerSocket server = new ServerSocket(port);
                server.close();
            } catch (IOException e) {
                System.out.println("Port " + port+" is open! ");
            }
        port++;
        }


    }
}
