package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Örnek: Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alınız
        //a) Alanını hesaplayınız --> Kısa kenar * Uzun kenar
        //b) Çevresini hesaplayınız --> 2 * Kısa kenar + 2 * Uzun kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgen için kısa kenar uzunluğu giriniz:");
        double shortSide = input.nextDouble();

        System.out.println("Dikdörtgen için uzun kenar uzunluğu giriniz");
        double longSide = input.nextDouble();


        System.out.println("Alan = " + (shortSide * longSide));
        System.out.println("Çevre = " + (2*shortSide + 2*longSide));

    }
}
