package Activities;

/**
 * @author Prajwal Krishna
 * Beginning of interface Figure
 */
public interface Figure {
    public static final double pi = Math.PI;

    public Position getPos();
    public void move(Position position);
    public String getFillColor();
    public String getLineColor();
    public double area();
    public double perimeter();
    public void scale(double factor);
}
// end of Interface Figure
