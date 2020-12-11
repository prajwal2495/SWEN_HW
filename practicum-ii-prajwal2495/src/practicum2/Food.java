package practicum2;

public abstract class Food implements Consumable {

    private String name;
    private double fat, carbs, fiber;
    Food(String name, double fat, double carbs, double fiber){
        this.name = name;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    @Override
    public double getFiber() {
        return fiber;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

    @Override
    public double getCalories() {
        return ((this.fat * 10) + (this.carbs * 4) + (this.fiber * 4));
    }


    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", fat=" + fat +
                ", carbs=" + carbs +
                ", fiber=" + fiber +
                '}';
    }
}
