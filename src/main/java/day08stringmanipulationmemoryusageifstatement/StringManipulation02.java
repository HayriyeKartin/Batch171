package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Örnek 1: Bir String'in belirli bir karakterinden başlayarak belirli bir karaktere kadar dynamic olarak alınız
        //     abc@gmail.com ---> gmail
        String a = "abcdefghei@hotmail.com";

        int startingIndex = a.indexOf('@')+1;
        int endingInedx = a.indexOf('.');
        String companyNAme = a.substring(startingIndex, endingInedx);
        System.out.println("companyNAme = " + companyNAme);//companyNAme = gmail

        System.out.println("hard coding --> " + a.substring(4, 9));//yazılabilecek en kötü kod

        //Örnek 2: Verilen iki String'in birbirinin aynısı olup olmadığını kontrol eden kodu yazınız
        String h = "ali Can";
        String i = "Ali Can";
        boolean result = h.equals(i);//h eşit mi i'ye (karakterler eşit mi)
        System.out.println(result);//false

        //Javada memory kullanımı:
        /*
        Java'da iki tane memory vardır
        1) Stack Memory --> small
            a) Küçük memory'dir
            b) Primitive'leri ve Non-Primitive'lerin adreslerini tutar
        2) Heap Memory --> huge
            a) Büyük memory'dir
            b) Non-Primitive dataları içerir
        ---> Java heap memory'de yerleştirilen tüm Non-Primitive datalar için bir adres oluşturur
        ve bu adresi Stack memory'de saklar
         */
        /*
        Note: String'lerin eşitliklerini kontrol ederken "==" yerine "equals()" methodu kullanırız
        Neden kullanırız?
        Çünkü; "==" sembolü iki String'i karşılaştırırken hem adreslerine hem de değerlerine bakar,
        ikisi de aynıysa String'ler eşittir der. Ama biz code yazarken genellikle String'lerin adresleriyle
        değil değerleriyle ilgileniriz. Bu yüzden String karşılaştırmalarında "==" kullanmayız

        "equals()" methodu ise iki String'i karşılaştırırken sadece değerlerine bakar. Dağerleri aynıysa bu iki String
        eşittir der. Değerler farklı ise bu iki String farklıdır der ki bu bizim kod yazarken ihtiyaç duyduğumuz şeydir
         */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");
        System.out.println(s == t);//false çünkü adresler ve değerler farklıdır
        System.out.println(s.equals(t));//false çünkü değerler farklı
        System.out.println(s == r);//false çünkü adresler farklı
        System.out.println(s.equals(r));//true çünkü equals() sadece değerlere bakar.
                                        //"s" ve "r" nin değerleri aynı olduğundan true döndürür

        //Örnek 3: Verilen iki String'in birbirinin aynısı olup olmadığını büyük harf küçük harf dikkate almadan
        //kontrol eden kodu yazınız
        //Note: "equalsIgnoreCase()" methodu iki String'in birbirinin aynısı olup olmadığını büyük harf küçük harf dikkate almadan kontrol eder

        String j = "ali Can";
        String k = "Ali Can";
        boolean result3 = j.equalsIgnoreCase(k);
        System.out.println(result3);//true

        /*
        HOMEWORK
        1) Bir String variable oluşturunuz ve bu String'deki rakam olmayan tüm karakterlerin sayısını console'a yazdırınız
        2) Bir String variable oluşturunuz ve ilk karakter ve son karakter dışındaki tüm karakterleri console' büyük harflerle yazdırınız
        3) Bir String variable oluşturunuz ve bu String'deki ilk ve son karakterlerin ASCII değerleri toplamını console'a yazdırın
        4) Tek kelimeli bir şehir ismi için String variable oluşturun ve şehir isminin ilk harfini büyük harfle diğer harflerini küçük harfle console'a yazdırın
        5) Aşağıdaki kurallara göre kullanıcının girdiği password'u kontrol ediniz
           a) En az 6 karakter olsun
           b) En az bir tane büyük harf olsun
           c) En az bir tane küçük harf olsun
           d) En az bir tane rakam olsun
        Note 1: Önce canlı oturum sırasında çözülen örnekleri yapınız
        Nate 2: Tüm sorular dinamik kurallarla çözülmelidir
        Note 3: Birbirinizin çözümlerini inceleyerek tavsiyede bulunabilir ya da yardım isteyebilirsiniz
         */

    }
}
