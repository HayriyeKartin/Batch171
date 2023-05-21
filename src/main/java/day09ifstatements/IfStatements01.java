package day09ifstatements;

public class IfStatements01 {
    public static void main(String[] args) {
        //Örnek 1: Sayı üç basamaklı ise ekrana "Sayı üç basamaklıdır!" yazdırın
        int number = -123;
        int num = Math.abs(number);//sayının mutlak değerini alır. Sayı negatif de olsa pozitif döndürür


        if(number > 99 && number < 1000){
            System.out.println("Sayı üç basamaklıdır!");
        }

        //Örnek 2: Bir String'deki tekrarsız karakterleri ekrana yazdırınız
        // abbccdc --> ad
        String str = "aac";
        char ch1 = str.charAt(0);
        if(str.indexOf(ch1) == str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }
        char ch2 = str.charAt(1);
        if(str.indexOf(ch2) == str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }
        char ch3 = str.charAt(2);
        if(str.indexOf(ch3) == str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

    }
}
