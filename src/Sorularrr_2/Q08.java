package Sorularrr_2;

import java.util.Scanner;

public class Q08 {

    /*
     * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
     * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int vize1;
        int vize2;
        int finalnot;

        System.out.println("Vize 1 : ");
        vize1=scan.nextInt();

        System.out.println("Vize 2 : ");
        vize2=scan.nextInt();

        System.out.println("Final : ");
        finalnot=scan.nextInt();

        double sonuc=((vize1+vize2)/2)*0.3 + (finalnot * 0.7);
        System.out.println("Ders notunuz : " + sonuc);

    }
}
