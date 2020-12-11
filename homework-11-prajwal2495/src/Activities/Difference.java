package Activities;

/**
 * @author Prajwal Krishna
 * beginning of class Difference which extends AbstractOperation and implements Operation interface
 */

public class Difference extends AbstractOperation implements Operation {


    public static final String OPERATOR = "-";

    /**
     * Constructor Difference
     * calls the super constructor to initialise the operator symbol with the respective symbol for difference operation
     */
    public Difference() {
        super(OPERATOR);
    }

    /**
     * Method operation
     * performs difference calculation on the array of operands
     * @param operands, A double array of all the operands
     * @return a double result of the operation performed
     */
    @Override
    public double operation(double[] operands) {
        if(operands.length == 0){
            return 0;
        }else {
            double difference = operands[0];
            for(int i = 1; i < operands.length; i++){
                difference -= operands[i];
            }
            return difference;
        }
    }
}
// end of class Difference