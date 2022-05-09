package Sorular_5_StringManipulation;

import java.util.Scanner;

public class Q09 {
    /*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cift uzunlukta bir degisken giriniz");
        String str=scan.nextLine();

        if(str.length()%2==0){
            System.out.println(str.substring(0,3));


        }else
            System.out.println(str);
    }
}
