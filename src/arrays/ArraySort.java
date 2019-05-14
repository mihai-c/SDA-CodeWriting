package arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        //Sortarea arrayului descendent sau ascendent -> < descndent , > ascendent
        int[] array = {7, 5, 9, 3, 2, 4, 1};
        int temp = 0;

        for (int index=0; index<array.length; index++ ) {
            for(int j=0; j<array.length; j++){
                if(array[j]<array[index]){
                    temp = array[j];
                    array[j] = array[index];
                    array[index] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
