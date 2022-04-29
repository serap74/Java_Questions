package Sorularrr_3_If_Ternary;

import java.util.Scanner;

public class Q15 {
    /*
		  TASK :
		  Kullanici tarafindan girilen bir sayinin
		  mutlak degerini yazdiran code create ediniz.
		 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi=scan.nextInt();

        if(sayi<0){
            sayi*=(-1);
        }
        System.out.println("Girdiginiz sayinin mutlak degeri : " + sayi);

    }
}
