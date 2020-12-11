package homework;

import java.io.*;

/**
 * @author Prajwal Krishna
 * Beginning of class Simulation
 */
public class Simulation {

    public static void main(String[] args) throws IOException {
        if(args.length != 3){
            System.out.println("There should be exactly 3 arguments.");
            System.exit(1);
        }
        else{
            String logFilename = args[0];
            String inputFilename = args[1];
            int numProducers = Integer.parseInt(args[2]);
            Thread[] threads = new Thread[numProducers];
            File inputFile = new File("/home/prajwal/SWEN-601/homework-20-prajwal2495/data/"+inputFilename);
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);
            String line;
            try {
                int counter = 0;
                while ((line = br.readLine()) != null) {
                    for (int i = 0; i < numProducers; i++) {
                        Logger logger = new Logger(logFilename);
                        Producer producer = new Producer(logger);
                        producer.setLineNumber(counter);
                        producer.setMessage(line);
                        producer.setNumber(i);
                        line = br.readLine();
                        counter++;
                        producer.start();
                        threads[i] = producer;
                    }
                }
                for(Thread thread : threads){
                    thread.join();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
