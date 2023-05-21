package day10ifstatements;

import java.util.Scanner;

public class NestedIf01 {//nested iç içe geçmiş demek //matruşka modeli

    public static void main(String[] args) {
        /*
        Örnek 1: Kullanicidan 3 tane sayi aliniz.
                 Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                 Eger ucgen ise "eskenar" Ucgen olma durumunu kontrol ediniz.
                 INFO :
                 Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                   herhangi iki kenar farki ucuncu kenardan kucuk olmali
                 a+b>c>|a-b|
                 a+c>b>|a-c|
                 b+c>a>|b-c|
                 a=b=c ise eskenar ucgen     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir üçgenin kenarları için uzunluk giriniz: ");
        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());//Buradaki mutlak değeri girilecek veriyi kontrol altına almak için aldık

        /* kontrol varsa if() var
        if(){//if bloğunda girdiğimiz veriler (condition) true ise çalışıyordu //outer

            if(){//iki condition doğrulaması yapacak //inner

            }
        }*/
        boolean ucgenMi =  a+b>c && c>Math.abs(a-b) && //a+b>c>|a-b| Buradaki mutlak değeri üçgenin kenarları için aldık
                           a+c>b && b>Math.abs(a-c) && //a+c>b>|a-c|
                           b+c>a && a>Math.abs(b-c);   //b+c>a>|b-c|
        if(ucgenMi){
           if(a==b && b==c && a==c){
               System.out.println("Eşkenar üçgen");
           }else{
               System.out.println("Üçgen ama eşkenar üçgen değil!");
           }
        }else{
            System.out.println("Sen üçgen değilsin!");
        }


    }//main
}//class
