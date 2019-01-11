import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InOut {

    public static void main(String[] args) {

        BufferedReader buffer = new BufferedReader
                (new InputStreamReader(System.in));

        try {
            buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
