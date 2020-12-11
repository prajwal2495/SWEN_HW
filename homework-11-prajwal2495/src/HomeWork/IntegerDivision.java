package HomeWork;

/**
 * @author Prajwal Krishna
 * beginning of class IntegerDivision which extends AbstractOperation and implements Operation interface
 */

public class IntegerDivision extends Activities.AbstractOperation implements Activities.Operation{

    private static final String OPERATOR = "//";

    /**
     * Constructor IntegerDivision
     * calls the super constructor to initialise the operator symbol with the respective symbol for difference operation
     */
    public IntegerDivision(){
        super(OPERATOR);
    }

    /**
     * Method operation
     * performs integer division calculation on the array of operands
     * @param operands, A double array of all the operands
     * @return a double result of the operation performed
     */
    @Override
    public double operation(double[] operands) {
        if(operands.length == 0){
            return 0;
        }
        if(operands.length == 1){
            return (int) operands[0];
        }else{
            double result = operands[0];
            for(int i = 1; i < operands.length; i++){
                result /= operands[i];
            }
            return (int) result;

        }
    }
}
// end of class IntegerDivision