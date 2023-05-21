package day02datatypesmethodcreation;

public class Homework02 {
    /*
    HOMEWORK
    1) Dikdörtgenin alanini hesaplayan methodu olusturun ve kullaniniz
    2) Dikdörtgenin cevresini hesaplayan methodu olusturun ve kullaniniz
     */
    public static void main(String[] args) {
       int sonuc = area (12,15);
        System.out.println(sonuc);

       int sonuc2 = perimeter(12,15);
        System.out.println(sonuc2);

    }
    public static int area (int a, int b){//a -> kısa kenar, b -> uzun kenar
        return a*b;
    }
    public static int perimeter (int a, int b){
        return (a+b)*2;
    }
}
