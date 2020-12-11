package Activities;

import java.util.Random;

/**
 * @author Prajwal Krishna
 * Beginning of class Main
 */

public class Main {

    /**
     * Creates object of Shape class and objects of the child classes of Shape
     * with the help of ShapeMover moves these objects and initialises various fields
     * @param args
     */
    public static void main(String[] args) {
        //Shape shape = new Shape("Blue","Black",new Position(100,20));
        //ShapeMover.moveShape(shape,new Position(20,30));
        System.out.println();

        Rectangle rectangle = new Rectangle("blue","black",new Position(10,10),33.21,99);

        ShapeMover.moveShape(rectangle,new Position(20,30));
        System.out.println("Area of rectangle:"+rectangle.area());
        System.out.println("Perimeter  of rectangle:"+rectangle.perimeter());
        rectangle.scale(20);
        System.out.println("scaled:  "+rectangle.toString());


        System.out.println();

        Circle circle = new Circle("red","yellow", new Position(60,70),5);

        ShapeMover.moveShape(circle,new Position(4,22));
        System.out.println("Area of a circle:"+circle.area());
        System.out.println("Perimeter of a circle"+circle.perimeter());
        circle.scale(20);
        System.out.println("Scaled:  "+circle.toString());



        System.out.println();

        Triangle triangle = new Triangle("blue","black",new Position(78,99),7.3,8.8,4,1,2);

        ShapeMover.moveShape(triangle,new Position(54,12));
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());
        triangle.scale(30);
        System.out.println("Scaled:   "+triangle.toString());

    }
}
