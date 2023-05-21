package day05concatinationoperatorstypecasting;

public class AsciiValues {
    public static void main(String[] args) {
        /*
        Java'da her karakterin sayısal (numeric) bir değeri vardır
        Bu değerler ASCII değerler olarak adlandırılır
        Bu değerlerin tamamının bulunduğu tabloya ASCII TABLE denir
         */
        char a = 'a';
        System.out.println(a);//a

        //Herhangi bir karakterin ASCII değerini bulmak için o karakteri "int" data type'ında bir variable içine koyarız
        int intA = 'a';
        System.out.println(intA);//97

        byte unlem = '!';
        System.out.println(unlem);//33

        char c1 = 'K';
        char c2 = '?';
        System.out.println(c1 + c2);//138
        //Java'da eğer char'ları matematiksel işlemde kullanırsanız, Java char'ların ASCII değerlerini kullanır




    }
}
