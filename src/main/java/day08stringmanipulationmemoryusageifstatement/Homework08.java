package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        //1) Bir String variable oluşturunuz ve bu String'deki rakam olmayan tüm karakterlerin sayısını console'a yazdırınız
        String str = "Ali sinavdan 35 aldi";
        int str2 = str.replaceAll("[0-9]", "").length();
        System.out.println("rakam olmayan karakterlerin sayısı: " + str2);//18 -->toplam karakter sayısı 20'ydi

        // 2) Bir String variable oluşturunuz ve ilk karakter ve son karakter dışındaki tüm karakterleri console'da büyük harflerle yazdırınız
        // java ---> jAVa
        String str3 = str.substring(0,1).toLowerCase()+str.substring(1,str.length()-1).toUpperCase()+str.substring(str.length()-1).toLowerCase();
        System.out.println(str3);//aLİ SİNAVDAN 35 ALDi


        //3) Bir String variable oluşturunuz ve bu String'deki ilk ve son karakterlerin ASCII değerleri toplamını console'a yazdırın
        char ch = str.charAt(0);
        char ch1 = str.charAt(19);
        System.out.println("ASCII değerler toplamı: " + ( ch + ch1));//170

        //4) Tek kelimeli bir şehir ismi için String variable oluşturun
        // ve şehir isminin ilk harfini büyük harfle diğer harflerini küçük harfle console'a yazdırın
        String city = "balıkesir";
        String city2 = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("Şehrin ilk harfi büyük: " + city2);//Balıkesir

        /* 5) Aşağıdaki kurallara göre kullanıcının girdiği password'u kontrol ediniz
             1) En az 6 karakter olsun
             2) En az bir tane büyük harf olsun
             3) En az bir tane küçük harf olsun
             4) En az bir tane rakam olsun
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen password giriniz: ");
        String sifre = input.nextLine();

        boolean first = sifre.length() > 5;
        System.out.println("first = " + first);

        boolean second = sifre.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("second = " + second);

        boolean third = sifre.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("third = " + third);

        boolean fourth = sifre.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("fourth = " + fourth);

        System.out.println("password geçerli mi? = " + (first && second && third && fourth));

    }
}
