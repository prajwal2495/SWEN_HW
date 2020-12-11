package homework;

import java.io.*;

/**
 * @author Prajwal Krishna
 * begininning of class FileUtils
 */
public class FileUtils {

    /**
     * method copyAllFilesToOutput
     * copies all the files from input file to output files and skips directories if encountered
     * @param input, input file name
     * @param output, output file name
     * @throws IOException, an exception that might occur while handling Threads
     */
    static void copyAllFilesToOutput(String input, String output) throws IOException {
        File inputFile = new File(input);
        File outputFile = new File(output);


        FileInputStream fileInputStream = new FileInputStream(inputFile);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

        byte[] buffer = new byte[1024];
        int bufferSize;

        try {
            if (inputFile.isDirectory()) {
                System.out.println("This is a directory, skipped " + inputFile.getName());
            } else {
                System.out.println("Copied "+inputFile.getName());
                while ((bufferSize = fileInputStream.read(buffer)) > 0) {
                    fileOutputStream.write(buffer, 0, bufferSize);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    /**
     * method clearDirectory
     * used to clear the contents of a given directory
     * @param directory
     */
    static void clearDirectory(String directory) {
        File dirFile = new File(directory);
        if (!dirFile.isDirectory()) {
            System.err.println("given file name is not a directory or does not exist");
            System.exit(1);
        }
        for (File files : dirFile.listFiles()) {
            if (files.isDirectory()) {
                System.out.println("current file is a directory, hence skipped: "+files.getName());
            }else{
                files.delete();
            }
        }
    }
}