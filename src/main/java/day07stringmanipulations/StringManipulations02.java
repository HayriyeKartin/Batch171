package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        /*
        Örnek:
        Aşağıdaki kurallara göre kullanıcının girdiği password'u kontrol ediniz
        1) En az 8 karakter olsun
        2) Space karakteri password'de olmasın
        3) En az bir büyük harf olsun --> Uppercase
        4) En az bir küçük harf olsun --> Lowercase
        5) En az bir rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen password'unuzu giriniz:");
        String pwd = input.nextLine();

        //1) En az 8 karakter olsun
        boolean first = pwd.length() > 7;
        System.out.println("first = " + first);

        //2) Space karakteri password'de olmasın
        boolean second = !pwd.contains(" ");
        System.out.println("second = " + second);

        //3) En az bir büyük harf olsun --> Uppercase
        //Note: büyük harf olmayanları sil
        //      kalan karakter sayısına bak
        //      karakter sayısı sıfır ise büyük harf yok demektir
        //      sıfırdan büyük ise büyük harf var demektir
        boolean third = pwd.replaceAll("[^A-Z]", "").length() > 0;//method'ları aynı satırda yan yana kullanmaya method chain denir
        System.out.println("third = " + third);

        //4) En az bir küçük harf olsun --> Lowercase
        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println("fourth = " + fourth);
        
        //5) En az bir rakam olsun
        boolean fifth = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println("fifth = " + fifth);

        System.out.println("password geçerli mi? = " + (first && second && third && fourth && fifth));


    }
}
