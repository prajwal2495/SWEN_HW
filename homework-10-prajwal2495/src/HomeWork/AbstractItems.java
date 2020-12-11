package HomeWork;

/**
 * @author Prajwal Krishna
 * beginning of class AbstractItems implements interface Items
 */
public abstract class AbstractItems implements Items {

    Object item[] = new Object[10];
    int index = 0;

    /**
     * Method addAll()
     * Adds all the objects in an object array
     * @param items, An array of objects
     */
    public void addAll(Object[] items){
        if(index > items.length){
            System.out.println("Array is full");
            return;
        }
        for(int i = 0; i < items.length; i++){
            index++;
            add(items[i]);
        }
    }

    /**
     * method toString()
     * provides a meaningful information about what the object is storing
     * @return a String with information about an object
     */
    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < item.length; i++){
            if(item[i] != null){
                output = output + get(i)+ " \n";
            }
        }
        return output;
    }
}
