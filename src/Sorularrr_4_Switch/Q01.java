package Sorularrr_4_Switch;

import java.util.Scanner;

public class Q01 {
    	/*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Notunuzu giriniz : ");
            int not=scan.nextInt();
            String note="";

            System.out.println("if ile cozum" );
            if(not>=0 && not<50){
                note="Kaldiniz";
            }if(not>=50 && not<60){
                note="Eh işte";
            }if(not>=60 && not<80){
                note="Basarili";
            }if(not>=80 && not<=100){
                note="Cok basarili";
            }else System.out.println("gecerli not giriniz");

            System.out.println("Switch ile cozum");

            switch(note){
                case "Kaldiniz":
                    System.out.println("D");
                break;
                case "Eh iste":
                    System.out.println("C");
                    break;
                case "Basarili":
                    System.out.println("B");
                    break;
                case "Cok basarili":
                    System.out.println("A");
                    break;
                default:
                    System.out.println("gecerli not giriniz");
            }
        }


}
