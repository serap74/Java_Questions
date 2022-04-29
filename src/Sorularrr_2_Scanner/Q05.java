package Sorularrr_2_Scanner;

import java.util.Scanner;

public class Q05 {

     /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */


    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenini a kenar uzunlugunu giriniz");
        int a=scan.nextInt();

        System.out.println("Ucgenin b kenar uzunlugunu giriniz");
        int b=scan.nextInt();

        double h=Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenus=" + h);



    }
}
