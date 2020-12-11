package HomeWork;

/**
 * @author Prajwal Krishna
 * beginning of class Modulo which extends AbstractOperation and implements Operation interface
 */

public class Modulo extends Activities.AbstractOperation implements Activities.Operation {

    private static final String OPERATOR = "%";

    /**
     * Constructor Modulo
     * calls the super constructor to initialise the operator symbol with the respective symbol for difference operation
     */
    public Modulo() {
        super(OPERATOR);
    }

    /**
     * Method operation
     * performs modulo calculation on the array of operands
     * @param operands, A double array of all the operands
     * @return a double result of the operation performed
     */
    @Override
    public double operation(double[] operands) {
        if (operands.length == 0) {
            return 0;
        }
        if(operands.length ==1) {
            return operands[0];
        }else{
            double result = operands[0];
            for (int i = 1; i < operands.length ; i++){
                    result %= operands[i];
                }
            return result;
        }
    }
}
// end of class Modulo