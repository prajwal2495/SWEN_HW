package activities;

/**
 * @author Prajwal Krishna
 * Beginning of class CounterThread
 */
public class CounterThread extends Thread {
    private int number = 10;

    /**
     * CounterThread class constructor
     * used to set the number till which the thread has to count to
     * @param number, upper limit of the count
     */
    public CounterThread(int number) {
        this.number = number;
    }

    /**
     * Override Runnable's run() method
     * used to run the counter of each Thread
     */
    @Override
    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.println("Thread "+this.number+": "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CounterThread counterThread = new CounterThread(1);
        System.out.println(counterThread.isAlive());
        counterThread.start();
        System.out.println(counterThread.isAlive());
        Thread.sleep(1000);
        System.out.println(counterThread.isAlive());
    }
}
