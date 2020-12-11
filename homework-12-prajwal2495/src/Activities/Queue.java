package Activities;

/**
 * @Authoe Prajwal Krishna
 * Beginning of Interface Queue
 * Helps in giving a signature of the most common methods used by a Queue implementation
 * @param <S> depicts that Queue is a generic Interface
 */
public interface Queue<S> {
    void enqueue(S value);

    S peek();

    S deQueue();

    int size();
}
