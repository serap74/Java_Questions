package Sorularrr_3_If_Ternary;

import java.util.Scanner;

public class Q07 {
    /* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		   hatali giris seklinde code create ediniz
		 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char karakter= scanner.next().charAt(0);

        if(karakter>='a' && karakter<='z'){
            System.out.println("Kucuk harf");

        }else if(karakter>='A' && karakter<='Z'){
            System.out.println("Buyuk harf");
        }else System.out.println("Hatali giris  yaptiniz");








    }
}
