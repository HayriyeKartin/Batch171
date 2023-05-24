package day15loops;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
         /*
        Geçerli Username = "admin" ve Password = "pwd123" dır.
        Kullanıcıdan username ve password'u alın.
        Username ve password doğru ise console'a "Hesabınıza hoş geldiniz!" yazdırın.
        Username veya password yanlış ise 4 kere "Username ve password'unuzu giriniz" mesajı versin
        Username veya password 4. kere yanlış girilirse "Hesabınız bloke olmuştur" mesajı vererek işlemi tamamlayınız
         */

        Scanner input = new Scanner(System.in);
        int counter = 0;

        do {
            if (counter == 4){
                System.out.println("Hesabınız bloke olmuştur!!");
                break;
            }
            System.out.println("Username giriniz: ");
            String userName = input.next();

            System.out.println("Password giriniz: ");
            String password = input.next();

            if (userName.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabınıza hoş geldiniz");
                break;//doğru girdiyse loop'u kıracağız
            }
            counter++;

        }while (true);//counter<4 de diyebilirdik, if ile condition oluşturmak yerine










    }//main
}//class
