package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non-primitive data type'dır ve aynı zamanda bir class'dır
        String s = "Java is easy";

        //Örnek 1: "s" String'indeki tüm karakterleri büyük harf yapınız
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA İS EASY

        //Örnek 2: "s" String'indeki tüm karakterleri küçük harf yapınız
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Örnek 3: "s" String'indeki ilk karakteri alınız
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Örnek 4: "s" String'indeki baştan ikinci ve sondan ikinci karakteri alınız ve ekrana yazdırınız
        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);
        System.out.println("" + secondChar + secondLastChar);//as

        //Örnek 5: "s" String'inde kullanılan karakter sayısını bulunuz
        int sLEngth = s.length();
        System.out.println(sLEngth);//12

        //Örnek 6: "s" String'indeki ilk 4 karakteri almak için kullanılır
        //s.substring(0, 4) --> bu kullanımda ilk index dahildir, ikinci index hariçtir
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);//Java

        //Örnek 7: "s" String'indeki "is" kelimesini alınız
        String sub2 = s.substring(5,7);
        System.out.println(sub2);//is

        //Örnek 8: "s" String'indeki "easy" kelimesini alınız
        String sub3 = s.substring(8,12);
        System.out.println(sub3);//easy

        //2. Yol
        String sub4 = s.substring(8);
        System.out.println(sub4);//easy

        //Örnek 9: "s" String'inde "money" kelimesinin var olup olmadığını kontrol ediniz
        boolean isExist = s.contains("money");
        System.out.println(isExist);//false

        //Örnek 10: "s" String'inin belli bir harfle başlayıp başlamadığını kontrol ediniz
        boolean isStart  = s.startsWith("Java");//git s kavanozuna bak, bu kavanozda bulunan String "Java" ile başlıyor mu?
        System.out.println(isStart);//true

        //Örnek 11: "s" String'inin 5. index dahil olmak üzere, bu indexten itibaren "i" karakteri ile
        //başlayıp başlamadığını kontrol ediniz
        boolean isBegin = s.startsWith("i", 5);
        System.out.println(isBegin);//true






    }
}
