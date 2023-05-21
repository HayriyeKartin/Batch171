package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Örnek: Kullanıcının vermiş olduğu karakter büyük harf ise ekrana "Büyük Harf"
        //küçük harf ise ekrana "Küçük Harf" yazdıran kodu oluşturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz: ");
        char ch = input.next().charAt(0);

        //1.Yol:
      /*  if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Büyük Harf");
        }
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Küçük Harf");
        }
      */

        //2.Yol:
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Büyük harf");
        }else if (ch >= 'a' && ch <= 'z'){
            System.out.println("Küçük harf");
        }else{
            System.out.println("Harf değil!");
        }

    }
}
