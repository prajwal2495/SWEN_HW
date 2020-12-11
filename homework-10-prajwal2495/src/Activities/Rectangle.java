package Activities;

/**
 * @author Prajwal Krishna
 * Beginning of class Rectangle, child class of Shape
 */

public class Rectangle extends Shape implements Figure {

    private double width,height;

    public Rectangle(String fillColor, String lineColor, Position position, double width, double height) {
        super(fillColor, lineColor, position);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area(){
        return this.height * this.width;
    }

    @Override
    public double perimeter() {
        return (this.height * 2) + (this.width * 2);
    }

    @Override
    public void move(Position position) {
        super.move(position);
    }

    @Override
    public void scale(double factor){
        this.height *= factor;
        this.width *= factor;
    }

    @Override
    public Position getPos(){
        return new Position(10,20);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }




    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return String, a detailed information of the pokemon
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "Position="+getPosition()+
                ", Fill color="+getFillColor()+
                ", Line Color="+getLineColor()+
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
