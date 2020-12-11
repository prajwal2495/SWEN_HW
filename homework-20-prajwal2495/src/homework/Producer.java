package homework;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author Prajwal Krishna
 * Beginning of class Producer
 */
public class Producer extends Thread{

    private Logger logger;
    private int number;
    private String message;
    private int lineNumber;
    private boolean logCreated = false;

    public Producer(){

    }

    /**
     * constructor for Producer
     * initialise a logger obj
     * @param logger, logger class obj
     */
    public Producer(Logger logger){
        this.logger = logger;
    }

    /**
     * method setNumber()
     * sets the number to each producer/module
     * @param number, number asscociated with each module
     */
    public void setNumber(int number){
        this.number = number;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * method setMessage()
     * sets the log message
     * @param message
     */
    public void setMessage(String message){
        this.message = message;
    }

    public boolean isLogCreated() {
        return logCreated;
    }

    /**
     * run method the producer thread
     * creates a log message
     * adds it to the queue and starts a logger thread
     */
    @Override
    public void run() {
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logCreated = true;
        LogMessageSeverity[] logMessageSeverities = new LogMessageSeverity[5];
        logMessageSeverities[0] = LogMessageSeverity.DEBUG;
        logMessageSeverities[1] = LogMessageSeverity.INFO;
        logMessageSeverities[2] = LogMessageSeverity.WARNING;
        logMessageSeverities[3] = LogMessageSeverity.ERROR;
        logMessageSeverities[4] = LogMessageSeverity.CRITICAL;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SS");
        String formattedDate = simpleDateFormat.format(date);

        LogMessage logMessage = new LogMessage(logMessageSeverities[random.nextInt(4)], this.toString(), formattedDate,
                this.message,this.lineNumber);


        this.logger.EnQueue(logMessage);
        this.logger.start();
        //logCreated = true;

    }

    @Override
    public String toString(){
        return "Producer "+this.number;
    }
}
