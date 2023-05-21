package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {
        //Örnek 1:
        int a = 10;
        int b = 20;

       /* int r1 = a<b ? a++ : ++b;
        System.out.println(r1);//10
        System.out.println(a);//11
        System.out.println(b);//20
       */

        int r2 = b<a ? a++ : ++b;
        System.out.println(r2);//21
        System.out.println(a);//20
        System.out.println(b);//21

        //Örnek 2: Verilen bir sayının mutlak değerini hesaplayan kodu yazınız
        // -4 --> -1 * -4   4 --> 4    0 --> 0
        int c = -4;
        int r3 = c<0 ? -1*c : c;
        System.out.println(r3);

        //Örnek 3: İki sayının işareti aynı ise bu sayıları çarpan, işaretleri farklı ise
        // "farklı işaretli sayıları çarpamıyorum" mesajı veren kodu yazınız

     /*   int m = 5;
        int n = -6;

        Object r4 = (m>0 && n>0) || (m<0 && n<0) ? m*n : "farklı işaretli sayıları çarpamıyorum";
        System.out.println(r4);//farklı işaretli sayıları çarpamıyorum
     */

        int m = 5;
        int n = 6;

        Object r4 = (m>0 && n>0) || (m<0 && n<0) ? m*n : "farklı işaretli sayıları çarpamıyorum";
        System.out.println(r4);//30

        //"Object" Java'da bütün "Non-Primitive Data Type" (Class)'larının ortak "Parent"(anne-baba)'ıdır.
        //"Object" in parenti yoktur.
        //Farlı data type'lar için ortak bir variable oluşturmak istediğinizde, data type olarak "Object" kullanabiliriz
        //Java'da "Object", insanlık alemindeki Hz. Adem'e benzer

        //Örnek 4: Size verilen sayının 3 basamaklı olup olmadığını kontrol eden kodu giriniz
        int p = 313;
        String r5 = p>99 && p<1000 ? p+ " üç basamaklıdır" : p+ " üç basamaklı değildir";
        System.out.println(r5);//313 üç basamaklıdır

        int s = 15;
        String r6 = s>99 && s<1000 ? s+ " üç basamaklıdır" : s+ " üç basamaklı değildir";
        System.out.println(r6);//15 üç basamaklı değildir

        int t = -313;
        t = Math.abs(t);
        String r7 = t>99 && t<1000 ? t+ " üç basamaklıdır" : t+ " üç basamaklı değildir";
        System.out.println(r7);//313 üç basamaklıdır

    }
}
