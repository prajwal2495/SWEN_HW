package Activities;

public class BlowUpTheStack {
    public static void blowUpStackCall(int n){
        for(;;) {
            System.out.println(n);
            n = n - 1;
            blowUpStackCall(n);
        }
    }

    public static void main(String[] args) {
        int n = 1;
        blowUpStackCall(n);
    }
}
