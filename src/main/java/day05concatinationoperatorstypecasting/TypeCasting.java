package day05concatinationoperatorstypecasting;

public class TypeCasting {//Tip Dönüştürme
    /*
    Numeric Primitive Data Type'larının birbirine dönüştürülmesine "Type Casting" denir.
    Numeric data type'lar; byte, short, int, long, float, double
    byte oluşturacağız int gibi davranacak, int oluşturacağız long gibi davranacak
     */
    //Note 1: Küçük data type'larını büyük data type'larına çevirmeyi Java otomatik olarak yapar
    //Bu işleme "AutoWidening" (otomatik genişletme) denir

    //Note 2: Büyük data type'larını küçük data type'larına çevirmek riskli bir iştir, Java bu riskli işi otomatik olarak yapmaz bu işlemi kod yazanlardan bekler
    //Bu işleme "ExplicitNarrowing" (Açıktan Daraltma) denir


    public static void main(String[] args) {
        //byte data type'ını int data type'ına çeviriniz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //int data type'ını short data type'ına çeviriniz
        int weight = 312;
        short weightShort = (short)weight;//Explicit Narrowing

        //int data type'ını float data type'ına çeviriniz
        int population = 7000;
        System.out.println(population);//7000

        float populationFloat = population;
        System.out.println(populationFloat);//7000.0

        //double data type'ını short data type'ına çeviriniz
        double number = 12.99;
        System.out.println(number);//12.99

        short numberShort = (short)number;
        System.out.println(numberShort);//12

        short num = 260;
        System.out.println(num);

        byte numByte = (byte)num;
        System.out.println(numByte);

        //NOTE: Dönüşüm yaptığımız sayı(260) dönüşeceği data type'ının sınırları dışında ise
        //Java kullandığınız sayı ile mod işlemi yapar ve mod işleminin sonucu sizin yeni değeriniz olur

    }
}
