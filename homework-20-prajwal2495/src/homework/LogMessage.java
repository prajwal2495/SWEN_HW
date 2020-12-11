package homework;

/**
 * @author Prajwal Krishna
 * Beginning of class LogMessage
 */
public class LogMessage {

    private LogMessageSeverity logSeverity;
    private String moduleName;
    private String dateFormat;
    private String message;
    private int lineNumber;

    /**
     * constructor for class LogMessage
     * @param logSeverity, severity of the log
     * @param moduleName, who is handling the log
     * @param dateFormat, date of the log creation
     * @param message, log message
     */
    public LogMessage(LogMessageSeverity logSeverity, String moduleName, String dateFormat, String message, int lineNumber) {
        this.logSeverity = logSeverity;
        this.moduleName = moduleName;
        this.dateFormat = dateFormat;
        this.message = message;
        this.lineNumber = lineNumber;
    }

    public String getMessage() {
        return message;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * method toString()
     * provides a readable format for the log message
     * @return
     */
    @Override
    public String toString() {
        return "["+this.logSeverity+"]["+dateFormat+"]["+moduleName+"]      "+message;
    }
}
