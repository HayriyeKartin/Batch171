package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Örnek: Kullaınıcıdan ilk ismini ve son ismini alıp ikisini aynı satırda ekrana yazdırınız

        //1.Adım: Scanner class'tan bir object oluştur
        Scanner input = new Scanner(System.in);

        //2.Adım: Kullanıcıya ne istediğimize dair mesaj veriniz
        System.out.println("İlk isminizi giriniz:");

        //3.Adım: Uygun method'u kullanarak kullanıcının verdiği datayı memory'ye yerleştiriniz
        String firstName = input.next();

        System.out.println("Soy isminizi giriniz:");

        String lastName = input.next();

        System.out.println(firstName + " " + lastName);

    }
}
