package Activities;

/**
 * @author Prajwal Krishna
 * Beginning of class ShapeMover
 */

public class ShapeMover {
    public static void moveShape(Shape shape, Position position){
        System.out.println(shape);
        shape.move(position);
        System.out.println(shape);
    }
}
