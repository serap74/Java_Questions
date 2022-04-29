package Sorularrr_3_If_Ternary;

import java.util.Scanner;

public class Q19 {

        /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi = scan.nextInt();

        System.out.println("*****  TERNARY çözümü  *****");

        String result = (sayi >= 0) ? (sayi < 10 ? "rakam" : "pozitif sayı") : ("negatif sayı");
        System.out.println(result);

        System.out.println("*****  if  çözümü  *****");

        if (sayi >= 10) {
            if (sayi > 0 && sayi < 10) {
                System.out.println("Rakam");
            } else
                System.out.println("Pozitif sayi");

        } else System.out.println("negatif sayi");
    }}
