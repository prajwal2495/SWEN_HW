package session;

import java.util.List;

/**
 * @author Prajwal Krishna
 * Beginning of class JavaListAdder
 */
public class JavaListAdder  implements  Runnable {
    private final List<Integer> list;

    public JavaListAdder(List<Integer> list) {
        this.list = list;
    }

    /**
     * run method for the thread class JavaListAdder
     * add the value to the default java implementation of lists
     */
    @Override
    public void run() {
        for(int i = 1; i <=1000; i++){
            list.add(i);
        }
    }
}
