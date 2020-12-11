import java.io.*;

public class ReadNthLine {


    public static void copyNthLineFromInput(String input, String output, int target) throws IOException {
        File inputFile = new File(input);
        File outputFile = new File(output);

        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        FileInputStream fileInputStream = new FileInputStream(inputFile);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

        int lineNumber = 0;

        try {
            if (inputFile.isDirectory()) {
                System.out.println("skip");
            } else {
                for (;;) {
                    if(lineNumber == target){
                        while (bufferedReader.readLine() != null ){
                            System.out.println(bufferedReader.readLine());
                            bufferedWriter.write(bufferedReader.readLine());
                            return;
                        }
                    }else{
                        lineNumber++;
                    }
                }
            }
        }catch (Exception e){
            //
        }
    }


    public static void main(String[] args) throws IOException{
        ReadNthLine.copyNthLineFromInput("/home/prajwal/SWEN-601/finals_practice/data/alice_in_wonderland.txt","/home/prajwal/SWEN-601/finals_practice/data/output.txt",17);
    }
}
