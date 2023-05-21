package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {
        //Örnek 1: Bir String'in hiç karakter içermediğini (boş string olduğunu) kontrol eden kodu yazınız
        //1. Yol: length() methodu ile çözüm
        String str = "";
        boolean result1 = str.length()==0;
        System.out.println("String boş mu? = " + result1);//String boş mu? = true

        //2. Yol tavsiye edilir
        //Java eğer bir konuda method oluşturmuşsa o methodu kullanmak en iyisidir
        boolean result2 = str.isEmpty();
        System.out.println("is Empty? = " + result2);//is Empty? = true
        
        //Örnek 2: Bir Strng'in space hariç hiçbir karakter içermedğini kontrol eden kodu yazınız
        String t = "";
        //1. Yol:
        boolean result3 = t.replace(" ", "").length()==0;
        System.out.println("result3 = " + result3);

        //2. Yol:
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("result4 = " + result4);

        //3. Yol:
        boolean result5 = t.isBlank();
        System.out.println("result5 = " + result5);
        //isBlank methodu sadece space içeren String'ler için true verir, space dışında bir karakter varsa false verir
        //isBlank methodu boş String'ler için de true verir
        //isBlank methodu space + hiçbir şey için true verir
        //isEmpty methodu sadece hiçibir şey için true verir

        //Örnek 3: Bir String'de a, e, i karakterlerinin ilk görünümlerinin indexleri toplamını ekrana yazdırınız
        //"Java is easy to learn" -->
        // 0123456789.....index
        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8
        System.out.println(idxA + idxI + idxE);

        //Örnek 4: Bir String'deki "Java" kelimesinin ilk olarak kaçıncı indexte kullanıldığını gösteren kodu yazınız
        //"Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java") kullanımında siz "Java" kelimesinin ilk görünümündeki ilk harfin (yani J'nin) indexini almış olursunuz

        String u = "Ah Java vah Java sensiz olmuyor Java.";
        int idxJava = u.indexOf("Java");//Java kelimesinin u String'indeki ilk görünümünde ilk indexini "J" yi verecek
        System.out.println(idxJava);//3 //Git u sepetine bak o kelimenin ilk göründüğü yerdeki index sayısını bana ver

        //indexOf() methodu olmayan karakterler için kullanılırsa her zaman -1 return eder
        int idxjava = u.indexOf("java");
        System.out.println(idxjava);//-1 (aradığımız karakter o String sepetinde yok)

        //Örnek 5: Bir String'deki a, i e karakterlerinin son görünümlerinin index toplamını ekrana yazdırınız
        ////Note: lastIndexOf() methodu da olmayan karakterler için kullanılırsa her zaman -1 return eder
        String v = "Java is easy to learn";
        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);//18

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);//17

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);//5
        System.out.println(idxOfA + idxOfE + idxOfI);//40


    }

}
