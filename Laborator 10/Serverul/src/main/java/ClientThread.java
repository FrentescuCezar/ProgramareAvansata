import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;

class ClientThread extends Thread {
    private Socket socket = null;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            String name = "";
            System.out.println("A client has disconnected!");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            while (true) {
                boolean commandFound = false;
                socket.setSoTimeout(30 * 1000);
                // Get the request from the input stream: client → server
                String request = in.readLine();
                // Send the response to the oputput stream: server → client
                String response;

                if (request.equalsIgnoreCase("exit")) {
                    commandFound = true;
                    response = "exit";
                    out.println(response);
                    out.flush();
                } else if (request.equalsIgnoreCase("login")) {
                    commandFound = true;
                    response = "login";
                    out.println(response);
                    out.flush();
                    request = in.readLine();
                    name = request;
                    BufferedReader reader = new BufferedReader(new FileReader("resources/users.txt"));
                    String word = reader.readLine();
                    int nameFound = 0;
                    while (word != null && nameFound == 0) {
                        if (name.equals(word)) {
                            nameFound = 1;
                        }
                        word = reader.readLine();
                    }
                    if (nameFound == 1)
                        response = name;
                    else
                        response = "Login has failed";
                    reader.close();
                    out.println(response);
                    out.flush();
                }
                else if (request.equalsIgnoreCase("register")) {
                    commandFound = true;
                    response = "register";
                    out.println(response);
                    out.flush();
                    request = in.readLine();
                    name = request;
                    int nameFound = 0;
                    BufferedReader reader = new BufferedReader(new FileReader("resources/users.txt"));
                    String word = reader.readLine();
                    while (word != null && nameFound == 0) {
                        if (name.equals(word)) {
                            nameFound = 1;
                        }
                        word = reader.readLine();
                    }
                    if (nameFound == 0) {
                        FileWriter writer = new FileWriter("resources/users.txt", true);
                        BufferedWriter bwriter = new BufferedWriter(writer);
                        bwriter.write(name);
                        bwriter.write("\n");
                        bwriter.close();
                        out.println(name);
                        out.flush();
                    } else {
                        out.println("The username is already taken");
                        out.flush();
                    }
                }
                if (!commandFound) {
                    out.println("commandNotFound");
                    out.flush();
                }
            }
        } catch (IOException e) {
            System.err.println("Communication error... " + e);
        } finally {
            try {
                socket.close(); // or use try-with-resources
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
