package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive: char, boolean, byte, int, short, long, float, double
        //Wrapper Class: Character, Boolean, Byte, Integer, Short, Long, Float, Double
        
        //Wrapper Class'lar non-primitive'dir. O yüzden memory'de çok yer kaplarlar
        //Dolayısıyla şart değilse wrapper class kullanmayı tercih etmeyiz ama böyle bir imkanın varlığından haberdar olmalıyız
        

        //n yazıp nokta koyarsanız hiç method göremezsiniz çünkü primitive'ler method içermez
        int n = 12;
        
        //m yazıp nokta koyarsanız bir çok method görebilirsiniz çünkü Wrapper Class'lar method içerir
        Integer m = 12;
        
        byte p = 33;
        Byte r = 44;
        
        //Örnek: Short data type'ının minimum ve maximum değerlerini kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        //Örnek 2: int data type'ının minimum değeriyle byte data type'ının maksimum değerinin toplamını bulunuz
        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minInt + maxByte);

        //INTERVİEW
        //Örnek 3: Primitive int'i Wrapper Integer' çeviriniz. (Autoboxing)
        int num = 12;
        Integer wrapperNum = num;

        //Örnek 4: Wrapper Byte'ı primitive byte'a çeviriniz. (Unboxing)
        Byte k = 12;
        System.out.println(k);
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Örnek 5: Primitive char'ı Wrapper Character'e çeviriniz (Autoboxing)
        char inital = 'm';
        Character initalWrapper = inital;

        //Örnek 6: Wrapper Boolean'ı primitive boolean'a çeviriniz (Unboxing)
        Boolean isOldWrapper = true;
        boolean isOldPrimitive = isOldWrapper;



        

    }
}
