package HomeWork;
import java.util.Arrays;

/**
 * @author Prajwal Krishna
 * Beginning of class ArrayStack which is a generic class and implements Stack interface
 * @param <A>
 */
public class ArrayStack<A> implements Stack{

    private Object[] array;
    private int length;
    private int size;

    /**
     * Constructor method
     * Initialises an Array of Object
     * @param length
     */
    public ArrayStack(int length){
        array = new Object[length];
        this.length = length;
        size = 0;
    }

    /**
     * Method push()
     * Helps in adding a value of generic type to the top of the Stack
     * If the total capacity of stack is exhausted and there are more elements to be added the length of the Object array will be multiplied by 2 and increased to accommodate all the elements
     * @param value, An array of values of Object type where each element gets added to the top of the Stack in a loop
     */
    @Override
    public void push(Object[] value) {
        if(this.size == 0){
            for(int i = 0; i < value.length; i++){
                if(size == this.array.length){  //if array becomes full after adding latest element.
                    this.array = Arrays.copyOf(this.array, (this.array.length * 2));
                    this.length = this.length * 2;
                    this.array[i] = value[i];
                }
                else {
                    this.array[i] = value[i];
                }
                this.size++;
            }
        }
        else{
            for(int i = 0; i < value.length; i++){
                if(i == this.array.length){  //if array becomes full after adding latest element.
                    this.array = Arrays.copyOf(this.array, (this.length * 2));
                    this.length = this.length * 2;
                    this.array[i] = value[i];
                }
                else {
                    this.array[i] = value[i];
                }

                this.size++;
            }
        }
    }

    /**
     *  method pop()
     *  in a Stack the first value on the top the stack gets removed
     *  This method also removes the top element from the stack
     *  @return the popped value, which would be the first element of the stack
     */
    @Override
    public Object pop() {
        Object value = this.array[size-1];
        this.array[size - 1] = null;
        this.size--;
        return value;
    }


    /**
     * method peek()
     * This method helps to extract the top value of the Stack
     * @return the top element of the Stack
     */
    @Override
    public Object peek() {
        for(int i = this.array.length - 1; i >= 0; i--){
            if(array[i] != null){
                return array[i];
            }
            else{
                continue;
            }
        }
        return null;
    }

    /**
     * method size()
     * returns the actual size of the Stack
     * @return an integer which depicts the size of the Stack
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Accessor for field length
     * @return an integer, which is the total length of the stack.
     */
    public int getLength() {
        return length;
    }




    @Override
    public void push(Object value) {

    }



    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(2);
        Object[] arr = new Object[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arrayStack.push(arr);
        System.out.println("Stack: "+Arrays.toString(arr));
        System.out.println("Peek : "+arrayStack.peek());
        System.out.println("Pop :"+arrayStack.pop());
        System.out.println("Peek : "+arrayStack.peek());
        System.out.println("Pop :"+arrayStack.pop());
        System.out.println("Peek : "+arrayStack.peek());
    }
}
