package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 50;
        int b = 50;
        int c = 100;
        int d = 0;

        int e1 = 0;
        int e2 = 0;
        int e3 = 0;
        int e4 = 0;

        if (a == b) {
            e1 = 1;
         }
        if (a == b || a == c) {
            e2 = 1;
        } 
        if (a + b == c) {
            e3 = 1;
        }
        if (a + b + c >= 100) {
            e4 = 1;
        }

        d = e1 + e2 + e3 + e4;
        System.out.println("Summe: " + d);
    }
}
