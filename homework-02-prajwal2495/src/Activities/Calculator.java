package Activities;

public class Calculator
{
    public static void calculate(double x, double y)
    {
        System.out.println("X + Y = "+ (x + y));
        System.out.println("X - Y = "+ (x - y));
        System.out.println("X * Y = "+ (x * y));
        System.out.println("X / Y = "+ (x / y));
        System.out.println("");
    }

    public static void main(String[] args)
    {
        calculate(99,76.99);
        calculate(1.889,7.88);
        calculate(8,987.66);
    }
}
