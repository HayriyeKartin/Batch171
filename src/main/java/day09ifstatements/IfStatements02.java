package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Örnek 1: Kullanıcıdan alınan bir sayının tek mi çift mi olduğunu yazdıran kodu oluşturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int num = input.nextInt();

        //1. Yol:
       /* if(num % 2 == 0){
            System.out.println("çift sayıdır");
        }
        if(num % 2 != 0){
            System.out.println("tek sayıdır");
        }
       */
        //2. Yol: kontrol edilen condition sayısı daha az olduğu için tavsiye edilir
        if(num % 2 == 0){
            System.out.println("Çift sayıdır!");
        }else{//aksi takdirde, değilse vb
            System.out.println("Tek sayıdır!");
        }
    }
}
