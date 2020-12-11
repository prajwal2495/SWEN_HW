package homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @author Prajwal Krishna
 * Beginning of class GuessingGameServer
 */
public class GuessingGameServer {

    /**
     * method checkNumberEquality()
     * check if the number guessed by client and number to guessed is true or not
     * @param numberGuessed, number guessed by client
     * @param numberToBeGuessed, number to be guessed by the client
     * @return String based on the comparison
     */
    public static String checkNumberEquality(int numberGuessed, int numberToBeGuessed){
        if(numberGuessed == numberToBeGuessed){
            return "correct";
        }else if(numberGuessed > numberToBeGuessed){
            return "Too high";
        }else {
            return "Too low";
        }
    }

    /**
     * main() method
     * connects with guessing game client and checks for the commands sent by clients
     * checks for the guessing on numbers done by the client and sends appropriate output
     * @param args, default arguments
     * @throws IOException, handling IOException that is being thrown by all the network related classes
     */
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6355);
        System.out.println("Listening for connections ......");
        Socket client = server.accept();
        System.out.println("Connection established .....");

        int counter = 0;
        String commandRead;
        boolean correctGuess = false;

        InputStream inputStream = client.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String guessedNumberResult;
        OutputStream outputStream = client.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        Random random = new Random();
        int number = random.nextInt(21);
        System.out.println("Number to be guessed: "+number);


        do{
            commandRead = bufferedReader.readLine();
            String[] checkCommand = commandRead.split("\\s+");
            if(!(checkCommand[0].equals("quit") || checkCommand[0].equals("guess") || checkCommand[0].equals("restart"))){
                printWriter.println("error-in-command");
                printWriter.flush();
                server.close();
                client.close();
                System.exit(1);
            }

            if(commandRead.equals("quit")){
                printWriter.println("GameEnded");
                printWriter.flush();
                printWriter.close();
                inputStreamReader.close();
                bufferedReader.close();
                outputStream.close();
                server.close();
                client.close();
                System.exit(1);
            }
            System.out.println("Response from client: "+commandRead);
            if(counter == 6 && !commandRead.equals("restart")){
                printWriter.println("your guess limit has reached max, no more guesses allowed");
                printWriter.flush();
            }else{
                String[] splitCommands = commandRead.split("\\s+");
                String clientMove = splitCommands[0];
                if(clientMove.equals("restart")){
                    number = random.nextInt(21);
                    printWriter.println("Game has been restarted, try your luck!");
                    printWriter.flush();
                    counter = 0;
                    System.out.println("Number to be guessed after restart: "+number);
                } else if(clientMove.equals("guess") && correctGuess == false) {
                        int clientGuess = Integer.parseInt(splitCommands[1]);
                        guessedNumberResult = GuessingGameServer.checkNumberEquality(clientGuess, number);
                        if (guessedNumberResult.equals("correct")) {
                            printWriter.println(guessedNumberResult + " guess, you won!!");
                            printWriter.flush();
                            counter = 0;
                            correctGuess = true;
                        } else {
                            counter++;
                            printWriter.println(guessedNumberResult + ", you have exhausted " + counter + " chances");
                            printWriter.flush();
                            System.out.println("you have exhausted " + counter + " chances");
                        }
                }else{
                    printWriter.println("you have already won and still guessing!, restart or quit the game");
                    printWriter.flush();
                    correctGuess = false;
                    //System.exit(1);
                }
            }
        }while(true);
    }
}
