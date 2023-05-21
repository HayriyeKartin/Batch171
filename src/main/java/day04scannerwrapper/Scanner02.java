package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Örnek: Kullanıcıdan adresini alınız ve ekrana yazdırınız
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen adresinizi giriniz:");

        //nextLine() method'u kullanıcıdan çok kelimeli String almak için kullanılır
        String address = input.nextLine();
        System.out.println(address);
    }

}
