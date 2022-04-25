package Sorularrr_2;

import java.util.Scanner;

public class Q07 {

    /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		                   Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Boyunuzu girin");
        double boy=scan.nextDouble();

        System.out.println("kilonuzu girin");
        double kilo=scan.nextDouble();

        double VKİ=kilo/(boy*boy);

        System.out.println("Vucut kitle indeksiniz : " + VKİ );

        scan.close();

    }

}
