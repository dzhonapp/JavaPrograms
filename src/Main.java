import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

public class Main {

public static void main(String[] args) {

    ServerThread thread = new ServerThread("Server1 ");
    ServerThread thread2 = new ServerThread("Server2");

    //thread2.setPriority(Thread.NORM_PRIORITY); // Priority varies from 1 to 10,
    //System.out.println(thread2.getName() + " Prioprity: " + thread2.getPriority());
    thread.start();
    //thread2.start();

    }
    public static HttpServer httpServer = new HttpServer() {
        @Override
        public void bind(InetSocketAddress inetSocketAddress, int i) throws IOException {

        }

        @Override
        public void start() {

        }

        @Override
        public void setExecutor(Executor executor) {

        }

        @Override
        public Executor getExecutor() {
            return null;
        }

        @Override
        public void stop(int i) {

        }

        @Override
        public HttpContext createContext(String s, HttpHandler httpHandler) {
            return null;
        }

        @Override
        public HttpContext createContext(String s) {
            return null;
        }

        @Override
        public void removeContext(String s) throws IllegalArgumentException {

        }

        @Override
        public void removeContext(HttpContext httpContext) {

        }

        @Override
        public InetSocketAddress getAddress() {
            return null;
        }
    };

}
