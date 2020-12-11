public class adsfas {

    private int as;
    private int bs;

    public adsfas(){
        as = 0;
    }

    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        adsfas obj = new adsfas();

        System.out.println(!b);
        System.out.println(b && !a);
        System.out.println(!b || !a);
        System.out.println(b ^ !a);
        System.out.println(a || !b || !a && !b);
        System.out.println((a || b) ^ (a && b));
    }
}
