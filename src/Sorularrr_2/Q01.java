package Sorularrr_2;

import java.util.Scanner;

public class Q01 {

    /*
     * kullanicinin ad soyad yas boy kilosunu  yazdiriniz
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String ad=scan.nextLine();

        System.out.println("Soyadinizi giriniz");
        String soyAd=scan.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("Boyunuzu giriniz");
        Double boy=scan.nextDouble();

        System.out.println("Kilonuzu giriniz");
        Double kilo=scan.nextDouble();

        System.out.println("Benim adim : " + ad+"\n"+"soyadim : "+soyAd+"\n"+"yasim : " +yas+"\n"+"boyum" +boy+"\n" +"kilom :" + +kilo);
    }
}
