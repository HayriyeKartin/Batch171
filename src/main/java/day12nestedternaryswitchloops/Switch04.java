package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
         /*
            Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            Kullanıcıdan bir ülke ismi alınız. Alınan ülke adına göre kısaltmaları yazdırınız.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir ülke ismi giriniz: ");

        String countryName = input.nextLine();//kullanıcıdan aldığımız data'nın orijinal halini elimizde tutmak daha mantıklıdır,
                                              //üzerinde başka işlemler yapmak istediğimizde orijinal halini korumak adına

        switch (countryName.toLowerCase()){//toLowerCase() methodunu burada kullanmak daha sağlıklı
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Bu ülke sistemde tanımlı değildir!");
        }

        /*
        1) Github da bulunan projeyi kendi lokalimize almak için;
        pc: lokal
           a) Clone lanmak istenen projenin url'i kopyalanır.
           b) Intellij den file + new + project + project from version control
           bundan sonra code'ları intellij üzerinden terminal açarak git pull denilerek kendi lokalimize çekebiliriz

        2) Kendi lokalimize almış olduğumuz projeyi github da saklamak için;
           a) github dayeni bir repo oluşturulacak, bunun için repositories'e tıklayın, sağ üst köşede yeşil new'e tıklayın
           b) Açılan sayfada bir isimlendirme yapılarak repo public mi olsun private mi olsun karar verilecek ve create'e tıklanacak
           c) Açılan yeni boş repo sayfasından url kopyalanacak
           d) Intellij den göndermek istediğimiz proje açıkken terminal kısmı açılacak
           e) git push ( --> url <--) copy + paste yaparak enter diyeceksiniz

        */

    }//main
}//class
