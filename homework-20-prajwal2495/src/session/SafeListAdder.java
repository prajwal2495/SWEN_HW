package session;

import util.MyList;

/**
 * @author Prajwal Krishna
 * Beginning of class SafeListAdder
 */
public class SafeListAdder  implements Runnable {
    private final MyList<Integer> list;

    public SafeListAdder(MyList<Integer> list) {
        this.list = list;
    }

    /**
     * run method for SafeListAdder thread
     * adds values to list by synching threads
     */
    @Override
    public void run() {
        for(int i = 1; i <=1000; i++){
            synchronized (list) {
                list.add(i);
            }
        }
    }
}