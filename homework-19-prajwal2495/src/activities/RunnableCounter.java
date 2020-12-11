package activities;

/**
 * @author Prajwal Krishna
 * Beginning of class RunnableCounter
 */
public class RunnableCounter implements Runnable {
    private int number = 0;

    /**
     * RunnableCounter class constructor
     * @param number, used to depict the number of threads
     */
    public RunnableCounter(int number) {
        this.number = number;
    }

    /**
     * Override Runnable's run() method
     * used to run the counter of each Thread
     */
    @Override
    public void run() {
        for(int i = 0; i <= 100; i++) {
            System.out.println("Runnable Thread "+this.number+": "+i);
        }
    }

    public static void main(String[] args) {
        RunnableCounter runnable = new RunnableCounter(1);
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
