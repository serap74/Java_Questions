package Sorularrr_3_If_Ternary;

import java.util.Scanner;

public class Q20 {

      /*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
        97:a  122:z ascii değeri
         */
      public static void main(String[] args) {


          Scanner scan = new Scanner(System.in);
          System.out.println("Bir karakter giriniz");
          char karakter = scan.next().charAt(0);

          System.out.println("*****  TERNARY çözümü  *****");

          String result = ((karakter <= 'z' && karakter >= 'a') || (karakter >= 'A' && karakter <= 'Z')) ?
                  ((karakter <= 122 && karakter >= 97) ? "Kucuk Harf" : "Buyuk Harf") : "Harf Degil";

          System.out.println("*****  if  çözümü  *****");

          if ((karakter >= 'a' && karakter <= 'z') || (karakter >= 'A' && karakter <= 'Z')) {
              if (karakter <= 122 && karakter >= 97) {
                  System.out.println("küçük harf");
              }else System.out.println("Buyuk harf");
          }else System.out.println("Harf degil");
      }
}
