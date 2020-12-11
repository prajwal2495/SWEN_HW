package Activities;

/**
 * @author Prajwal Krishna
 * beginning of interface Operation
 * provides the definition of common methods for overriding
 */
public interface Operation {
    public boolean matches(String operator);
    public boolean matches(String operator1, String operator2);
    public double operation(double[] operands);
}
// end of interface Operation