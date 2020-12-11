import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

@SuppressWarnings("ALL")
public class GroceryItems {
    private String name;
    private double price, weight;


    public GroceryItems(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "GroceryItems{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }


    public static Queue<GroceryItems> addRandomItems(){
        Random random = new Random();
        Queue<GroceryItems> groceryItemsQueue = new LinkedList<>();

        for(int i = 1; i < 26; i++){
            groceryItemsQueue.add(new GroceryItems("Item #"+i, random.nextInt(20) + 1, random.nextInt(10) + 1));
        }
        return groceryItemsQueue;
    }


    public static Stack<GroceryItems> packAllItems(Queue<GroceryItems> groceryItemsQueue){
        double dummyWeight = 0.0;
        Stack<GroceryItems> groceryItemsStack = new Stack<>();

        for(GroceryItems groceryItems : groceryItemsQueue){
            if(groceryItems.getWeight() >= dummyWeight){
                dummyWeight = groceryItems.getWeight();
                groceryItemsStack.push(groceryItems);
            }
        }
        return groceryItemsStack;
    }


    public static void main(String[] args) {
        Stack<GroceryItems> unpackItems;
        Queue<GroceryItems> groceryItemsQueue;
        groceryItemsQueue = GroceryItems.addRandomItems();

        double total_cost = 0.0;
        for(GroceryItems groceryItems : groceryItemsQueue){
            total_cost += groceryItems.getPrice();
        }

        System.out.println("Total Cost: "+total_cost);

        while(!groceryItemsQueue.isEmpty()){
            unpackItems = GroceryItems.packAllItems(groceryItemsQueue);
            System.out.println("unpacking the next bag...");
            for(GroceryItems groceryItems : unpackItems){
                System.out.println(groceryItems.toString());
            }
            System.out.println();
            for(GroceryItems groceryItems : unpackItems){
                groceryItemsQueue.remove(groceryItems);
            }
        }
    }
}