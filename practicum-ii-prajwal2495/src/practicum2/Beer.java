package practicum2;

public class Beer extends Food{

    private static double pint = 473;
    private String name;
    private double ABV;
    Beer(String name, double ABV){
        super(name,0,13,0);
        this.name = name;
        this.ABV = ABV;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getFat() {
        return 0;
    }

    @Override
    public double getFiber() {
        return 0;
    }

    @Override
    public double getCarbs() {
        return 13;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getABV() {
        return ABV;
    }

    public void setABV(double ABV) {
        this.ABV = ABV;
    }

    @Override
    public double getCalories() {
        return ((this.ABV * super.getCalories()) / 22);
    }
}
