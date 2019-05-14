package strings;

import java.util.Scanner;

public class DisplayMatrix {
    public static void main(String[] args) {

        //Displa a matrix full of - with dinamic H x W
        System.out.println("Insert Matrix size:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i=0; i<size;i++){
            for(int j=0; j<size; j++){
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
