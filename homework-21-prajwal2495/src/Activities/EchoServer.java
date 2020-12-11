package Activities;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Prajwal Krishna
 * Beginning of class EchoServer
 */
public class EchoServer {
    /**
     * main() method
     * opening a server socket at server side to connect to port 33075
     * sending a echo message to client after receiving message from client
     * @param args, default arguments
     * @throws IOException, handling IOException that is being thrown by all the network related classes
     */
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(33075);

        System.out.println("listening for connections......");
        Socket client = server.accept();
        System.out.println("connection established ....");
        System.out.println(client.getInetAddress().getHostName());

        InputStream inputStream = client.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("reading client's response:");
        String line = bufferedReader.readLine();
        System.out.println("client's response : "+line);

        line = "ECHO: "+line;
        OutputStream outputStream = client.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.println(line);
        printWriter.flush();

        client.close();
    }
}
