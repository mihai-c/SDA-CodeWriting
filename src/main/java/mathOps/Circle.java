package mathOps;

import java.util.Scanner;

public class Circle {
    static double pi=3.141592653589;

    public static void main(String[] args) {
        System.out.println("Insert radius (deciaml): ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println(perimeter(radius));
        System.out.println(aria(radius));
    }

    static double perimeter(double raza){
        return 2*pi*raza;
    }
    static double aria(double raza){
        return pi*(raza*raza);
    }
}
