package activities;

/**
 * @author Prajwal Krishna
 * Beginning of class ManyCounters
 */
public class ManyCounters {
    /**
     * Main() method
     * used to create multiple thread that count upto a number concurrently
     * @param args, default args
     * @throws InterruptedException, an exception that might occur while handling Threads
     */
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];


        for(int i = 1; i < 11; i++){
            RunnableCounter runnableCounter = new RunnableCounter(i);
            Thread thread = new Thread(runnableCounter);
            thread.start();
            threads[i-1] = thread;
        }

        for(Thread thread : threads){
            thread.join();
        }

        System.out.println( "all done !");
    }
}
