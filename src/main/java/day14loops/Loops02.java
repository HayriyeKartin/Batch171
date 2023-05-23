package day14loops;

public class Loops02 {
    public static void main(String[] args) {
        //Örnek 1: 5'ten 8'e kadar olan tamsayıların toplamını veren kodu yazınız
        // 5+6+7+8 --> 26

        int sum = 0;//toplama işleminin etkisiz elemanı sıfır olduğu için 0; kullandık.
        // Sepetimizin boş olmasını istiyoruz 5'ten başlayarak doldurmak için!
        // Sepetimizin içinde ne olursa işleme o değer ile başlarız

        for (int i = 5  ; i<9 ; i++ ){
           sum = sum + i;//sum sepetimize her seferinde tek bir sayı ekleyerek, 5'ten 8'e kadar tek tek gidiyoruz
        }                //sum = sum + i; yapmamızın sebebi; bir sepeti doldurmak için sepetin de elimizde olması gerekir
        System.out.println(sum);//26

        //Örnek 2: 7'den 9'a kadar olan tamsayıların çarpımını veren kodu yazınız

        int multiPly = 1;//çarpma işleminin etkisiz elemanı 1 olduğu için 1; kullandık

        for (int i = 7; i<10 ; i++ ){
            multiPly = multiPly * i;
        }
        System.out.println(multiPly);//504

        //Örnek 3: Verilen bir tamsayının rakamlarının toplamını veren kodu yazınız
        // 578 --> 5+7+8 --> 20

        int toplam = 0;
        int num = -578;
        num = Math.abs(num);


        for (int i = num ; i>0 ; i=i/10 ){//her bir sayıyı modulus ile alacağımız için i=i/10 yaptık
            toplam = toplam + i%10;//modulus kalanını bulmak için rakam olarak
        }
        System.out.println(toplam);//20

    }//main
}//class
