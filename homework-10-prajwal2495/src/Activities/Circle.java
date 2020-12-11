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
    public double perimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public Position getPos(){
        return super.getPosition();
    }

    /**
     * method getArea()
     * calculates the area of a circle
     * @return int, area of a circle
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void scale(double factor){
        this.radius += factor;
    }

    /**
     * @return String, a detailed information of the pokemon
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Position='" + getPos() +
                ", fillColor='" + super.getFillColor() + '\'' +
                ", LineColor='" + super.getLineColor() + '\'' +
                '}';
    }
}
