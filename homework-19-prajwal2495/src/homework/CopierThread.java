package homework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Prajwal Krishna
 * begininning of class CopierThread
 */
public class CopierThread implements Runnable {

    private String input;
    private String output;

    /**
     * constructor of class CopierThread
     * used to initialise input and output file name
     * @param input, input filename
     * @param output, output filename
     */
    public CopierThread(String input, String output) {
        this.input = input;
        this.output = output;
    }

    /**
     * method getBytes()
     * used to get the size of the output file
     * @return size of the output file in bytes
     */
    public long getBytes(){
        return new File(output).length();
    }

    /**
     * Override Runnable's run method
     * calls the copyAllFilesToOutput method of FileUtils
     */
    @Override
    public void run() {
        try {
            FileUtils.copyAllFilesToOutput(this.input,this.output);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * main method
     * creates a multi threaded environment where the copying of the files happens faster over multiple threads than copying each file individually
     * @param args, default args
     */
    public static void main(String[] args) {
        File inputFile = new File("input");
        File[] allFilesInInput = inputFile.listFiles();

        int bytesCopied = 0;
        List<Thread> threadList = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < allFilesInInput.length; i++){
            if(allFilesInInput[i].isDirectory()){
                System.out.println("skipping directory: "+allFilesInInput[i].getName());
            }else{
                CopierThread copierThread = new CopierThread(allFilesInInput[i].getAbsolutePath(),"output/"+allFilesInInput[i].getName());
                Thread thread = new Thread(copierThread);
                threadList.add(thread);
                thread.start();
                bytesCopied += copierThread.getBytes();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Copied "+ threadList.size()+" ( "+bytesCopied+" bytes) in "+(endTime - startTime)+" ms");
    }
}
