package Sorularrr_4_Switch;

import java.util.Scanner;

public class Soru_SeyahatProjesi {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("*****SEYAHAT SİRKETİMİZE HOSGELDİNİZ*****");
            System.out.println("Frankfurt 80 km\nKoln 60 km\n20 km basina 5 euro ucretlendirme yapilir");
            System.out.println("Yolculuk yapacaginiz sehri secin");
            String  hedef=scan.next().toUpperCase();
            double bakıye = 100;
            double frUcret = (60 / 20) * 5;
            double klUcret = (80 / 20) * 5;

            switch(hedef){
                default:
                    System.out.println("Hatali giris yaptiniz");
                    break;

                case "FRANKFURT":
                    System.out.println("Rota : Frankfurt");
                    System.out.println("Frankfurt " + frUcret + "Euro");
                    System.out.println("Kac kisi seyahat edeceksiniz :");
                    int kisi=scan.nextInt();

                    switch(kisi){
                        case 1:
                            System.out.println("1 kisilik bilet talep ettiniz " + "bilet tutariniz : " + frUcret + "Euro" + (bakıye-=frUcret) + "Euro");
                 break;
                        case 2:
                            System.out.println("2 kisilik bilet talep ettiniz" + "bilet tutariniz" + (frUcret*2) + "Euro" + "guncel bakiyeniz : " +(bakıye-=frUcret*2) + "Euro" );
               break;
                        default:
                            System.out.println("Hatli giris yaptiniz");

                    }
                    break;
                case "KOLN":
                    System.out.println("ROTA : Koln");
                    System.out.println("Koln " + klUcret + " EURO");
                    System.out.print("kac kisi seyahat edeceksiniz :");
                    int kisi1 = scan.nextInt();
                    switch (kisi1) {
                        case 1:
                            System.out.println("1 kişilik bilet talep ettiniz " + "bilet tutarınız : "
                                    + klUcret + " EURO" + " güncel bakıyeniz: " + (bakıye -= klUcret)+" EURO");

                            break;
                        case 2:
                            System.out.println("2 kişilik bilet talep ettiniz " +
                                    "bilet tutarınız : " + (klUcret * 2) + " EURO " + "güncel bakıyeniz: " + (bakıye -= klUcret * 2)+" EURO");

                            break;
                        default:
                            System.out.println("hatalı giriş yaptınız");
                            break;
                    }
                    break;

            }
        }

}
