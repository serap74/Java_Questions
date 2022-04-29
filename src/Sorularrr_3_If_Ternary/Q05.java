package Sorularrr_3_If_Ternary;

import java.util.Scanner;

public class Q05 {
    /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("Kilonuzu giriniz");
        int kilo=scan.nextInt();

        if(yas>0 && yas<18){
            System.out.println("Yasi 18 den kucuk olanlar kan bagisi yapamaz");
        }else if(yas>=18){
            if(kilo>0 && kilo<50){
                System.out.println("Yasiniz kan bagisi icin uygun fakat kilonuz yetersiz");
            }else if (kilo>=50){
                System.out.println("Sartlariniz uygun, kan bagisi yapabilirsiniz");

            }else System.out.println("Kilonuzu hatali girdiniz");

        }else System.out.println("Hatali veri girdiniz");
    }


}
