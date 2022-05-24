import java.net.*;
import java.lang.*;
import java.io.*;
import java.util.*;

public class SimpleClient {
    public static void main (String[] args) throws IOException {
        String serverAddress = "127.0.0.1"; // The server's IP address
        int PORT = 8101; // The server's port
        try (
                Socket socket = new Socket(serverAddress, PORT);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader (new InputStreamReader(socket.getInputStream())) ) {
            System.out.println("You can use : register, login, exit.");
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String command = "";

            String response = "";

            while(!response.equalsIgnoreCase("exit")){
                command = keyboard.readLine();
                if(socket.isClosed()) {
                    System.out.println("You have been disconnected from the server");
                    System.exit(1);
                }
                // Send a request to the server
                out.println(command);
                out.flush();
                // Wait the response from the server ("Hello World!")
                response = in.readLine();
                if(response.equalsIgnoreCase("exit")) {
                    socket.close();
                    System.out.println("You have been disconnected from the server!");
                    System.exit(1);
                }
                else if(response.equalsIgnoreCase("login")){
                    System.out.println("Introduce your username: ");
                    command = keyboard.readLine();
                    out.println(command);
                    out.flush();
                    response = in.readLine();
                    if(!response.equals("Login has failed")) {
                        System.out.println("Hello " + response + ", you are logged now!");
                    }
                    else {
                        System.out.println("Login has failed!");
                    }
                }
                else if(response.equalsIgnoreCase("register")){
                    System.out.println("Introduce your username to create an account: ");
                    command = keyboard.readLine();
                    out.println(command);
                    out.flush();
                    response = in.readLine();
                    if(!response.equals("The username is already taken")){
                        System.out.println("You have successfully created the account with the username " + response + "!");
                    }
                    else {
                        System.out.println(response);
                    }
                }
                else if(response.equalsIgnoreCase("commandNotFound")){
                    System.out.println("The command is incorrect!");
                }
            }
        }
        catch (UnknownHostException e) {
            System.err.println("No server listening... " + e);
        }
    }

}
