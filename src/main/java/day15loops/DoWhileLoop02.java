package day15loops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
         /*
            Kullanıcıdan bir tamsayı alınız
            Tamsayı 100'den küçük ise kullanıcıya "Kaybettiniz!" mesajı vererek oyunu sonlandırınız
            Tamsayı 100 ve 100'den büyük ise "Kazandınız!" mesajı vererek oyuna devam ettiriniz
         */
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Bir sayı giriniz: ");//kullanıcı 100'den büyük sayı verdiği sürece condition dönmeye devam edecek
                                                     //o yüzden loop'un içine koyduk, her dönüşte aynı soruyu sorması için
                                                     //loop'un dışına koysaydık sadece ilk seferde soracaktı
            int num = input.nextInt();

            if (num>=100){
                System.out.println("Kazandınız :) ");
            }else{
                System.out.println("Kaybettiniz :( ");
                break;//100'den küçük sayı girdiğinde loop'u kırmak için
            }
        }while (true);//condition'a "true" yazarsak sonsuz döngü yapmış oluruz
                      //kullanıcı 100'den küçük bir sayı girene kadar döngü devam edecek






    }//main
}//class
