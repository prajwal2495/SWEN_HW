package HomeWork;

/**
 * @author Prajwal Krishna
 * Beginning of class Main
 */
public class Main {
    /**
     * method main()
     * used to test the functionalities of HashingMap class
     * @param args
     */
    public static void main(String[] args) {

        Map<Integer,String> map = new HashingMap<>();

        for(int i=0; i<1000; i = i + 11) {
            map.put(i, "**" + i + "**");
        }

        for(int i=0; i<1000; i = i + 11) {
            System.out.println(i + " = " + map.get(i));
        }
    }
}
