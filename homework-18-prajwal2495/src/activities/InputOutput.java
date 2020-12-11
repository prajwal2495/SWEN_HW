package activities;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Prajwal Krishna
 * Beginning of class InputOutput
 */
public class InputOutput {

    /**
     * method writeSquares()
     * Writes the available squares on the file using FileWriter class.
     * @param squares, list of available squares
     * @param filename, Name of the file that needs to be written into
     * @throws IOException, in case an File IO exception occurs, it needs to be handled
     */
    public static void writeSquares(List<Square> squares, String filename) throws IOException {
        File file = new File(filename);
        FileWriter fileWriter = new FileWriter(file);
        for(Square square : squares){
            fileWriter.write(square.toString());
        }

        fileWriter.close();
    }

    /**
     *
     * @param filename, Name of the file that needs to be written into
     * @return a list of squares
     * @throws IOException, in case an File IO exception occurs, it needs to be handled
     * @throws BadMoveException, in case an illegal move has been made by the user this particular exception will be thrown
     */
    public static List<Square> readSquares(String filename) throws IOException, BadMoveException {
        File file = new File(filename);
        FileReader fileReader = new FileReader(file);
        List<Square> list = new LinkedList<>();

        char[] c = new char[10];
        fileReader.read(c);

        for(int i = 0; i < c.length; i++){
            Square square = new Square();
            if (c[i] == 'W') {
                square.occupy(Piece.WHITE);
                list.add(square);
            } else if (c[i] == 'B') {
                square.occupy(Piece.BLACK);
                list.add(square);
            }
        }
        return list;
}

    /**
     * method main()
     * used to test the working of squares and file writings.
     * @param args
     * @throws IOException, in case an File IO exception occurs, it needs to be handled
     * @throws BadMoveException, in case an illegal move has been made by the user this particular exception will be thrown
     */
    public static void main(String[] args) throws BadMoveException, IOException {
        Square sq1 = new Square();
        sq1.occupy(Piece.WHITE);

        Square sq2 = new Square();
        sq2.occupy(null);

        Square sq3 = new Square();
        sq3.occupy(Piece.BLACK);

        List<Square> list = new LinkedList<>();
        list.add(sq1);
        list.add(sq2);
        list.add(sq3);

        try{
            writeSquares(list,"square.txt");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

        List<Square> readList;
        try {
            readList = readSquares("square.txt");
            for(Square s : readList){
                System.out.println(s.toString());
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

    }
}
