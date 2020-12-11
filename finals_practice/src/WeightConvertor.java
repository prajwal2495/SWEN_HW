public class WeightConvertor {

    public static double convert(double pound){
        double kg = pound * 2.205;
        return kg;
    }

    public static void main(String[] args) {
        double kg1 = convert(10);
        System.out.println("pound: 10");
        System.out.println("KG: "+kg1);
    }
}
