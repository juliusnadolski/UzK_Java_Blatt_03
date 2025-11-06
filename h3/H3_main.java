package h3;

public class H3_main {
    public static void main(String[] args) {
        int max = 5;
        int fix = 2;
        int wartend = 2;
        boolean istVoll = false;

        if (wartend == 0) {
            System.out.println("Es gibt keine wartenden Personen");
            System.out.println("Fixplätze: " + fix);
        } else {
            while (fix < max && wartend > 0) {
                fix++;
                wartend--;
            }

            istVoll = (fix == max);

            System.out.println("Die Kapazität ist voll: " + istVoll);
            System.out.println("Plätze: " + fix + " / " + max);
            System.out.println("Noch wartend: " + wartend);
        }
    }
}