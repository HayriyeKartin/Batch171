package day15loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        //Example 1: Kullanıcının verdiği sayı için çarpım tablosunu oluşturup console'a yazdıran kodu yazınız
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Çarpım tablosunu görmek için bir sayı giriniz: ");
        int num = input.nextInt();

        int i = 1;
        while (i<11){
            System.out.println(num + " x " + i + " = " + (num*i));//kullanıcının gireceği değeri alacağız
                            //  3      x     1     =      (3*1)
            i++;
        }

        //Example 2: Verilen bir String'de her harften sonra "*" sembolünü ekleyiniz
        // Java --> J*a*v*a*
        System.out.println("Bir kelime giriniz: ");
        String word = input.next();
        String newWord = "";//sonuna yıldız eklediğimiz yeni kelimeyi içine koymak için bir sepet oluşturduk

        int k = 0;
        while (k<word.length()){
            newWord = newWord + word.charAt(k) + "*";//Başlangıç indexi 0 olan "k", increment ile her arttığında,
                                                     //charAt()'in alacağı index de artar
            k++;
        }
        System.out.println(newWord);

        //INTERVİEW SORUSU
        //Example 3: Bir String'deki tekrarsız (unique) karakterleri console'a yazdırınız
        //kertenkelle --> rtn

        //indexOf("k") --> 0 verir
        //lastIndexOf("k") --> 6 farklı ise tekrarlı

        //indexOf("r") --> 2
        //lastIndexOf("r") --> 2 aynı ise tekrarsız

        String s = "kertenkelle";
        String sonuc = "";//yeni bir şey elde edeceğimiz için yeni bir sepet oluşturduk

        int a = 0;
        while (a<s.length()){
            char ch = s.charAt(a);
            if (s.indexOf(ch) == s.lastIndexOf(ch)){
                sonuc = sonuc + ch;
            }
            a++;
        }
        System.out.println(sonuc);


    }//main
}//class
