package numbers;

public class FactorPrim {
    public static void main(String[] args) {
        // verificare numar daca este prim
        int numar = 26;
        System.out.println(isPrime(numar));
    }

    static int getMaxPrimeDiv(int n) {
        int max = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && isPrime(i) && i > max) {
                max = i;
            }
        }
        return max;
    }

    public static boolean isPrime(int x) {
        for (int divizor = 2; divizor < x; divizor++) {
            if (x % divizor == 0) {
                return false;
            }
        }
        return true;
    }
}
