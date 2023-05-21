package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s = "Learn Java earn money";
        //Örnek 1: "s" String'inin "money" ile bitip bitmediğini kontrol ediniz
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);//true

        //---------------------------- replace() -----------------------------

        //Örnek 2: "s" String'indeki "money" kelimesini "dollar" kelimesine çeviriniz
        String s1 = s.replace("money", "dollar");//Learn Java earn dollar
        System.out.println(s1);//Learn Java earn dollar

        //Örnek 3: "s" String'indeki "earn" kelimesini "win" kelimesine çeviriniz
        String s2 = s.replace("earn", "win");
        System.out.println(s2);//Lwin Java win money

        //Örnek 4: "s" String'indeki "a" harflerini "*" a çeviriniz
        String s3 = s.replace('a', '*');
        System.out.println(s3);//Le*rn J*v* e*rn money

        //Örnek 5: "s" String'indeki "n" harflerini "xxx" e çeviriniz
        String s4 = s.replace("n", "xxx");
        System.out.println(s4);//Le*rn J*v* e*rn money

        //Örnek 6: "s"  String'indeki "e" harflerini siliniz
        String s5 = s.replace("e", "");
        System.out.println(s5);//Larn Java arn mony

        //-------------------------- replaceAll() --------------------------

        String t = "Ali 13 yasindadir!...";
        //Örnek 7: "t" String'indeki tüm rakamları "*" çeviriniz
        //Note: Bir grup datayı ifade etmek için "Regular Expressions" Regex kullanırız
        /*
                  Meşhur Regex
           1) Tüm rakamlar --> [0-9]
           2) Tüm küçük harfler --> [a-z]
           3) Tüm büyük harfler --> [A-Z]
           4) Tüm küçük ve büyük harfler --> [a-zA-Z]
           5) Tüm harfler ve rakamlar --> [a-zA-Z0-9]
           6) Tüm noktalama işaretleri --> \\p{Punct}
           7) Tüm sesli harfler --> [aeiouAEIOU]
           8) Tüm x,q,w harfleri --> [xqw]
                   Olumsuzları
           9) Küçük harfler hariç tüm karakterler --> [^a-z]
           10) Tüm harfler hariç tüm karakterler --> [^a-zA-Z]
         */
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...


    }

}
