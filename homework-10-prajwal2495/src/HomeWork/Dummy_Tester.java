package HomeWork;

import javax.naming.spi.ObjectFactoryBuilder;

public class Dummy_Tester {
    public static void main(String[] args) {

        ArrayOfItems fruitItems = new ArrayOfItems(10);
        Object mango = "iam mango";
        Object apple = "iam apple";
        Object raspberry = "iam raspberry";
        Object blueberry = "iam blueberry";

        Object[] fruits = new Object[5];
        fruits[0] = "ok";
        fruits[1] = "ok1";
        fruits[2] = "ok2";
        fruits[3] = "ok3";
        fruits[4] = "ok4";

        fruitItems.addAll(fruits);


        fruitItems.add(mango);
        fruitItems.add(apple);
        fruitItems.add(raspberry);
        fruitItems.add(blueberry);
        fruitItems.add(mango);
        fruitItems.addAll(fruits);
        fruitItems.add(apple);
        fruitItems.add(raspberry);
        fruitItems.add(blueberry);
        fruitItems.add(mango);
        fruitItems.add(raspberry);
        fruitItems.add(apple);


        System.out.println(fruitItems);

    }
}
