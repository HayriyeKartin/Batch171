package day10ifstatements;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        //HOMEWORK

        //1) Kullanıcıdan alınan password 'pwd123!' olduğunda, verilen password'un doğru olup olmadığını kontrol eden
        //ve kullanıcıya uygun mesaj veren kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen password giriniz: ");
        String pwd = input.next();

        if(pwd.equals("pwd123!")){
            System.out.println("Password geçerlidir.");
        }else{
            System.out.println("Password geçersizdir!");
        }

        //2) Haftanın gün ismini verdiğinizde kaçıncı gün olduğunu yazan kodu yazınız
        //   Pazar --> 1.gün , Pazartesi  --> 2.gün  .....

        System.out.println("Lütfen bir gün ismi giriniz:");
        String dayName = input.next();

        if(dayName.equalsIgnoreCase("Pazar")){
            System.out.println("1. gün");
        }else if(dayName.equalsIgnoreCase("Pazartesi")){
            System.out.println("2. gün");
        }else if(dayName.equalsIgnoreCase("Salı")){
            System.out.println("3. gün");
        }else if(dayName.equalsIgnoreCase("Çarşamba")){
            System.out.println("4. gün");
        }else if(dayName.equalsIgnoreCase("Perşembe")){
            System.out.println("5. gün");
        }else if(dayName.equalsIgnoreCase("Cuma")){
            System.out.println("6. gün");
        }else if(dayName.equalsIgnoreCase("Cumartesi")){
            System.out.println("7. gün");
        }else{
            System.out.println("Lütfen geçerli bir gün ismi giriniz!");
        }

        //3) Ay sayısını verdiğinizde ay ismini yazan kodu yazınız
        //   1 --> January, 2 --> February .....

        System.out.println("Lütfen kaçıncı ayda olduğunuzu giriniz:");
        byte monthNum = input.nextByte();

        if(monthNum==1){
            System.out.println("January");
        }else if(monthNum==2){
            System.out.println("February");
        }else if(monthNum==3){
            System.out.println("March");
        }else if(monthNum==4){
            System.out.println("April");
        }else if(monthNum==5){
            System.out.println("May");
        }else if(monthNum==6){
            System.out.println("June");
        }else if(monthNum==7){
            System.out.println("July");
        }else if(monthNum==8){
            System.out.println("August");
        }else if(monthNum==9){
            System.out.println("September");
        }else if(monthNum==10){
            System.out.println("October");
        }else if(monthNum==11){
            System.out.println("November");
        }else if(monthNum==12){
            System.out.println("December");
        }else{
            System.out.println("Lütfen 1 ile 12 arasında bir sayı giriniz");
        }

    }
}
