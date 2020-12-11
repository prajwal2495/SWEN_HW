public class Problem02 extends Thread {

    public static final int TOTAL_THREADS = 10;

    public final static Object obj = new Object();

    int threadNo;
    static volatile int counter = 1;

    public Problem02(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {

        synchronized (obj) {

            while (counter <= 1000) {

                if (counter == threadNo || (counter % TOTAL_THREADS == threadNo) || ((counter % TOTAL_THREADS == 0) && (TOTAL_THREADS == threadNo))) {

                    System.out.println(this.threadNo + ":" + counter++);

                    obj.notifyAll();
                } else {

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    public static void main(String args[]) {


        for (int i = 1; i <= TOTAL_THREADS; i++) {
            Problem02 problem02Thread = new Problem02(i);
            problem02Thread.start();
        }
    }
}