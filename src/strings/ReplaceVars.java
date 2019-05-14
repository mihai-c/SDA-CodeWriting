package strings;

public class ReplaceVars {
    public static void main(String[] args) {
        String pahar1 ="Beer";
        String pahar2 ="Wine";
        System.out.println(pahar1 + " is better than "+ pahar2);

        String tmp;
        pahar1 = tmp = pahar2;
        pahar2 = pahar1;

        System.out.println(pahar1 + " is better than "+ pahar2);
    }
}
