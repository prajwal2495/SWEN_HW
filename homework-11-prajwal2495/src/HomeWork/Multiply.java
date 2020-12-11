package HomeWork;

/**
 * @author Prajwal Krishna
 * beginning of class Multiply which extends AbstractOperation and implements Operation interface
 */

public class Multiply extends Activities.AbstractOperation implements Activities.Operation {

    private static final String OPERATOR = "*";

    /**
     * Constructor Multiply
     * calls the super constructor to initialise the operator symbol with the respective symbol for difference operation
     */
    public Multiply(){
        super(OPERATOR);
    }


    /**
     * Method operation
     * performs multiplication calculation on the array of operands
     * @param operands, A double array of all the operands
     * @return a double result of the operation performed
     */
    @Override
    public double operation(double[] operands) {
        if(operands.length == 0){
            return 0;
        }else {
            double sum = 1.0d;
            for (int i = 0; i < operands.length; i++){
                sum *= operands[i];
            }
            return sum;
        }
    }
}
// end of class Multiply