package Sorularrr_2;

import java.util.Scanner;

public class Q11 {
       /*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */
       public static void main(String[] args) {

              Scanner scan = new Scanner(System.in);

              System.out.println("TechProEd Salonu'na hoşgeldiniz!");

              System.out.println("İsminiz : ");
              String isim=scan.nextLine().toLowerCase();

              System.out.println("Soyisminiz : ");
              String soyisim=scan.nextLine().toLowerCase();

              System.out.println("Yasiniz : ");
              int yas=scan.nextInt();

              System.out.println("Boyunuz : ");
             double boy=scan.nextDouble();

              System.out.println("Kaç aylık kaydolacaksınız: ");
              int aylik=scan.nextInt();

              int aylikUcret=20;

              int toplamTutatr=aylikUcret*aylik;

              System.out.println("Toplam tutar= " + toplamTutatr + "Euro");
       }
}
