package Sorularrr_2;

import java.util.Scanner;

public class Q02 {

    /*
     * Kullanicidan uc basamakli bir sayi alin
     * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
     *
     *
     * Ornek : Inputs : 853
     * Output : Girdiginiz sayinin birler basamagi : 3
     *          Girdiginiz sayinin onlar basamagi : 5
     *          Girdiginiz sayinin yuzler basamagi : 8
     *
     *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Uc basamakli bir sayi giriniz");
        int sayi=scan.nextInt();

        int birlerBasamagi=sayi % 10;
        System.out.println("Girdiginiz sayinin birler basamagi : " + birlerBasamagi);
        sayi/=10;


        int onlarBasamagi=sayi%10;
        System.out.println("Girdiginiz sayinin onlar basamagi : " + onlarBasamagi);

        int yuzlerBasamagi=sayi/10;
        System.out.println("Girdiginiz sayinin yuzler basamagi : " + yuzlerBasamagi);

    }

}
