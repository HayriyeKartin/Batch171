package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {//arttırmak - azaltmak
    public static void main(String[] args) {
        //Increment
        int a = 5;
        System.out.println(a);//5

        a = a + 2;
        System.out.println(a);//7

        a += 2;
        System.out.println(a);//9

        //Ornek : Bir tane integer variable olusturun ve onu iki sekilde 5 artirin.

        int b = 8;
        System.out.println(b);//8

        b = b + 5;
        System.out.println(b);//13

        b += 5;
        System.out.println(b);//18

        //Decrement
        int c = 8;
        System.out.println(c);//8

        c = c - 3;
        System.out.println(c);//5

        c -= 3;
        System.out.println(c);//2

        //Increment 2
        int d = 6;
        System.out.println(d);//6

        d = d * 2;
        System.out.println(d);//12

        d *= 2;
        System.out.println(d);//

        //Decrement 2
        int e = 24;
        System.out.println(e);//24

        e = e / 2;
        System.out.println(e);//

        e /= 2;
        System.out.println(e);//6

        //"1" ile increment'i çok kullanıyoruz, onun için java farklı bir syntax geliştirmiş. Sadece "1" le arttırmalarda kullanılır
        int f = 12;
        System.out.println(f);//12
        //f = f + 1;
        //f += 1;
        f++;
        System.out.println(f);//13

        //"1" ile decrement
        int h = 10;
        System.out.println(h);//10
        //h = h - 1;
        //h -= 1;
        h--;
        System.out.println(h);//9

        //"post-increment" ve "pre-increment" --> post = sonra, pre = önce
        int i = 10;//post-increment
        int k = i++;//java geldi önce i'yi gördü, k'nın içine i'yi atadı. sonra arttırmayı gördü 1 arttırdı onu da i'ye atadı
        System.out.println(k);//10 ==> i artirilmadan "k" ya konuldugu icin "k" nin degeri 10 olur
        System.out.println(i);//11 ==> i satir sonunda artirildigi icin 1 nin degeri 11 olur

        int m = 15;//pre-increment
        int n = ++m;//java geldi önce arttırmayı gördü 1 arttırdı n'ye atadı. Sonra geldi m'yi gördü bunu arrtıracakmışız dedi m'yi de arttırdı
        System.out.println(m);//16
        System.out.println(n);//16

        //Örnek:
        int p = 17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19

        /*
        1) Increment artırmak demektir, decrement azaltmak demektir
        2) Increment toplama ve çarpma ile, decrement çıkarma ve bölme ile yapılabilir
             a) i = i + 5;
             b) i += 5;
             c) eğer 1 ile artırma ise --> i++
             note: c şıkkı sadece 1 artırmak için kullanılır

             a) i = i - 5;
             b) i -= 5;
             c) eğer 1 ile azaltma ise --> i--
             note: c şıkkı sadece 1 azaltmak için kullanılır


         */


    }
}
