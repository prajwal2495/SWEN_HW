package Activities;

/**
 * @author Prajwal Krishna
 * beginning of class Sum which extends AbstractOperation and implements Operation interface
 */

public class Sum extends AbstractOperation implements Operation {

    public static final String OPERATOR = "+";

    /**
     * Constructor Sum
     * calls the super constructor to initialise the operator symbol with the respective symbol for difference operation
     */
    public Sum() {
        super(OPERATOR);
    }

    /**
     * Method operation
     * performs sum calculation on the array of operands
     * @param operands, A double array of all the operands
     * @return a double result of the operation performed
     */
    @Override
    public double operation(double[] operands) {
        if(operands.length == 0){
            return 0;
        }else {
            double sum = 0.0d;
            for (int i = 0; i < operands.length; i++){
                sum += operands[i];
            }
            return sum;
        }
    }
}
// end of class Sum