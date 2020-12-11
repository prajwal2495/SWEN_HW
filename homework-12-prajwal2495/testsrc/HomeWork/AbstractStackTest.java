package HomeWork;

/**
 * @author Prajwal Krishna
 * Beginning of the abstract class AbstractStackTest
 * Provides signatures of the most common testing methods for ADT Stack
 * @param <S> depicts that AbstractStackTest is a generic class
 */

public abstract class AbstractStackTest<S>{
    public abstract Stack<S> makeStack();

    public abstract void testPush();

    public abstract void testPop();

    public abstract void testSize();

}