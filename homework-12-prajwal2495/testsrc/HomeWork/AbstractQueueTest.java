package HomeWork;

/**
 * @author Prajwal Krishna
 * Beginning of the abstract class AbstractQueueTest
 * Provides signatures of the most common testing methods for ADT Queue
 * @param <S> depicts that AbstractQueueTest is a generic class
 */
public abstract class AbstractQueueTest<S> {

    public abstract Queue<S> makeQueue();

    public abstract void testEnqueue();

    public abstract void testDequeue();

    public abstract void testSize();

    public abstract void testPeek();
}
