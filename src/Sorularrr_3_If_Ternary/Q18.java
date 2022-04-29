package Sorularrr_3_If_Ternary;

import java.util.Scanner;

public class Q18 {
     /* TASK :
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.

        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.



                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.
         */
     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         System.out.println("Vize sınav sonucunuzu giriniz :");
         double vize=scan.nextDouble();

         System.out.println("Notunuzu hesaplamak icin vize yuzdesini giriniz");
         double vize_yuzdesi=scan.nextDouble()/100;

         System.out.println("Final sınav sonucunuzu giriniz.");
         double fin=scan.nextDouble();

         System.out.println("Notunuzu hesaplamak icin final yuzdesi giriniz");
         double fin_yuzdesi=scan.nextDouble()/100;

         System.out.println("***************************************************");

         double gecmeNotu = (vize *  vize_yuzdesi) + (fin * fin_yuzdesi);

         if(gecmeNotu>=90){
             System.out.println("Notunuz AA  supersin");
         }else if(gecmeNotu<90 && gecmeNotu>=80){
             System.out.println("Notunuz BA  gayet basarili");

         }else if(gecmeNotu<80 && gecmeNotu>=70){
             System.out.println("Notunuz BB tebrikler");

         }else if(gecmeNotu<70 && gecmeNotu>=60){
             System.out.println("Notunuz CB idare eder");

         }else if(gecmeNotu<60 && gecmeNotu>=50){
             System.out.println("Notunuz CC ehh iste");

         }else if(gecmeNotu<50 && gecmeNotu>=40){
             System.out.println("Notunuz DC kalmaya ramak kalmıs");

         }else if(gecmeNotu<40 && gecmeNotu>=30){
             System.out.println("Notunuz DD ucundan kurtardin");

         }else {
             System.out.println("Notunuz FF kaldiniz...");
         }
     }
}
