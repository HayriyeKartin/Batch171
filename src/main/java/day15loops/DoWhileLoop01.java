package day15loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        /* while
        başlangıç değeri
        while(loop çalışma kuralı){
             çalışacak kodlar
             artırma/azaltma
        }
         */
        /* do while
        başlangıç değeri

        do{
          çalışacak kodlar
          artırma/azaltma
        }while(loop çalışma kuralı);
        */

        //Örnek 1: 5'ten 3'e kadar tüm tamsayıları console'a yazdırınız

        int a = 5;
        do{
            System.out.println(a);
            a--;
        }while (a>2);

        //while-loop
        int i = 1;
        while (i<1){//condition -- durum kontrolü var
            System.out.println("Sen bir while loopsun..");
            i++;
        }
        //while loop'ta zero execution (hiç çalışmama ihtimali) mümkündür
        //önce kontrol edip sonra çalıştırıyor

        //do-while-loop
        int k = 1;
        do{
            System.out.println("Sen bir do while loopsun");
            k++;
        }while (i<1);//çıkarken kontrol yapıyor
        //do-while-loop'ta zero execution mümkün değildir
        //önce çalıştırıp sonra kontrol ediyor



    }//main
}//class
