package Sorularrr_3;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Aldiginiz urun adedini giriniz");
        int urunAdet=scan.nextInt();

        System.out.println("Aldiginiz urunun liste fiyatini giriniz");
        double Fiyat=scan.nextDouble();
        double toplamFiyat;

        System.out.println("Musteri kartiniz var mi? Varsa Y yoksa N tusuna basiniz");
        char card=scan.next().toLowerCase().charAt(0);
        if(card=='y'){
            if(urunAdet>10){
                Fiyat*=0.8;
                toplamFiyat=Fiyat*urunAdet;
                System.out.println("%20 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                                + toplamFiyat);

            }else {
            Fiyat*=0.85;
            toplamFiyat=Fiyat*urunAdet;
                System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                        + toplamFiyat);

        }
    }else if (card=='n'){
            if(urunAdet>10){
                Fiyat*=0.85;
                toplamFiyat=Fiyat*urunAdet;
                 System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + toplamFiyat);
            }else {
                Fiyat=Fiyat-Fiyat*10/100;
                toplamFiyat=Fiyat+urunAdet;
                System.out.println("%10 indirim hakki kazandiniz. toplam odemeniz gereken miktar : " + toplamFiyat);

            }
        }else {
            System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyin");
        }
    }
}
