package Activities;

public class WeigthConvertor
{
    public static void main(String[] args )
    {
        System.out.println("50 Kg in pounds is :" + convertor(50));
        System.out.println("87.567 Kg in pounds is :" + convertor(87.567));

        double kilos = convertor(76.56);
        System.out.println("76.56 Kg in pounds is :" + kilos);
    }
    public static double convertor(double pounds)
    {
        return pounds / 2.2;
    }
}
