package session;

import util.MyArrayList;
import util.MyList;

/**
 * @author Prajwal Krishna
 * Beginning of class Racer
 */
public class Racer {
    public static void main(String[] args) {
        MyList<Integer> integers = new SafeArrayList<>();
        Thread[] threads = new Thread[10];
        for(int i = 0; i < threads.length; i++){
            ListAdder listAdder = new ListAdder(integers);
            Thread thread = new Thread(listAdder);
            thread.start();
            threads[i] = thread;
        }

        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(integers.size());
    }
}
