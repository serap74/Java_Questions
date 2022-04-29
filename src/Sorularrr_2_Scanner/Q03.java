package Sorularrr_2_Scanner;

import java.util.Scanner;

public class Q03 {
    // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz");
        double sayi1=scan.nextDouble();

        System.out.println("İkinci sayiyi giriniz");
        double sayi2=scan.nextDouble();

        System.out.println("Toplam = " + (sayi1+sayi2));
        System.out.println("Fark = " + (sayi1-sayi2));
        System.out.println("Carpim = " + (sayi1*sayi2));
        System.out.println("Bolum = " + (sayi1/sayi2));

scan.close();

    }
}
