package day05concatinationoperatorstypecasting;

public class Concatenation {//birleştirme
    public static void main(String[] args) {
        //Örnek 1: Bir String ve iki Integer variable oluşturun.
        //String değeri ile Integer'ların toplamını console'a yazdırın
        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b);//elma1011
        System.out.println(s+ (a + b));//elma21
        System.out.println(s + a * b );//elma110
        System.out.println(a + b + s);//21elma
        System.out.println(a + s + b);//10elma11

        //Java'da "+" sembolü iki sayı arasında kullanılırsa toplama işlemi olur
        //Java'da "+" sembolü iki String arasında veya bir String ve bir sayı arasında kullanılırsa "Concatination" işlemi olur
        //Concatination --> birleştirme yapar
        //Note: Concatanitaion işlemlerinde Java matematikteki işlem önceliği kurallarını kullanır

        /*
        Matematikte işlem önceliği;
        1) önce üslü sayılar
        2) parantez içi işlemler yapılır
        3) çarpma ve bölme yapılır
        4) toplama ve çıkarma yapılır
        5) aynı öncelikli olanlarda soldan sağa başlanır
         */

        //Örnek 2: Size String olarak verilen iki fiyatın toplamını ekrana yazdırınız
        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt + shoes);//23005200


        //Integer.valueOf() String değerleri Integer'a çevirir
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //Örnek 3: Size String olarak verilen iki fiyatın toplamını ekrana yazdırınız
        String tv = "$1100";
        String radio = "$300";
        System.out.println(tv + radio);//$1100$300

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);
        //Note: valueOf() methodu tüm karakterleri rakam olan String'leri sayıya çevirir
        //Eğer valueOf() methodu kullanılırken String'in içine rakam olmayan bir karakter koyarsanız hata alırsınız
        //valueOf() methodu kullanılırken sadece rakam olan karakterler kullanılmalıdır
    }
}
