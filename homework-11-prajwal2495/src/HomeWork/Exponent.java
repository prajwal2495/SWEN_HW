package HomeWork;

/**
 * @author Prajwal Krishna
 * beginning of class Exponent which extends AbstractOperation and implements Operation interface
 */

public class Exponent extends Activities.AbstractOperation implements Activities.Operation {
    private static final String OPERATOR1 = "**";
    private static final String OPERATOR2 = "^";

    /**
     * Constructor Exponent
     * calls the super constructor to initialise the operator symbol with the respective symbol for difference operation
     */
    public Exponent(){
        super(OPERATOR1, OPERATOR2);
    }

    /**
     * Method operation
     * performs exponent/power calculation on the array of operands
     * @param operands, A double array of all the operands
     * @return a double result of the operation performed
     */
    @Override
    public double operation(double[] operands) {
        if (operands.length == 0) {
            return 0;
        }
        if(operands.length == 1) {
            return operands[0];
        }else{
            double result = operands[0];
            for (int i = 1; i < operands.length ; i++){
                result = Math.pow(result,operands[i]);
            }
            return result;
        }
    }
}
// end of class Exponent