import java.io.*;
import java.util.Scanner;

public class ReadNthLineToEnd {
    public static void main(String[] args) throws IOException {
        StringBuffer buffer=new StringBuffer();
        String line = "";
        int lineNo;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Line Number: ");
        int no=input.nextInt();
        try {
            LineNumberReader ln = new LineNumberReader(new FileReader("/home/prajwal/SWEN-601/finals_practice/data/alice_in_wonderland.txt"));
            int count = 0;
            while (ln.readLine() != null){
                count++;
            }
            ln.close();
            FileReader fr = new FileReader("/home/prajwal/SWEN-601/finals_practice/data/alice_in_wonderland.txt");

            BufferedReader br = new BufferedReader(fr);
            for (lineNo = 1; lineNo <= count; lineNo++) {
                if(lineNo==no){
                    for (lineNo = no; lineNo <= count; lineNo++) {
                        buffer.append(br.readLine());
                        buffer.append("\n");
                    }
                }
                else
                    br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(buffer.toString());

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("/home/prajwal/SWEN-601/finals_practice/data/output.txt")));
        bufferedWriter.write(buffer.toString());
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}