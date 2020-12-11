package Activities;

/**
 * @author Prajwal Krishna
 * Beginning of class AbstractOperation implementing interface Operation
 */

public abstract class AbstractOperation implements Operation {
    private final String operator;
    private final String operator1;

    /**
     * AbstractOperation constructor with one single String parameter
     * Initialises the operator sign passed by the user to the class field
     * @param operator, type String
     */
    public AbstractOperation(String operator){
        this.operator = operator;
        operator1 = null;
    }

    /**
     * Overriding AbstractOperation constructor with two String parameter for the exponent class
     * initialises both the class fields with respective operator sign
     * @param operator
     * @param operator1
     */
    public AbstractOperation(String operator , String operator1){
        this.operator = operator;
        this.operator1 = operator1;
    }

    /**
     * AbstractOperation is overriding the method matches with single String parameter
     * this method helps in identifying whether the given operator sign matches with the available operators
     * @param operator, Type String
     * @return a boolean value, true if matched, else false
     */
    @Override
    public boolean matches(String operator) {
        return operator.equals(this.operator);
    }

    /**
     * AbstractOperation is overriding the method matches with two String parameter for exponent class
     * this method helps in identifying whether the given operator sign matches with the available operators for exponent class
     * @param operator1, type String
     * @param operator2, type String
     * @return a boolean value, true if matched, else false
     */
    @Override
    public boolean matches(String operator1, String operator2) {
        return ((operator1.equals(this.operator) || operator2.equals(operator1)) || (operator2.equals(this.operator) || operator1.equals(this.operator1)));
    }
}
// end of class AbstractOperation