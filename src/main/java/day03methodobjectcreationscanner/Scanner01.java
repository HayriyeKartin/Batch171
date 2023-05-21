package day03methodobjectcreationscanner;
//Java nin util kutuphanesinden scanner class import edildi. (kutuphaneden bilgi aktardik)
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //1. Adim Scanner Class tan object olustur
        //input --> iceriye alinan demek
        Scanner input = new Scanner(System.in);

        //2. Adim kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lütfen yaşınızı giriniz");

        //3. Adim Uygun methodu kullanarak kullanicinin verdigi datayi memory e yerlestiriniz
        byte age = input.nextByte();

        System.out.println("age = " + age);

    }

}