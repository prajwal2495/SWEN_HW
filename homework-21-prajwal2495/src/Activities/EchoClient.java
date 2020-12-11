package Activities;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Prajwal Krishna.
 * Beginning of the class EchoClient.
 */
public class EchoClient {

    /**
     * main() method
     * opening a socket at client side to connect to port 33075
     * sending a message to server and gets a echo back from server
     * @param args, default arguments
     * @throws IOException, handling IOException that is being thrown by all the network related classes
     */
    public static void main(String[] args) throws IOException {
        InetAddress localInet = InetAddress.getLocalHost();
        String hostName = localInet.getHostName();

        Socket socket = new Socket(hostName, 33075);

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        printWriter.println("Hello Server !!!");
        printWriter.flush();

        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = bufferedReader.readLine();
        System.out.println("Server echoing: " +line);


        socket.close();


    }
}
