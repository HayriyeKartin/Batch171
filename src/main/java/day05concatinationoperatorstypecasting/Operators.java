package day05concatinationoperatorstypecasting;

public class Operators {
    /*
    1) +, -, *, / işlemleri Java'da matematikte kullanıldığı gibi kullanılır
    Note 1: int / int --> int olur (tamsayıyı tamsayıya bölersek tamsayı buluruz)
    Note 2: double + int --> double olur
    Çünkü; Java'da matematiksel işlemlerde farklı data type'ları kullanılırsa sonuç her zaman büyük data type'ında olur

    2) Java'da "Logical Operator"ler vardır. AND ve OR isimleri Logical oeratörlerdir
        i) AND (&&) işleminde true alabilmek için her şey true olmalıdır
           AND işlemi mükemmeliyetçidir (perfectionist)
           AND işleminde bir tane false sonucu false yapar

        ii) OR (||) işleminde bir tane true sonucu true yapmaya yeter
            OR işleminde sonucun false olması için her şey false olmalıdır
            OR işlemi "polyanna" gibidir

        iii) NOT Operator (!) true olanı false, false olanı true yapar
             !true --> false
             !false --> true
             !!true --> true

     3) Comparison (Karşılaştırma) Operators
        <, >, <=, >=, ==, !=
        Note: Karşılaştırma operatörlerini kullandığnızda kesinlikle boolean (true veya false) alırsınız

        NOTE: Bizler coding'te AND işlemi yapacağımız zaman "&&" kullanırız ama "&" kullanımı da geçerlidir
              Farkları nedir?
              "&&" kullanımında ilk ifade false ise diğerlerini kontrol etmez dolayısıyla hızlı çalışır
              çünkü AND işleminde ilk ifade false ise diğerlerinin ne olduğunun bir önemi yoktur
              "&" kullanımında ilk ifade ne olursa olsun diğerlerini kontrol eder ve dolayısıyla yavaş çalışır
              bu yüzden biz hep "&&" kullanırız


     */
    public static void main(String[] args) {
        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5 >= 19;

        System.out.println(first + " - " + second + " - " + third);// true - false - false

        System.out.println(first && second);//false
        System.out.println(first || second || third);//true
    }
}
