package Activities;

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

        for(int i=0; i<4;  i++) {
            map.put(i, "**" + i + "**");
        }
        //map.put(2,"**0**");
        for(int i=0; i<4; i ++) {
            System.out.println(i + " = " + map.get(i));
        }
    }
}
