package Sorular_5_StringManipulation;

public class B_ValueOf {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        String paraErkek = "1900";
        String paraKadin = "2000";

        //Bu ailenin toplam gelirini bulunuz.


        int maasErkek = 1900;
        int maasKadin = 2000;
        System.out.println(maasKadin+maasErkek);

        //maasErkek ve maasKadin sayilarini String'e donusturn ve concatenation yapin
        int kadinMaas=Integer.valueOf(maasKadin);
        int erkekMaas=Integer.valueOf(maasErkek);

        String girilenKelime = "65";
        int girilenSayi=65;

        // kelimenin -> sayiya cevrilmesi
        int girilenKelimeninSayiHali = Integer.parseInt(girilenKelime); // donusecek tipe uygun donusum
        short shortDeger = Short.parseShort(girilenKelime);
        double oran = Double.parseDouble(girilenKelime);


        // Soru : Short olarak atadığınız değeri stringe çevirerek,
        // ekrana yazdırınız.
        short String=Short.valueOf(shortDeger);
        System.out.println(shortDeger);



        //toString() methodu;
        short sayi=345;



        //Soru:  String olarak verilen 2 adet bagis parasının toplamini yazdiriniz.

        String bagis1="500";
        String bagis2="1500";

        int bagis1Sayi=Integer.parseInt(bagis1);
        int bagis2Sayi=Integer.parseInt(bagis2);
        int toplam=bagis1Sayi+bagis2Sayi;
        System.out.println(bagis1Sayi+bagis2Sayi);


        // Soru :String olarak verilen karenin 1 kenar uzunluğundan
        // karenin çevresinin uzunluğunu bulunuz.

        String kenar="8";
        int kenarSayi=Integer.parseInt(kenar);
        int KareCevre=kenarSayi*4;
        System.out.println(kenarSayi*4);

    }
}
