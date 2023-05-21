package day04scannerwrapper;

import java.util.Scanner;

public class Homework04 {
    /*
        HOMEWORK
        1) Kullanıcıdan aldığınız 3 tane sayının ortalamasını bulan kodu yazınız
        // örneğin --> 3,5,7 için ort (3+5+7)/3
        2) Kullanıcıdan aldığınız 3 basamaklı bir sayının rakamları tplamını bulunuz
        //örneğin --> 321 için 3+1+2
         */
    public static void main(String[] args) {
        // 1) Kullanıcıdan aldığınız 3 tane sayının ortalamasını bulan kodu yazınız
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üç tane sayı giriniz:");//3,5,7

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();

        System.out.println((firstNumber + secondNumber + thirdNumber) / 3);

        //2) Kullanıcıdan aldığınız 3 basamaklı bir sayının rakamları tplamını bulunuz
        System.out.println("Lütfen üç basamaklı bir sayı giriniz");//321
        int number = input.nextInt();

       int onesDigit = number%10;
       number = number/10;

       int tensDigit = number%10;
       number = number/10;

       int hundredsDigit = number%10;

        System.out.println(onesDigit + tensDigit + hundredsDigit);

    }
}
