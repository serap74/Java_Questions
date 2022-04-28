package Sorularrr_3;

import java.util.Scanner;

public class Q13 {

    /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     int a;
     int b;
     int c;

        System.out.println("Birinci ayiyi giriniz");
        a=scan.nextInt();

        System.out.println("İkinci sayiyi giriniz");
        b=scan.nextInt();

        System.out.println("Ucuncu sayiyi giriniz");
        c=scan.nextInt();

        if ((a * a) + (b * b) == c * c) {
            System.out.println("Bu bir dik üçgendir.");
        } else if ((a * a) + (c * c) == b * b) {
            System.out.println("Bu bir dik üçgendir.");
        } else if ((b * b) + (c * c) == a * a) {
            System.out.println("Bu bir dik üçgendir.");
        } else {
            System.out.println("Bu üçgen bir dik üçgen değildir.");
        }
    }
}
