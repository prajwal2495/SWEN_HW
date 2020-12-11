package Activities;

/**
 * @Authoe Prajwal Krishna
 * Beginning of Interface Stack
 * Helps in giving a signature of the most common methods used by a Stack implementation
 * @param <S> depicts that Stack is a generic Interface
 */
public interface Stack<S> {
    public void push(S value);

    public S pop();

    public S peek();

    int size();

}
