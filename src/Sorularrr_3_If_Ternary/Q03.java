package Sorularrr_3_If_Ternary;

import java.util.Scanner;

public class Q03 {

    /* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz");
        double boy=scan.nextDouble();

        System.out.println("Kilonuzu giriniz");
        double kilo=scan.nextDouble()/100;

        double bmi=kilo/((boy)*(boy));

        if(bmi<=20){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Oldukca Zayifsiniz");

        }else if(bmi>20 & bmi<=25){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Normalsınız");

        }else if(bmi>25 & bmi<=30){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Sismansınız");

        }else if(bmi>30){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Obezsiniz");
        }



    }
}
