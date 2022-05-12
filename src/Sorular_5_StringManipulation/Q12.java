package Sorular_5_StringManipulation;

import java.util.Scanner;

public class Q12 {
    	/* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Mail adresi giriniz");
            String mail=scan.nextLine();

            if(!mail.contains("@")){
                System.out.println("Gecerli bir e mail adresi girin");

            }else if(mail.endsWith("@gmail.com")){
                System.out.println("Email onaylandi");

            }else if(mail.contains("@") && mail.endsWith("gmail.com")){
                System.out.println("Lutfen e  mail hesabinizi girin");

            }else System.out.println("Hatali giris yaptiniz");
        }
}
