package HomeWork;

/**
 * @author Prajwal Krishna
 * beginning of class Divide which extends AbstractOperation and implements Operation interface
 */

public class Divide extends Activities.AbstractOperation implements Activities.Operation  {

    private static final String OPERATOR = "/";

    /**
     * Constructor Divide
     * calls the super constructor to initialise the operator symbol with the respective symbol for difference operation
     */
    public Divide(){
        super(OPERATOR);
    }

    /**
     * Method operation
     * performs division calculation on the array of operands
     * @param operands, A double array of all the operands
     * @return a double result of the operation performed
     */
    @Override
    public double operation(double[] operands) {
        if(operands.length == 0){
            return 0;
        }else {
            double result = 1.0d;
            for (int i = 0; i < operands.length; i++){
                result /= operands[i];
            }
            return result;
        }
    }
}
// end of class Divide