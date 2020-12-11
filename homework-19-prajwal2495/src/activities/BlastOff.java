package activities;

/**
 * @author Prajwal Krishna
 * Beginning of class BlastOff
 */
public class BlastOff implements Runnable {

    int i = 0;

    /**
     * Override Runnable's run() method
     * Used to count down the timer like in a spaceship lift off
     */
    @Override
    public void run() {
        for(;;){
            System.out.println("T-"+i);
            i = i + 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
                System.out.println("Stack Trace:");
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BlastOff blastOff = new BlastOff();
        Thread thread = new Thread(blastOff);
        thread.start();
        Thread.sleep(15000);
        System.out.println("main woke up");
        thread.interrupt();
    }
}
