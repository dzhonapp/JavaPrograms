import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
    public static void main(String[] args){

        try {
            InetAddress serverAddress = InetAddress.getByName("locahost");
            System.out.println("Server ip address: " + serverAddress.getAddress());
            Socket socket = new Socket("localhost", 9090);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader((socket.getInputStream())));
            System.out.println(input.readLine());
            out.println("Hello Server" );

            input.close();
            out.close();
            socket.close();


        } catch (UnknownHostException e) {
            System.out.println("Unknown HOst Exception " + e.getMessage());

        }
        catch(IOException e){
            System.out.println("IOException " + e.getMessage());

        }
        catch (IllegalArgumentException e) {
            System.out.println("UIllegal Argument exception "+ e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
