package activities;

import java.io.File;

/**
 * @author Prajwal Krishna
 * Beginning of class Files
 */
public class Files {

    /**
     * Method info()
     * helps to understand various method built into the File class
     * helps to understand how can we use these methods to access the file to the needs of the programmer
     * @param path, path of the file in the system
     */
    static void info(String path){
        File file = new File(path);
        System.out.println("File path : "+file.getAbsolutePath());
        if(file.exists()){
            System.out.println("File exists");
            System.out.println("Length : "+file.length());
        }
        else{
            System.out.println("File doesn't exist");
        }
    }

    public static void main(String[] args) {
        info("src/activities/Files.java");
    }

}
