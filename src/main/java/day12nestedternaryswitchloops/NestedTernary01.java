package day12nestedternaryswitchloops;

public class NestedTernary01 {
    public static void main(String[] args) {
         /*
          Örnek 1: Verilen yılın "Artık Yıl" (Leap Year) olup olmadığını kontrol eden kodu yazınız.
               1)Yıl 100'e bölünürse 400'e de bölünmelidir. 1600==>Leap    1800==>Leap değil
               2)Yıl 100'e bölünmüyorsa 4'e bölünmelidir. 2004==>Leap    2005==>Leap değil
         */

        int year = 1600;
         //c ? (c ? T : F)  : (c ? T : F);
         String result = year%100 == 0 ? (year%400 == 0 ? "Leap" : "Not Leap") : (year%4 == 0 ? "Leap" : "Not Leap");
         System.out.println(result);

    }//main
}//class
