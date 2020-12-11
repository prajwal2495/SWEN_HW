package practicum2;

public class Main {

    public static void main(String[] args) {
        Beer kingfisher = new Beer("Kingfisher",0.1);
        double cal = kingfisher.getCalories();
        System.out.println("beer calories for 10 % ABV is :"+cal);
    }
}
