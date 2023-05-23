package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        //Örnek 1: 21'den 180'e kadar hem 2 hem de 3 ile tam bölünebilen tamsayıları ekrana yazdırın
        for (int i = 21 ; i<181 ; i++){
            if (i%2==0 && i%3==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        //Örnek 2: Size verilen küçük harfle yazılmış String'in; indexi çift sayı olan karakterlerini
        //büyük harfe dönüştüren kodu yazınız
        // ankara --> AKR
        String s = "ankara";
                   //i<s.length() --> küçüktür kullandığımızda bu şekilde, <= dersek i<=s.length()-1 bu şekilde kullanılır
                   //tavsiye edilen --> daha az kod çalışacağı için i<s.length() dir
        for ( int i = 0 ; i<s.length() ; i++ ){
            String ch = s.substring(i, i+1);
            if (i%2==0){
                System.out.print(ch.toUpperCase());
            }
        }

        System.out.println();
        //Örnek 3: Verilen bir String'de ilk a harfinden önceki tüm karakterleri concole'a yazdırınız
        // "I love Java" --> "I love J"
        String s1 = "I love Java";
        for (int i = 0 ; i<s1.length() ; i++ ){
            char ch = s1.charAt(i);
            if (ch =='a'){
                break;
            }
            System.out.print(s1.charAt(i));
        }

        System.out.println();
        //Örnek 4: Verilen bir String'de son a'dan sonraki tüm harfleri ters sırada yazdırınız
        // "Germany" --> yn
        String t = "Germany";
        for (int i = t.length()-1 ; i>=0 ; i--){
            if (t.charAt(i)=='a'){
                break;
            }
            System.out.print(t.charAt(i));
        }


    }//main
}//class
