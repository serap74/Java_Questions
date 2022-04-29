package Sorularrr_3_If_Ternary;

import java.util.Scanner;

public class Q21 {

        /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif tam sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println("*****  TERNARY çözümü  *****");
        String sonuc = (sayi > 99 && sayi < 1000) ? ("3 basamaklı sayi") : (sayi % 2 == 0 ? "3 basamaklı olmayan çift sayı" : "3 basamaklı olmayan tek sayı ");

        System.out.println("*****  if  çözümü  *****");
        if(sayi<1000 && sayi>99){
            System.out.println("Sayiniz 3 basamakli");
        }else if(sayi%2==0){
            System.out.println("Sayi 3 basamakli olmayan cift sayi");
        }else System.out.println("Sayi 3 basamakli olmayan tek sayi");
    }
}
