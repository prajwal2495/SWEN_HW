package session;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Prajwal Krishna
 * Beginning of class JavaRacer
 */
public class JavaRacer {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        Thread[] threads = new Thread[10];
        for(int i = 0; i < threads.length; i++){
            JavaListAdder listAdder = new JavaListAdder(integers);
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
