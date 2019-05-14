package numbers;

public class EvenOdd {
    public static void main(String[] args) {
        //Verificare numar daca este par sau impar
        int[] originalArray = {5, 7, 2, 4, 9};
        int totalOdd = 0; // este impar
        int totalEven = 0;

        for (int number : originalArray) {
            if(isOdd(number)){
                totalOdd++;
            }else{
                totalEven++;
            }
        }
        System.out.println("Number of odd elements in the array: " + totalOdd );
        System.out.println("Number of even elements in the array: " + totalEven );
    }

    static boolean isOdd(int number) {
        return (number % 2 == 0);
    }
}
