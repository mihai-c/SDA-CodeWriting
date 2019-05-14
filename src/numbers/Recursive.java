package numbers;

public class Recursive {
    public static void main(String[] args) {
        //FUNCTII RECURSIVE

        //System.out.println("Suma este: " + sum(10));
        System.out.println(fibonacci(9));
        System.out.println(fibo(9));
    }

    static int sum(int n) {
        int suma = 0;

        if (n == 0) {
            return suma;
        }
        return n + (sum(n - 1));
    }

    static int fibonacci(int n) {
        //numarul lui fiboncci suma dintre anterioarele doua
        if (n <= 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    static int fibo(int n) {
        int t1 = 0;
        int t2 = 1;
        int t3 = 0;
        if (n == t1 || n == t2) {
            return n;
        }
        while (n >= 2) {
            t3 = t2 + t1;
            t1 = t2;
            t2 = t3;
            n--;
        }

        // pt 0 > t1 = 0;
        // pt 1 > t1 + 1;
        // pt 2 >  ->


        return t2;
    }
}
