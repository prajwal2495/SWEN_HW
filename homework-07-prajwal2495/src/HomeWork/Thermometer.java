package HomeWork;

//Class thermometer begins
public class Thermometer {

    //private fields
    private double celsius;
    private double fahrenheit;
    private double kelvin;

    //parameter less constructor setting celsius to 37
    public Thermometer(){
        this.celsius = 37.0;
    }

    // mutator to set celsius
    public void setCelsius(double temp, String scale){
        if(scale.equals("c")) {
            this.celsius = temp;
        }else if(scale.equals("f")){
            this.celsius = (temp - 32.0) * 5/9;
        }else{
            this.celsius = temp - 273.15;
        }
    }

    //accessor to get the value of the celsius
    public void getCelsius() {
        System.out.println("Celsius: "+this.celsius);
    }

    //mutator to set the value of fahrenheit
    public void setFahrenheit(double temp, String scale) {
        if(scale.equals("f")){
            this.fahrenheit = temp;
        }else if(scale.equals("c")) {
            this.fahrenheit = (temp * 9 / 5) + 32.0;
        }else{
            this.fahrenheit = (temp - 273.15) * 9 / 5 + 32;
        }
    }

    //Accessor to get the value of the fahrenheit
    public void getFahrenheit() {
        System.out.println("Fahrenheit is: "+this.fahrenheit);
    }

    //mutator to get the value of the kelvin
    public void setKelvin(double temp, String scale) {
        if(scale.equals("k")){
            this.kelvin = temp;
        }else if (scale.equals("c")) {
            this.kelvin = temp + 273.15;
        }else{
            this.kelvin = (temp - 32) * 5 / 9 + 273.15;
        }
    }

    //accessor to get the value of the kelvin
    public void getKelvin() {
        System.out.println("Kelvin is: "+this.kelvin);
    }

    @Override
    public String toString(){
        return "[Celsius: "+this.celsius+"  "+"Fahrenheit: "+this.fahrenheit+"  "+"Kelvin: "+this.kelvin+"]";
    }

}
// end of class thermometer