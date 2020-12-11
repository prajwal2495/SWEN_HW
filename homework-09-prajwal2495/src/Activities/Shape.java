package Activities;

/**
 * @author Prajwal Krishna
 * Beginning of class Shape
 */

public class Shape {
    String fillColor,LineColor;
    private Position position;

    public Shape(String fillColor, String lineColor, Position position) {
        this.fillColor = fillColor;
        this.LineColor = lineColor;
        this.position = position;
    }

    protected Position getPosition() {
        return position;
    }

    protected String getFillColor() {
        return fillColor;
    }

    protected String getLineColor() {
        return LineColor;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    public void move(Position position){
        this.position = position;
    }

    /**
     * @return String, a detailed information of the pokemon
     */
    @Override
    public String toString() {
        return "Shape{" +
                "fillColor='" + fillColor + '\'' +
                ", LineColor='" + LineColor + '\'' +
                ", position=" + position +
                '}';
    }
}
