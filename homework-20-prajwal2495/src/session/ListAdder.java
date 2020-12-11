package session;

import util.MyList;

/**
 * @author Prajwal Krishna
 * Beginning of class ListAdder
 */
public class ListAdder implements Runnable {
    private final MyList<Integer> list;

    public ListAdder(MyList<Integer> list) {
        this.list = list;
    }

    /**
     * run method for the thread class ListAdder
     * add the values to the list
     */
    @Override
    public void run() {
        for(int i = 1; i <=1000; i++){
            list.add(i);
        }
    }
}
