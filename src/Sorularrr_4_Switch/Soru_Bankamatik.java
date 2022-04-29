package Sorularrr_4_Switch;

import java.util.Scanner;

public class Soru_Bankamatik {
    public static void main(String[] args) {
          /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("     *************     ");
        System.out.println("      ATM'YE HOS GELDİNİZ"      );
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatırma : 3\ncıkıs : 4\nyapacagınız işlemi seciniz : ");
        int islem=scan.nextInt();
        int bakiye=1000;
        switch(islem){
            case 1:
                System.out.println("Mevcut bakiyeniz : " + bakiye);
                break;
            case 2:
                System.out.println("Cekeceginiz miktari giriniz : ");
                int cekilenMiktar=scan.nextInt();
                if(cekilenMiktar>bakiye){
                    System.out.println("Bakiyenizde bu kadar para yok");
                }else {
                    bakiye-=cekilenMiktar;
                    System.out.println("Bakiyenizin guncel hali : " + bakiye);
                }
                break;
            case 3:
                System.out.println("Yatiracaginiz miktari girin");
                int yatirilanMiktar=scan.nextInt();
                bakiye+=yatirilanMiktar;
                System.out.println("Bakiyenizin guncel hali : " + bakiye);
                break;
            case 4:
                System.out.println("Cikisiniz yapilmistir, yine bekleriz ...");
                break;
        }














    }

}
