package homework;

import java.io.File;
import java.io.IOException;

/**
 * @author Prajwal Krishna
 * begininning of class FileCopier
 */
public class FileCopier {
    /**
     * main method
     * used to copy all the files from input to output at once
     * @param args, default args
     * @throws IOException, an exception that might occur while handling Threads
     */
    public static void main(String[] args) throws IOException {

        if(args.length != 2 ){
            System.err.println("Usage: java homework.FileCopier <input dir> <output dir>");
            return;
        }

        String inputDir = args[0];
        String outputDir = args[1];

        FileUtils.clearDirectory(outputDir);

        File in = new File(inputDir);
        File[] inputFiles = in.listFiles();

        for(int i = 0; i < inputFiles.length; i++){
            if(inputFiles[i].isDirectory()){
                System.out.println("Skipping "+inputFiles[i].getName());
            }else {
                FileUtils.copyAllFilesToOutput(inputFiles[i].getAbsolutePath(),outputDir+"/"+inputFiles[i].getName());
            }
        }
    }
}
