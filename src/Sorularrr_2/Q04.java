package Sorularrr_2;

import java.util.Scanner;

public class Q04 {

    /*
     *  Kullanicidanalacaginiz 5 basamakli sayinin5436
     *  ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();

        int ilkİki=sayi/1000;

        int sonİki=sayi%100;

        int ilkİkiTopla=(ilkİki%10)+(ilkİki/10);

        int sonİkiTopla=(sonİki%10)+(sonİki/10);

        System.out.println("Sayilarin toplami = " + (ilkİkiTopla + sonİkiTopla));
    }
}
