package mathOps;

public class Sum {
    public static void main(String[] args) {

        System.out.println(sumOfDigits(24));
        System.out.println(sumOfNumbersInArray());
        //System.out.println(sumOfDigitsB(24));
    }

    static int sumOfDigits(int num) {
        int sum = 0;
        String str = "mama";//Integer.toString(num);
        int[] digitArray = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            digitArray[i] = str.charAt(i) - '0';
        }
        for (int a : digitArray) {
            sum += a;
        }
        return sum;
    }

    static int sumOfDigitsB(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    static int sumOfNumbersInArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
