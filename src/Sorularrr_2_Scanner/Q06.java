package Sorularrr_2_Scanner;

import java.util.Scanner;

public class Q06 {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz");
        double mesafe=scan.nextDouble();

        System.out.println("Ortalama hizinizi giriniz");
        double ortHiz=scan.nextDouble();

        double varisSure=mesafe/ortHiz;

        System.out.println("Varis sureniz : " + varisSure);

    }

}
