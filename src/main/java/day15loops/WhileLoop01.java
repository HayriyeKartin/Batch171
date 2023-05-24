package day15loops;

public class WhileLoop01 {
    public static void main(String[] args) {
        //kalıbını oluşturalım
        /* for loop kalıbı:
        for (başlangıç değeri ; loop çalışma kuralı ; artırma/azaltma){
            çalışacak kodlar
        }
        */
        // while loop kalıbı:
        /*
        başlangıç değeri
        while(loop çalışma kuralı){
             çalışacak kodlar
             artırma/azaltma
        }
        */

        //Örnek 1: 3'ten 6'ya kadar tamsayıları console'a yazdırın
        //1. Yol:
        for (int i = 3 ; i<7 ; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        //2. Yol:
        int i = 3;
        while (i<7){
            System.out.print(i + " ");//for loop'a göre daha çok tercih ediliyor
            i++;
        }
        System.out.println();

        //Örnek 2: 23'ten 12'ye kadar çift tam sayıları console'a yazdırınız
        int k = 23;
        while (k>11){
            if (k%2==0){//çift tam sayıları almak için
                System.out.print(k + " ");
            }
            k--;
        }

        System.out.println();
        //Örnek
        int m = 6;
        while (m<20){
            if (m%2!=0){
                System.out.print(m + " ");
            }
            m++;
        }


    }//main
}//class
