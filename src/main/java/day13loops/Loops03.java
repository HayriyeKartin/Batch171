package day13loops;

public class Loops03 {
    public static void main(String[] args) {
        //Örnek 1 : Verilen bir String'de küçük harfleri console'a yazmayınız
        // "Pwd12?Ab" ==> P12?A

        String s = "Pwd12?Ab";

        for (int i = 0 ; i < s.length() ; i++) {

            char ch = s.charAt(i);

            if(ch>='a' && ch<='z'){//küçük harfleri seçtim
                continue;
            }
            System.out.print(ch);

        }

        // "break" ile "continue" arasındaki fark nedir?
        // "break" switch'in dışına çıkkmak için ve loop'u kırmak için kullanılır
        // "continue" ise loop yaparken bazı elemanları işleme sokmamak için kullanılır
        // continue keywordu bir loop'taki geçerli iteration'ı sonlandırıp sizi artırma/azaltma bölümüne götürür.


    }//main
}//class
