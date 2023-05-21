package day01variables;//içinde bulunulan package ismi

public class Variables01 {
    public static void main(String[] args) {
        //java bu satırı okumaz, kendimize veya baskalarına acıklamadır.
        /*
        java bu satırları da okumaz.
         */

        //Variable nasıl oluşturulur?
        //Data Type + Variable name + Atama Operator (Assignment Oparatoru) + Variable degeri + noktalı virgul
        int              age                           =                            13               ;

        //java cumlesi -> statement
        //Dilbilgisindeki nokta ne ise javadaki ";" aynı seydir, yani statament in bittiğini gösterir.
        //Eger variable declaration yapar Assignment yapmazsanız java kendi default degerlerini koyar
        //Default deger sayılar için sifirdir.
        //Java da "=" Assignment operator ve java bu operatoru gordugu zaman once sag tarafı calıstırır.
        //ve sagdaki degeri alir soldaki kutuya koyar
        //Javada esittir demek -> "=="  Matematikte "=", Javada "=="
        //Data type + Variable name --> Variable declaration
        //Assignment operator (=) + Variable degeri --> Assignment

        /*
        Javada temelde iki tip data vardir;
           1) Primitive data type:
                char, boolean, byte, short, int, long, float, double
           2) non-primitive data type:
                String
         */
        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        String ogrenciAdi = "Ali Can";

        //Stringlere verilen degerler daima cift tirnak icinde olmalidir
        //Stringler icin default value (--> varsayılan deger) "null" dir
        /*
        String variable olusturdugumuzda cogu zaman ona bir deger atar. Atama yapmazsak java o variable icin varsayılan
        deger olarak null koyar
        *null demek 0 demek degildir, 0 da coding de bir degerdir, null ise hiclik demektir
        *null demek icinde variable veya method bulunmayan bos bir objedir
        * {} --> eleman yok {0} --> elemani sifir
         */

        //char data type:
        //Tek karakterler icin kullanilir. Sayi, sembol ya da harf farketmez
        //Ornegin --> A, x, 4, ?
        //Ornek 2: char data type indabir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        char isminİlkHarfi = 'A';
        //Note: char data type inda degerler tek tırnak icine yazilmalidir

        //boolean data type:
        //boolean'lar sadece iki farklı deger olabilir; true (dogru) veya false (yanlis)
        //isimlendirme yapilirken basina is konulur
        //Ornek 3: boolean data type inda emekli misin sorusu icin bir variable olusturun ve false degerini atayin
        boolean isRetired = false;

        //byte data type:
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte: -128 den +127 ye (dahil) tamsayi degerleri icin kullanilir
        //Ornek 4: byte data type inda
        byte ogrenciYasi = 127;

        //short data type:
        // tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 den +32767 e (dahil) tamsayi degerleri icin kullanilir
        //Ornek 5: Site nufusu icin bir variable olusturun ve deger atayiniz
        short siteNufusu = 1300;

        //int data type:
        // tam sayilar icindir hafizada 4 byte yer kaplar
        //short: -2,147,483,648 den 2,147,483,647 e (dahil) tamsayi degerleri icin kullanilir
        //Ornek 6: Ulke nufuslari icin bir variable olusturup deger atamasi yapınız
        int ulkeNufusu = 60000000;

        //long data type:
        // tam sayilar icindir hafizada 8 byte yer kaplar
        //short: -9,223,372,036,854,775,808 den -9,223,372,036,854,775,807 e (dahil) tamsayi degerleri icin kullanilir
        //Ornek 7: İnsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz
        long cellNumberInHumanBody = 87874541214578774L;
        //Note: Bir deger long ise sonuna "L" (tavsiye edilir) ya da "l" konulur

        //Eger long'a atadiginiz deger int'lerin araligindaysa sonuna "L" koymaya gerek yok
        //long dememize ragmen sonuna "L" koymazsak eger int araligindaysa java onu int kabul eder
        long weightOfSun = 12345645;

        //float data type:
        //virgullu sayilar (Decimal Numbers --> ondalikli sayilar) icin kullanilir. (fiyatlandirmalar -> 12.99)
        //Ornek 8: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturunuz.
        float shirtPrice = 128.99F;
        float shoesPrice = 485.99F;
        //Note: Java ondalikli sayilari otomatik olarak double kabul eder
        //float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz
        //4 byte yer kaplar

        //double data type:
        //double memory de 8 byte yer kaplar, ondalikli kisim icin daha fazla rakam alir
        //ondalikli sayilar icin kullanilir
        //Ornek 9: Hucre agirligi ve Amip'in agirligi icin bir variable olusturunuz
        double weightCell = 0.0000000000000000000000113;
        double weightAmip = 0.00000000000000000000000015;

        //Ornek 10: Ogrenci notlari icin iki adet variable olusturunuz ve toplamlarini ekrana yazdırınız
        //---------------- ekrana yazdırmak icin------------------
        System.out.println(5);//ekrana yazdirmak icindir
        System.out.println(15);//ekrana yazdirir ve pointer i ayni satirda tutar
        //--------------------------------------------------------

        byte note1 = 55;
        byte note2 = 33;
        System.out.println(note1+note2);

        //homework
        /*
        1) 3 farkli data turunde variable olusturun ve bunlari farkli satirlarda yazdirin
        2) ulke ve sehir isimleri icin iki variable olusturun ve bunları yazdirin
        3) iki tamsayi turunde variable olusturup toplamini yazdirin
         */




    }//main
}//class
