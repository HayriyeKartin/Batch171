package day08stringmanipulationmemoryusageifstatement;

public class IfStatements {
    public static void main(String[] args) {
        //if statements
        //bazı kodları bazı şartlara göre aktive edebilmek için if statements kullanılır
        //if eğer demek --> if cümlesi

        //if you study hard, you will learn Java

        /*
           if (you study hard){              //bu olursa
            you will learn Java   ---> java  //bu olur
        }
         */

        //Örnek 1: Sayı pozitif ise ekrana pozitif yazdırın
        int num = 13;
        if(num > 0){
            System.out.println( num + " --> pozitiftir");
        }

        //Örnek 2: Sayı -1 ile 10 arasında ise ekrana rakam yazdırın
        // -1<n<10 --> n>-1 && n<10

        int n = 5;
        if(n>-1 && n<10){
            System.out.println("Rakam");
        }

    }
}
