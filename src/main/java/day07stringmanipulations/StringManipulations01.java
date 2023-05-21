package day07stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        //-------------------------- replaceAll() --------------------------

        String t = "Ali 13 yasindadir!...";
        //Örnek 7: "t" String'indeki tüm rakamları "*" çeviriniz
        //Note: Bir grup datayı ifade etmek için "Regular Expressions" Regex kullanırız
        /*
                  Meşhur Regex
           1) Tüm rakamlar --> [0-9]
           2) Tüm küçük harfler --> [a-z]
              [a-l] gibi kendimiz aralığı seçebiliriz
           3) Tüm büyük harfler --> [A-Z]
           4) Tüm küçük ve büyük harfler --> [a-zA-Z]
           5) Tüm harfler ve rakamlar --> [a-zA-Z0-9]
           6) Tüm noktalama işaretleri --> \\p{Punct}
           7) Tüm sesli harfler --> [aeiouAEIOU]
           8) Tüm x,q,w harfleri --> [xqw]
                   Olumsuzları
           9) Küçük harfler hariç tüm karakterler --> [^a-z]
           10) Tüm harfler hariç tüm karakterler --> [^a-zA-Z]

           11) Sadece space karakter --> \\s
               space karakteri hariç --> \\S
               Sadece rakamlar --> \\d (digit)
               rakamlar hariç --> \\D
         */
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...

        //Örnek 2: "t" String'indeki tüm rakamları ve harfleri "!" e çeviriniz
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);//!!! !! !!!!!!!!!!!...

        //Örnek 3: "t" String'indeki tüm sesli harfleri "?" e çeviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);//?l? 13 y?s?nd?d?r!...

        //Örnek 4: "t" String'inde küçük harfler dışındaki her şeyi "<>" olarak yazdırınız
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><><>

        //Örnek 5: "t" String'inde tüm harfler dışındaki her şeyi "+" olarak yazdırınız
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);//Ali++++yasindadir++++

        //Örnek 6: "t" Strinfg'indeki space'ler hariç tüm karakterleri "?" e çeviriniz
        String t6 = t.replaceAll("\\S", "?");
        System.out.println(t6);//??? ?? ??????????????

        String t6x = t.replaceAll("[^ ]", "?");
        System.out.println(t6x);//??? ?? ??????????????

        //Örnek 7: "t" String'indeki sesli harfler hariç tüm karakterleri "&" e çeviriniz
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);//A&i&&&&&a&i&&a&i&&&&&


    }
}
