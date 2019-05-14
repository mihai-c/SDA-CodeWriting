package numbers;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Insert number: ");
        int number = sc.nextInt();
        String piramid = "";
        for (int i = 1; i <= number; i++) {
            piramid += i;
            System.out.println(piramid);
        }*/

        // DESENARE POM CRACIUN DIN STELUTE;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti latimea: ");
        int width = sc.nextInt();
        if (isOdd(width)) {
            width++;
        }
        int height = width;

        for (int i = 1; i < height; i++) {
            for (int j = 1; j < width; j++) {
                if (j <= width / 2 - i || j >= width / 2 + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            if (i >= width / 2) {
                trunk(width);
                break;
            }
        }
    }

    static boolean isOdd(int width) {
        return (width % 2 != 0);
    }

    static void trunk(int width) {
        for (int h = 1; h < 4; h++) {
            for (int w = 1; w < width; w++) {
                if (w <= width / 2 - 2 || w >= width / 2 + 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
