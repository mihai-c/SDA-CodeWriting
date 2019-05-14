package calculator;

import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        System.out.println("Introduceti primul numar:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println("Introduceti operatia:");
        String str = sc.next();

        System.out.println("Introduceti al doilea numar:");
        int n2 = sc.nextInt();

        calculate(str,n1,n2);

    }
    static int sumOfNumbers(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    static int diffOfNumbers(int n1, int n2) {
        int diff = n1 - n2;
        return diff;
    }

    static int mulOfNumbers(int n1, int n2) {
        int mul = n1 * n2;
        return mul;
    }

    static double divOfNumbers(int n1, int n2) {
        double div = (double) n1 / n2;
        return div;
    }

    static void  calculate(String sign, int n1, int n2){
        if(sign.equals("+")){
            System.out.println("Suma este:" + sumOfNumbers(n1,n2));
        }else if(sign.equals("-")){
            System.out.println("Scaderea este:" + diffOfNumbers(n1,n2));
        }else if(sign.equals("*")){
            System.out.println("Inmultirea este:" + mulOfNumbers(n1,n2));
        }else if(sign.equals("/")){
            System.out.println("Impartirea este:" + divOfNumbers(n1,n2));
        }
    }
}
