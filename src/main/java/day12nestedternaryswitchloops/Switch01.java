package day12nestedternaryswitchloops;

public class Switch01 {
    public static void main(String[] args) {
        //Note: Java'da kodlarımızı yazarken nested yapılardan mümkün olduğunca uzak durmalıyız. Çünkü bu tarz yapılar
        //uygulamayı yavaşlatır. (Time Consuming - Zaman emici)

        //Example 1: Gün isimlerini verince kaçıncı gün olduğunu yazdıran kodu yazınız
        //           Sunday --> 1  . . .  Saturday --> 7

        String dayName = "Tuesday";

        if (dayName.equalsIgnoreCase("Sunday")){
            System.out.println(1);
        }else if (dayName.equalsIgnoreCase("Monday")){
            System.out.println(2);
        }else if (dayName.equalsIgnoreCase("Tuesday")){
            System.out.println(3);
        }else if (dayName.equalsIgnoreCase("Wednesday")){
            System.out.println(4);
        }else if (dayName.equalsIgnoreCase("Thursday")){
            System.out.println(5);
        }else if (dayName.equalsIgnoreCase("Friday")){
            System.out.println(6);
        }else if (dayName.equalsIgnoreCase("Saturday")){
            System.out.println(7);
        }else{
            System.out.println("Lütfen geçerli bir gün ismi giriniz:");
        }

        //2. Yol Switch --> değiştir demek

        switch (dayName.toLowerCase()){
            case "sunday" :
                System.out.println(1);
                break;
            case "monday" :
                System.out.println(2);
                break;
            case "tuesday" :
                System.out.println(3);
                break;//Java break'i görür görmez yazdırdığı doğru çıktıyı alıyor switch scoop'unu terk ediyor. console'da yazdırıyor
            case "wednesday" :
                System.out.println(4);
                break;
            case "thursday" :
                System.out.println(5);
                break;
            case "friday" :
                System.out.println(6);
                break;
            case "saturday" :
                System.out.println(7);
                break;
            default:
                System.out.println("Lütfen geçerli gün ismi giriniz");
        }



    }//main
}//class
