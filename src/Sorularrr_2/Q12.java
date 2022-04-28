package Sorularrr_2;

import java.util.Scanner;

public class Q12 {
     /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?

        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir işçi işi kaç günde bitirmektedir.");
        int bir_iscinin_bitirme_suresi=scan.nextInt();

        System.out.println("toplam kac kişi caliscaak");
        int isci_sayisi=scan.nextInt();

        int coklu_bitirme_suresi=bir_iscinin_bitirme_suresi/isci_sayisi;
        System.out.println("isin bitme suresi : " + coklu_bitirme_suresi);


    }

}
