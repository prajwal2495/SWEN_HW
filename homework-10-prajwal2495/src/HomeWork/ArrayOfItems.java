package HomeWork;

import java.util.Scanner;

/**
 * @author Prajwal Krishna
 * Beginning of class ArrayOfItems which extends the abstract class AbstractItems
 */
public class ArrayOfItems extends AbstractItems{
    int index = 0;

    /**
     * Constructor
     * creates an array of objects of the size passed as parameter
     * @param size, which is the size of the array of objects
     */
    ArrayOfItems(int size){
        this.item = new Object[size];
    }

    /**
     * method add()
     * adds a particular object passed as parameter to the array of objects
     * @param item, a parameter of type Object which will be added to the array of object created
     */
    @Override
    public void add(Object item) {
        if(index > this.item.length){
            System.out.println("Object array is full");
            return;
        }
        if (index < this.item.length) {
            this.item[index] = item;
            index++;
        }
    }

    /**
     * method size()
     * return the exact size of the object array i.e., the number of items in the object array at a particular time
     * @return an integer which will give the size of the object array
     */
    @Override
    public int size(){
        int size = 0;
        for(int i = 0;i < this.item.length; i++){
            if(this.item[i] != null) {
                size += 1;
            }
        }
        return size;
    }

    /**
     * method get()
     * helps in extracting the information from the object array from a particular index
     * @param index, index of which the information is required
     * @return an Object at a particular index provided
     */
    @Override
    public Object get(int index){
        return this.item[index] != null ? this.item[index] : null;
    }


    /**
     * Main method
     * tests add(), addAll(), get(), size() methods
     * tests whether the object array is full and if so ignore any other objects that are requested to be inserted.
     * @param args
     */
    public static void main(String[] args) {
        ArrayOfItems fruitItems = new ArrayOfItems(10);
        System.out.println("Current size:"+fruitItems.size());
        Object mango = "mango";
        Object apple = "apple";
        Object Two = 2;
        Object blueberry = "blueberry";
        fruitItems.add(mango);
        fruitItems.add(apple);
        fruitItems.add(Two);
        fruitItems.add(blueberry);
        System.out.print(fruitItems);
        System.out.println("Current size:"+fruitItems.size());

        Object[] fruits = new Object[5];
        System.out.println("Enter the items for array of objects:");
        for(int i = 0; i < fruits.length; i++){
            fruits[i] = (Object) new Scanner(System.in).nextLine();
        }

        fruitItems.addAll(fruits);
        fruitItems.add(mango);
        fruitItems.add(apple);
        fruitItems.add(blueberry);
        fruitItems.add(blueberry);
        fruitItems.add(blueberry);
        fruitItems.add(blueberry);


        System.out.println("Values in Obj:\n"+fruitItems);
        System.out.println("Current size:"+fruitItems.size());
        System.out.println(fruitItems.get(4));
    }
}
