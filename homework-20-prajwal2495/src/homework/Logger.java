package homework;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Prajwal Krishna
 * Beginning of class Logger
 */
public class Logger extends Thread{
    int atomicInteger = 0;
    Object lock = new Object();
    private String filename;
    private Queue<LogMessage> messages;

    /**
     * constructor for Logger class
     * @param filename, take an input filename
     */
    public Logger(String filename) {
        this.filename = filename;
        this.messages = new LinkedList<>();
    }

    /**
     * method EnQueue
     * adds the potential lof message to queue
     * @param message
     */
    public void EnQueue(LogMessage message){
        this.messages.add(message);
    }

    /**
     * method run for the logger thread
     * pools the log message from the queue
     * adds it to the logmessage obj
     * write the logmessage obj to the output file
     */
    @Override
    public void run(){

        try {

            LogMessage logMessage = this.messages.poll();
            String msg = logMessage.toString();
            int lineNumber = logMessage.getLineNumber();
            byte[] bytes = new byte[msg.length()];
            bytes = msg.getBytes();
            byte[] b = "\n".getBytes();
            System.out.println("trying to print"+lineNumber);
            synchronized (lock) {
                while (true) {
                    if (atomicInteger == lineNumber) {
                        System.out.println("printing" + lineNumber);
                        FileOutputStream fos = new FileOutputStream(this.filename, true);
                        fos.write(bytes);
                        fos.write(b);
                        atomicInteger++;
                        fos.close();
                        lock.notify();
                        break;
                    } else {
                        lock.notify();
                        lock.wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}


