package Sorularrr_3;

import java.util.Scanner;

public class Q12 {
      /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */
      public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);
          System.out.println("Vize notunuz : ");
          int vize=scan.nextInt();

          System.out.println("Final notunuz");
          int fin=scan.nextInt();

          System.out.println("Vize yuzdesi kactir");
          double vizeYuzdesi=scan.nextDouble();

          System.out.println("Final yuzdesi kactir");
          double FinYuzdesi=scan.nextDouble();

          double notOrtalama=(double) (vize * vizeYuzdesi / 100) + (double) (fin * FinYuzdesi / 100);

          System.out.println("Ortalamanız hesaplanıyor..................");
          System.out.println("Not ortalamanız: " + notOrtalama);


          if(notOrtalama>=50){
              System.out.println("Tebrikler dersi başarı ile geçtiniz...");
          }else {
              System.out.println("Maalesef dersten kaldiniz");
          }

      }
}
