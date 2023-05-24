package day15loops;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        /*
        Example 1: Asağıdaki şekli çizen kodu yazınız
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Satır (row) sayısını giriniz: ");
        int row = input.nextInt();

        for (int i = 1 ; i <= row ; i++) {//outer loop

            for (int k = 1 ; k <= i ; k++) {//inner loop
                System.out.print(k + " ");
            }
            System.out.println();
        }


    }//main
}//class
