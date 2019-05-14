package numbers;

import java.util.Scanner;

public class DayOfWeeks {
    public static void main(String[] args) {
        // print ziua corespunzatoarului numarului specificat;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert number: ");
        int day = sc.nextInt();
        System.out.println(nameOfDay(day));
    }

    static String nameOfDay(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "N/A";
        }
    }
}
