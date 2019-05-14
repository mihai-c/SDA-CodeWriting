package mathOps;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(sumMultipleThree() + sumMultipleFive());

        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (isMultiple(i, 3)) {
                sum += i;
            }
            if (isMultiple(i, 5)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    static int sumMultipleThree() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static int sumMultipleFive() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static boolean isMultiple(int n, int multiple) {
        if (n % multiple == 0) {
            return true;
        } else {
            return false;
        }
    }
}
