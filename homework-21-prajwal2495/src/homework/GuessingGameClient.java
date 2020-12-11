package homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Prajwal Krishna
 * Beginning of class GuessingGameClient
 */
public class GuessingGameClient {
    /**
     * main() method
     * opens a socket on 6355 which is being used by the server
     * starts to play the number guessing game with the server
     * @param args, default arguments
     * @throws IOException, handling IOException that is being thrown by all the network related classes
     */
    public static void main(String[] args) throws IOException {
        InetAddress localHost = InetAddress.getLocalHost();
        String hostName = localHost.getHostName();

        Socket socket = new Socket(hostName,6355);

        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        String clientCommand;
        String serverResponses;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Available commands\n 1.guess # \n 2.restart \n 3.quit");
        System.out.println("Welcome, try to guess a number between 0 - 20");

        while(true){
            System.out.println("Player, Enter a command:");
            clientCommand = scanner.nextLine();
            printWriter.println(clientCommand);
            printWriter.flush();

            serverResponses = bufferedReader.readLine();

            if(serverResponses.equals("GameEnded") || serverResponses.equals("error-in-command")){
                System.out.println("server responded: "+serverResponses);
                printWriter.close();
                inputStreamReader.close();
                socket.close();
                System.exit(1);
            }else{
                System.out.println("server responded: "+serverResponses);
            }
        }
    }
}
