package session;

/**
 * @author Prajwal Krishna
 * Beginning of class Counter
 * counts even and odds by call both the threads
 */
public class Counter {
    public static void main(String[] args) {
        Odds odds = new Odds();
        Thread oddsThread = new Thread(odds);

        Evens evens = new Evens(odds);
        Thread evensThread = new Thread(evens);
        oddsThread.start();
        evensThread.start();
    }
}
