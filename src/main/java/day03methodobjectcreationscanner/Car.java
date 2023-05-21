package day03methodobjectcreationscanner;

public class Car {

    //Variable'lar olusturalim --> kalip --> pasif ozellikler
    public String model = "Tesla";
    public int fiyat = 20000;

    //Method'lari olusturalim --> aktif ozellikleri
    //Note: "return type" void oldugunda method icinde "return" keywordu kullanilmaz
    public void hareket(){
        System.out.println("Tesla çok hızlı hareket eder..");
    }

    public void dur(){
        System.out.println("Çok güvenli bir şekilde durur..");
    }
    //kalip urettigimiz icin main method olusturmadik. main methodlar arabanin motorudur

}
