package Sorular_5_StringManipulation;

import java.util.Scanner;

public class Q03 {
    /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi ve soyadinizi giriniz");
        String str= scan.nextLine();

        System.out.println(str.charAt(0) + "." + str.charAt(str.indexOf(" ") + 1) + "." + str.charAt(str.lastIndexOf(" ") + 1) + ".");

    }
}
