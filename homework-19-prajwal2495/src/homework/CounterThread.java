package homework;

/**
 * @author Prajwal Krishna
 * begininning of class CounterThread
 */
public class CounterThread implements Runnable {
    private int counterNumber = 0;

    /**
     * constructor of CounterThread class
     * used to initialise the class variable counterNumber
     * @param counterNumber upper limit for the count
     */
    public CounterThread(int counterNumber) {
        this.counterNumber = counterNumber;
    }

    /**
     * Override Runnable's run method
     * used to print the counter number of the respective thread
     */
    @Override
    public void run() {
        System.out.println(this.counterNumber);
    }

    public static void main(String[] args) throws InterruptedException {
//        args = new String[1];
//        args[0] = "10";

        if(args.length != 1){
            System.err.println("Usage: javahomework.Counter <number>");
            System.exit(1);
        }else {
            int number = Integer.parseInt(args[0]);
            Thread[] threadsList = new Thread[number];
            for(int i = 1; i <= number; i++){
                CounterThread counterThread = new CounterThread(i);
                Thread thread = new Thread(counterThread);
                threadsList[i - 1] = thread;
                //thread.start();
                //thread.join();
            }
            for(Thread thread : threadsList){
                thread.start();
                thread.join();
            }
        }
    }
}
