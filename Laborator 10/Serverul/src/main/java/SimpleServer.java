import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleServer {
    // Define the port on which the server is listening
    public static final int PORT = 8101;
    int ok = 1;
    int i = 0;
    public SimpleServer() throws IOException,InterruptedException {
        ServerSocket serverSocket = null ;
        try {
            serverSocket = new ServerSocket(PORT);
            while (i <= 5) {
                System.out.println ("Waiting for a client ...");
                Socket socket = serverSocket.accept();
                // Execute the client's request in a new thread
                ClientThread thrd = new ClientThread(socket);
                thrd.start();
                i++;
            }
        } catch (IOException e) {
            System.err. println ("Ooops... " + e);
        } finally {
            serverSocket.close();
        }
    }
    public static void main ( String [] args ) throws IOException,InterruptedException {
        SimpleServer server = new SimpleServer ();
    }

}
