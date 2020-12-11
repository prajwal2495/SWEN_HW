package session;

/**
 * @author Prajwal Krishna
 * Beginning of class Odds
 */
public class Odds implements Runnable {
    boolean turn = false;

    public boolean turnTaken() {
        return turn;
    }

    /**
     * run method for Odds thread
     * obtains lock on itself and prints an odd number
     * after printing notifies any thread that is waiting for the lock
     */
    @Override
    public void run() {
        for (int i = 1; i < 101; i += 2) {
            synchronized (this) {
                System.out.println(i);
                turn = true;
                this.notify();
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    //
                }
            }
        }
    }
}
