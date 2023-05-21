package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki basamağındaki
        // rakamların toplamını yazdıran kodu yazınız --> 38671

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamaklı bir sayı giriniz:");
        int number = input.nextInt();



        //bir sayının son rakamını alabilmek için o sayıyı 10'a bölüp kalanı almalıyız
        //% --> modulus operator solunda bulunan sayının sağında bulunan sayıya bölümünden kalanı verir
        //dolayısıyla %10 her zaman bize birler basamağında bulunan sayıyı verir
        //bir tamsayıyı bir tamsayıya bölerseniz java sonucu kesinlikle tamsayı yapar
        //java bu durumda yuvarlama yapmaz, ondalık kısmı iptal eder
        //dolayısıyla bir tamsayıyı 10'a bölersek birler basamağını silmiş oluruz

        //son rakamı al
        int birlerBasamagi = number%10;
        //sayı küçült
        number = number/10;

        //sondan ikinci rakamı al
        int sondanİkinci = number%10;
        //sayı küçült
        number = number/10;

        //sondan üçüncü rakamı al
        int sondanUcuncu = number%10;
        //sayıyı küçült
        number = number/10;

        //sondan dördüncü rakamı al
        int sondanDorduncu = number%10;
        //sayıyı küçült
        number = number/10;

        //sondan beşinci rakamı al
        int sondanBesinci = number%10;
        //son rakam olduğu için küçültmeye gerek yok

        System.out.println(birlerBasamagi + sondanİkinci + sondanDorduncu + sondanBesinci);

        /*
        HOMEWORK
        1) Kullanıcıdan aldığınız 3 tane sayının ortalamasını bulan kodu yazınız
        // örneğin --> 3,5,7 için ort (3+5+7)/3
        2) Kullanıcıdan aldığınız 3 basamaklı bir sayının rakamları tplamını bulunuz
        //örneğin --> 321 için 3+1+2
         */
    }
}
