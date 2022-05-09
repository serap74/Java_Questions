package Sorular_5_StringManipulation;

import java.util.Scanner;

public class Q02 {
     /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Adinizi ve soyadinizi giriniz");
         String adSoyad=scan.nextLine();

         String ad=adSoyad.substring(0,adSoyad.indexOf(" "));
         String soyad=adSoyad.substring(adSoyad.indexOf(" ")+1);

         System.out.println("ad = " + ad);
         System.out.println("Soyad = " + soyad);




     }
}
