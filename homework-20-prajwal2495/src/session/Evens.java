package session;

/**
 * @author Prajwal Krishna
 * Beginning of class Evens
 */
public class Evens implements  Runnable{
    private Odds lock;

    public Evens(Odds lock) {
        this.lock = lock;
    }

    /**
     * run method on Evens thread
     * it checks to see if the lock is free or not
     * if not then waits else prints an even number and notify other threads that are waiting to obtain the lock
     */
    @Override
    public void run() {

        synchronized (lock){
            //if(!lock.turnTaken()){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    //
                }
            }
        //}

        for(int i = 2; i < 101; i += 2){
            synchronized (lock) {
                System.out.println(i);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    //
                }
            }
        }
    }
}
