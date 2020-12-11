package Activities;

/**
 * @author Prajwal Krishna
 * Beginning of class Shape implements interface Figure
 */

public abstract class Shape implements Figure{
    private String fillColor,LineColor;
    private Position position;

    public Shape(String fillColor, String lineColor, Position position) {
        this.fillColor = fillColor;
        this.LineColor = lineColor;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getLineColor() {
        return LineColor;
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
