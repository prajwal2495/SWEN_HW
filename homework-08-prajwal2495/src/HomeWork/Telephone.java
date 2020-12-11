package HomeWork;

import java.util.Arrays;

/**
 * @author Prajwal Krishna
 * Beginning of class Telephone
 */

public class Telephone {

    private TelePhoneType type;

    private static long defaultNumber = 5550001;
    private static int numberOfCalls = 0;

    private boolean callInProgress = false;
    private long phoneNumber;
    private long onGoingCallNumber;
    private long[] logs = new long[10];


    /**
     * Constrictor Telephone
     * fills the logs array with 0
     * and then everytime the constructor is invoked a new default number is being generated
     */
    public Telephone(){
        Arrays.fill(this.logs,0);
        this.type = TelePhoneType.LANDLINE;

        this.phoneNumber = defaultNumber;
        defaultNumber++;
    }

    /**
     * Constructor Telephone which initialises the phoneNumber and type of the phone
     * @param phoneNumber
     * @param type
     */
    public Telephone(int phoneNumber, TelePhoneType type){
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    /**
     * Method getPhoneNumber()
     * @return Long, phoneNumber of the given object
     */
    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Method setPhoneNumber, which can be used in case where phoneNumber of an object changes
     * @param phoneNumber
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Method getType()
     * @return an object of Enum TelePhoneType which can be any of the three defined in the Enum
     */
    public TelePhoneType getType() {
        return this.type;
    }

    /**
     * Method setType(), sets the type of the comms used by the object and can be used in case the type changes
     * @param type which is an object of enum TelePhoneType
     */
    public void setType(TelePhoneType type) {
        this.type = type;
    }

    /**
     * Method getNumberOfCalls()
     * @return an int, which is the total number of calls made by all objects
     */
    public static int getNumberOfCalls() {
        return Telephone.numberOfCalls;
    }

    /**
     * Method getTelephoneType()
     * @return an Enum object, which will the current type of comms used by the particular obj
     */
    public TelePhoneType getTelephoneType(){
        return this.type;
    }

    /**
     * Method equals()
     * Overloaded the method equals and is used to check majorly whether the object is trying to call itself.
     * @param obj which is of type Object
     * @return boolean true or false
     */
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }else if(obj instanceof Telephone){
            Telephone ob = (Telephone) obj;
            return(this.phoneNumber == ob.phoneNumber);
        }
        return false;
    }

    /**
     * Method dial()
     * used to make a call to a number
     * checks whether any other call is in progress with the current obj.
     * if not, places a call until disconnected
     * @param number which is the phone number obj is trying to connect with
     */
    public void dial(long number){
        if(number == this.phoneNumber){
            System.out.println("Error Occurred: Can not call your own number");
        }else if(this.callInProgress == true){
            System.out.println("Busy in an another call");
        }else{
            numberOfCalls++;
            this.callInProgress = true;
            this.onGoingCallNumber = number;
            for(int i = 0; i < logs.length; i++){
                if(this.logs[i] == 0){
                    this.logs[i] = number;
                    break;
                }
            }
            System.out.println(this.phoneNumber+ " in call with " + number);
        }
    }

    /**
     * method disconnect()
     * if any call/s are in progress it disconnects the call with that particular obj
     */
    public void disconnect(){
        if(this.callInProgress == false){
            System.out.println("There is no ongoing call");
        }else{
            this.callInProgress = false;
            System.out.println(this.phoneNumber+"'s Call ended with "+this.onGoingCallNumber);
        }
    }

    /**
     * method listOfDial()
     * gives the call log of particular obj
     */
    public void listOfDial(){
        System.out.println(this.phoneNumber+"'s call log");
        for(int i = this.logs.length - 1; i >= 0; i--){
            if(this.logs[i] != 0){
                System.out.println(this.logs[i]);
            }
        }
    }

    /**
     * method lastDialled()
     * @return a String containing the most recently dialled number of the particular obj
     */
    public String lastDialled(){
        if(this.logs[0] == 0){
            return "No number was recently dialled";
        }else{
            for(int i = this.logs.length - 1; i >= 0; i--) {
                if (this.logs[i] != 0) {
                    return "Last dialled number was " + logs[i];
                }
            }
        }
        return "";
    }

    /**
     * method reDial()
     * identifies the most recently called number by that particular obj and places a call with that number
     */
    public void reDial() {
        if (this.logs[0] == 0) {
            System.out.println("No number to redial");
        } else {
            for (int i = this.logs.length - 1; i >= 0; i--) {
                if (this.logs[i] != 0) {
                    dial(this.logs[i]);
                    break;
                }
            }
        }
    }

    @Override
    /**
     * @return A String with information about the obj like type of comms, phone number and most recently dialled number by that obj
     */
    public String toString() {
        return "Telephone{" +
                "type= " + this.type +
                ", phoneNumber= " + this.phoneNumber +
                ", Last dialled= "+ this.lastDialled()+
                "}";
    }
}
// end of class Telephone