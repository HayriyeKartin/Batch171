package day03methodobjectcreationscanner;

public class Runner {
    //run calistirmak demek, runner calistirici
    //main methodlar calistiricinin icinde

    public static void main(String[] args) {
        //object nasil olusturulur

        //new keywordu sifirdan yeni bir obje olusturmak icin kullanilir --> Java gorur gormez yeni bir obje olusturur
        //Constructor Java'da objeleri olusturmak icin olusturulan ozel bir methodtur --> yapici, olusturucu method
        //Class ismi + Object ismi + Assignment Operator + "new" keywordu + Constructor
             Car          myCar              =                 new            Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student aliCan = new Student();
        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.study();
        aliCan.feed();

        //Homework
        //İcinde isim ve yas variable lari ile teach methodu bulunan bir Teacher objecti olusturun ve obje uzerinde bu ozellikleri kullanin

    }


}
