package HomeWork;

/**
 * @author Prajwal Krishna
 * class ItemsTest begins
 */
public class ItemsTest {

    /**
     * method test()
     * @param item, take an interface object as parameter
     * tests add function across different objects like Integer / String / Float
     */
    public static void testItems(Items item){
        item.add(5);
        System.out.print(item);

        item.add("Hello, A String obj");
        item.add(6.234);

        item.add("Hello, Another String obj");
        System.out.print(item);
    }

    /**
     * Main method
     * @param args
     * creates an object array of type ArrayOfItems and of size specified
     * checks for the working of method test and adds items to the object type ListOfItems
     */
    public static void main(String[] args) {
        ArrayOfItems ArrayItems = new ArrayOfItems(1);
        System.out.println("Testing the inheritance between AbstractItems and ArrayOfItems:");
        testItems(ArrayItems);

        System.out.println("Testing ListOfItems class");
        ListOfItems itemsList = new ListOfItems();
        itemsList.add(5);
        itemsList.add("Mango");
        itemsList.add("Java");
        itemsList.add(10.96);
        System.out.println("Size of ItemsList:"+itemsList.size());
        System.out.println("At a specific index:"+itemsList.get(2));
    }

}
