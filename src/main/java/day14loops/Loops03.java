package day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        //Örnek 1: Kullanıcıdan başlangıç ve bitiş değerlerini alın
        //Başlangıç değerinden başlayıp bitiş değerine kadar aradaki tüm çift tamsayıları ekrana yazdırın
        // 9 - 14 --> 10 12 14

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir başlangıç değeri giriniz: ");
        int start = input.nextInt();

        System.out.println("Lütfen bitiş değerini giriniz: ");
        int end = input.nextInt();

        if (start>end){
            System.out.println("Başlangıç değeri bitiş değerinden büyük olmamalıdır!");
        }else{
            for (int i = start ; i<=end ; i++ ){
                if (i%2==0){
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println();
        //Örnek 2: Hiç sayı kullanmadan 1'den 100'e kadar olan sayıları console'a yazdırınız

        for (int i = 'd'/'d' ; i<='d' ; i++) {
            System.out.print(i + " ");
        }

        //int d = 'd';
        //System.out.println(d);//100

        /*
        NOTE: Bazı loop'lar sonsuz defa çalışabilir, bu tarz loop'lara inifinite (sonsuz) loop denir
        Sonsuz loop genellikle "increment/decrement" kısmında yapılan hatadan kaynaklanır

               for (int i =1; i < 10; i--) {

        }

        NOTE 2: Loop oluşturduğumuzda ikinci kısmı yazmazsanız sonsuz loop oluşur

               for (int i = 0;  ; i++) {

        }


        NOTE 3: Bazı looplar hiç çalışmayabilir

               for (int i = 1; i <0 ; i--) {

        }

         */


    }//main
}//class
