package Activities;

/**
 * @author Prajwal Krishna
 * Beginning of class Circle, child class of Shape
 */

public class Circle extends Shape {
    private double radius;

    /**
     * constructor of Circle to build the parent class and to initialise it's own fields
     * @param fillColor
     * @param lineColor
     * @param position
     * @param radius
     */
    public Circle(String fillColor, String lineColor, Position position, double radius) {
        super(fillColor, lineColor, position);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Method getPerimeter()
     * calculates the perimeter of a circle
     * @return int, perimeter of a circle
     */
    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    /**
     * method getArea()
     * calculates the area of a circle
     * @return int, area of a circle
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * @return String, a detailed information of the pokemon
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Position='" + getPosition() +
                ", fillColor='" + fillColor + '\'' +
                ", LineColor='" + LineColor + '\'' +
                '}';
    }
}
