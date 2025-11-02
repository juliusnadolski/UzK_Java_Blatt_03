package p3;

public class P3_main {
    public static void main(String[] args) {

        int zahl = 9;

        System.out.println("Der Betrag ist " + Math.abs(zahl));

        System.out.println("Das Quadrat ist " + Math.pow(zahl, 2));

        if (zahl % 2 == 0) {
            System.out.println("Die Zahl ist gerade");
        } else {
            System.out.println("Die Zahl ist ungerade");
        }
    }
}
