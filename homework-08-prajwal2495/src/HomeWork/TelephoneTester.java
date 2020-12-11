package HomeWork;

/**
 * @author Prajwal Krishna
 * beginning of class TelephoneTester
 * creates obj of class Telephone and tests the working of all the methods of that class
 */
public class TelephoneTester {
    public static void main(String[] args) {

        /**
         * Creating five obj of class Telephone
         * A copy of obj T1 is being created to demonstrate the shallow/deep equality
         */
        Telephone T1 = new Telephone(12345, TelePhoneType.MOBILE);
        Telephone T1_copy = new Telephone(12345, TelePhoneType.MOBILE);
        Telephone T2 = new Telephone(19876, TelePhoneType.MOBILE);
        Telephone T3 = new Telephone(22543, TelePhoneType.SATELLITE);
        Telephone T4 = new Telephone(98667, TelePhoneType.SATELLITE);
        Telephone T5 = new Telephone(90456, TelePhoneType.MOBILE);

        /**
         * Prints all the information about all the objects created.
         */
        System.out.println(T1.toString());
        System.out.println(T2.toString());
        System.out.println(T3.toString());
        System.out.println(T4.toString());
        System.out.println(T5.toString());

        System.out.println();

        /**
         * Testing dial and disconnect methods on obj T1
         */
        T1.dial(T2.getPhoneNumber());
        T1.disconnect();
        T1.dial(T5.getPhoneNumber());
        T1.disconnect();
        T1.dial(T3.getPhoneNumber());
        T1.disconnect();
        T1.dial(T4.getPhoneNumber());
        T1.disconnect();
        T1.dial(T5.getPhoneNumber());
        T1.disconnect();


        System.out.println();

        /**
         * Testing dial, disconnect and redial methods on obj T2
         */
        T2.dial(T2.getPhoneNumber());
        T2.disconnect();
        T2.dial(T5.getPhoneNumber());
        T2.disconnect();
        T2.dial(T1.getPhoneNumber());
        T2.disconnect();
        T2.dial(T3.getPhoneNumber());
        T2.disconnect();
        T2.dial(T4.getPhoneNumber());
        T2.disconnect();
        T2.reDial();
        T2.disconnect();

        System.out.println();

        /**
         * Testing dial, disconnect and redial methods on obj T3
         */
        T3.dial(T2.getPhoneNumber());
        T3.disconnect();
        T3.dial(T1.getPhoneNumber());
        T3.disconnect();
        T3.dial(T4.getPhoneNumber());
        T3.disconnect();
        T3.dial(T4.getPhoneNumber());
        T3.disconnect();
        T3.dial(T5.getPhoneNumber());
        T3.disconnect();
        T3.reDial();
        T3.disconnect();

        System.out.println();

        /**
         * Testing dial, disconnect and redial methods on obj T4
         */
        T4.dial(T1.getPhoneNumber());
        T4.disconnect();
        T4.dial(T3.getPhoneNumber());
        T4.disconnect();
        T4.dial(T3.getPhoneNumber());
        T4.disconnect();
        T4.dial(T4.getPhoneNumber());
        T4.disconnect();
        T4.dial(T2.getPhoneNumber());
        T4.disconnect();
        T4.reDial();
        T4.disconnect();

        System.out.println();

        /**
         * Testing dial, disconnect and redial methods on obj T5
         */
        T5.dial(T1.getPhoneNumber());
        T5.disconnect();
        T5.dial(T3.getPhoneNumber());
        T5.disconnect();
        T5.dial(T4.getPhoneNumber());
        T5.disconnect();
        T5.dial(T5.getPhoneNumber());
        T5.disconnect();
        T5.dial(T3.getPhoneNumber());
        T5.disconnect();
        T5.reDial();
        T5.disconnect();

        System.out.println();

        /**
         * prints all the information about the objects after they have placed their respective calls
         */
        System.out.println(T1.toString());
        System.out.println(T2.toString());
        System.out.println(T3.toString());
        System.out.println(T4.toString());
        System.out.println(T5.toString());

        System.out.println();

        /**
         * performing shallow and deep equality on objects
         */
        System.out.println("Using == for comparison between objects (shallow equality):"+(T1 == T1_copy));
        System.out.println("Using equals for comparing two objects (shallow equality):"+T1.equals(T1_copy));

        System.out.println("Using == for comparing fields two objects (deep equality):"+(T1.getPhoneNumber() == T1_copy.getPhoneNumber()));

        System.out.println();

        /**
         * getting the call logs of all objects
         */
        T1.listOfDial();
        System.out.println();
        T2.listOfDial();
        System.out.println();
        T3.listOfDial();
        System.out.println();
        T4.listOfDial();
        System.out.println();
        T5.listOfDial();

        System.out.println();

        /**
         * printing total number of calls made by all the objects
         */
        System.out.println("total number of call : "+ Telephone.getNumberOfCalls());
    }
}
/**
 end of class TelephoneTester
 */