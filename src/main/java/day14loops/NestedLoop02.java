package day14loops;

import java.util.Scanner;

public class NestedLoop02 {
    public static void main(String[] args) {
        /*
         Aşağıda gördüğünüz şekli console'a yazdıran kodu oluşturunuz

                X X X X X
                X X X X X
                X X X X X
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Satır (row) sayısını giriniz: ");
        int row = input.nextInt();

        System.out.println("Sütun (column) sayısını giriniz: ");
        int column = input.nextInt();

        for (int i = 1 ; i<=row ; i++){//dıştaki loop satırlar için satır sayısı kadar çalışır

            for (int k = 1 ; k<=column ; k++ ){//içteki loop yanyana yazdığından sütunlar için sütun sayısı kadar çalışır
                System.out.print("x ");
            }
            System.out.println();//ilk satır yan yana yazdırıldıktan sonra pointer'ı bir sonraki satıra almak için
        }


    }//main
}//class
