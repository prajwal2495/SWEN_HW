import java.io.*;

public class CopyNthLineToOutput {

    public static void copyNthLine(String input, String output, int targetLineNumber) throws IOException {
        File inputFile = new File(input);
        File outputFile = new File(output);



        FileReader inputFileReader = new FileReader(inputFile);
        FileInputStream fileInputStream = new FileInputStream(inputFile);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        BufferedReader bufferedReader = new BufferedReader(inputFileReader);

        int lineNumber = 0;
        String line = null;

        byte[] buffer = new byte[1024];
        int bufferSize;
        if(inputFile.isDirectory()){
            System.out.println("nope");
        }else{
            while(line == (bufferedReader.readLine())){
                if(lineNumber == targetLineNumber && ((bufferSize = fileInputStream.read(buffer)) > 0)){
                    fileOutputStream.write(buffer,0,bufferSize);
                }else{
                    lineNumber++;
                    bufferSize = 0;
                }
            }
        }
    }


    public static void main(String[] args) throws IOException{
        CopyNthLineToOutput.copyNthLine("/home/prajwal/SWEN-601/finals_practice/data/alice_in_wonderland.txt","/home/prajwal/SWEN-601/finals_practice/data/output.txt",10);
    }
}
