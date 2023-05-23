package day14loops;

public class Loops01 {
    public static void main(String[] args) {
        //Örnek: Bir String'i ters çeviren kodu yazınız
        //"Java" --> "avaJ"

        //1. Yol
        String t = "Java";
        String ters = "";
        for (int i = t.length()-1 ; i>=0 ; i-- ){//sondan başa doğru gideceğimiz için i--
            ters = ters + t.substring(i, i+1);//Java'da 3 index var 3, 4 dedik hepsini alması için
        }
        System.out.println(ters);//avaJ

        //2. Yol
        String u = "Java";
        String ters2 = "";
        for (int i = u.length()-1 ; i>=0 ; i-- ){
            ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters2);//avaJ

        //Örnek 2: Size verilen bir String'in "Palindrome" olup olmadığını kontrol eden kodu yazınız
        // ey edip adanada pide ye, nalan, küçük, ada
        //Logic: String'i ters çevir sonra da düz hali ile ters halini karşılaştır, aynı ise palindrom'dur

        String duz = "Ey edip adanada pide ye";
        String ters3 = "";
        for (int i = duz.length()-1 ; i>=0 ; i-- ){
            ters3 = ters3 + duz.charAt(i);
        }
        System.out.println(ters3);//loop ters çevirmeye yarıyor

        if (duz.equalsIgnoreCase(ters3)){
            System.out.println("Palindrome'dur");
        }else{
            System.out.println("Palindrome değildir");//if ile karşılaştırma yaptık
        }










    }//main
}//class
