package arrays;

import numbers.FactorPrim;

public class ArraySum {
    public static void main(String[] args) {
        // Suma elementelor prime din array;
        int[] array = {7,5,9,3,2,4,1};
        int sum = 0;
        for( int element : array){
            if(FactorPrim.isPrime(element)){
                sum+=element;
            }
        }
        System.out.println(sum);
    }

}
