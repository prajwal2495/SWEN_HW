import java.io.*;

public class Problem01 {

    public static void main(String[] args) throws IOException {
        args = new String[1];
        args[0] = "/home/prajwal/SWEN-601/final-practicum-prajwal2495/data/alice_in_wonderland.txt";
        if (args.length != 1) {
            System.err.println("Usage : java Problem01 <filename>");
            System.exit(1);
        }

        File file = new File(args[0]);


        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        if (!file.exists()) {
            System.err.println("Input file does not exist: "+file.getAbsolutePath());
            System.exit(1);
        }

        System.out.println("Reading "+file.getAbsolutePath());
        long countOfBytes = 0;

        int line;
        while((line = bufferedInputStream.read()) != -1){
            countOfBytes++;

        }

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int count = 0;
        while(bufferedReader.readLine() != null){
            count = count + bufferedReader.readLine().length();
        }

        System.out.println("count of bytes :"+countOfBytes);
        System.out.println("sum of bytes : "+ count);
    }
}
