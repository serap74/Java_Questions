package Sorularrr_3;

import java.util.Scanner;

public class Q01 {

    /* TASK :
     * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
     *  dort islemden biri ile isleme koyup sonucun yazdiriniz
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("toplama icin 1\n cıkarma icin 2\n bolme icin 3\n carpma ici 4");

        int islem=scan.nextInt();
        System.out.println("iki sayi giriniz");

        double num1=scan.nextDouble();
        double num2=scan.nextDouble();

        if(islem==1){
            System.out.println("toplama islemini sonucu : " + num1 + " + " + num2 + " + " + (num1+num2));
        }else if (islem==2){
            System.out.println("cıkarma islemini sonucu : " + num1 + " - " + num2 + " + " + (num1-num2));

        }else  if(islem==3){
            System.out.println("bolme islemini sonucu : " + num1 + " / " + num2 + " + " + (num1/num2));
        }else if(islem==1){
            System.out.println("carpma islemini sonucu : " + num1 + " * " + num2 + " + " + (num1*num2));


        }else System.out.println("Hatali secim yaptiniz");













    }
}
