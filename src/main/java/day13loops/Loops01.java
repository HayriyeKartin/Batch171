package day13loops;

public class Loops01 {
    public static void main(String[] args) {
        //Örnek 1: Ekrana 5 kere "Hi" yazdırın
        //1. Yol
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        /*
        Code standarts
        1) Tekrar (repetition) olmamalıdır
        2) Dynamic olmalıdır
        3) Tamir (fix) ve update kolay yapılabilmelidir
        */

        //2. Yol
        //Aynı adımlar tekrar tekrar yapılması gerektiğinde "Loop"lar kullanılır
        //Dört tane loop vardır; a) for-loop b) while-loop c) do-while-loop d) for-each-loop

        // a) for-loop
        /*
        for ( Başlangıç değeri ; Loop çalışma şartı ; Arttırma/eksiltme ){
            çalışacak kodlar
        }
        */
        // i++ --> i = i +1 --> i += 1 --> i'nin değerini 1 arttır demek
        //Başlangıç değeri ; Loop çalışma şartı ; Arttırma/eksiltme
        for ( int i = 1    ;        i<6         ;        i++        ){
            System.out.println("Hi..!");//yazdırmak istediğimiz değeri buraya yazıyoruz
        }

        //Örnek 2: 11'den 14'e kadar tüm sayıları ekrana yazdıran kodu yazınız
        for(int i = 11 ; i<15 ; i++ ){
            System.out.print(i+" ");
        }

        System.out.println();
        //Örnek 3: 40'dan 23'e kadar tüm çift sayıları ekrana yazdırınız
        for ( int i = 40 ; i>22 ; i-- ){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        //Örnek 4: 18'den 56'ya kadar tüm tek sayıları ekrana yazdıran kodu yazınız
        for ( int i = 18 ; i<57 ; i++ ){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }

    }//main
}//class
