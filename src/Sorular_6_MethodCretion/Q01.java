package Sorular_6_MethodCretion;

import java.util.Scanner;

public class Q01 {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' veya ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Bir kelime giriniz");
            String kelime=scan.nextLine();




        }
        public static String ilkIkisiz(String kelime){
            String kalanHarfler="";
            if(kelime.startsWith("gh")){
                kalanHarfler=kelime;
            }else if(kelime.startsWith("g")){
                kalanHarfler
                        =kelime.charAt(0)+kelime.substring(2);
            }else if(kelime.charAt(1)=='h'){
                kalanHarfler=kelime.substring(1);
            }else {
                kalanHarfler=kelime.substring(2);
            }


            return kalanHarfler;
        }

}
