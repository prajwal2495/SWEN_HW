package Activities;

/**
 * @author Prajwal Krishna
 * Beginning of class Triangle, child class of shape
 */

public class Triangle extends Shape {

    double base,height;
    double side1, side2, side3;

    public Triangle(String fillColor, String lineColor, Position position,double base,double height,double side1,double side2, double side3) {
        super(fillColor, lineColor, position);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void move(Position position) {
        super.move(position);
    }

    /**
     * @return String, a detailed information of the pokemon
     */
    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", Position="+ getPosition() +
                ", fillColor='" + fillColor + '\'' +
                ", LineColor='" + LineColor + '\'' +
                '}';
    }
}
