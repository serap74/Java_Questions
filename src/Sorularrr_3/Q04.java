package Sorularrr_3;

import java.util.Scanner;

public class Q04 {

    /*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Mesleginizi qa\ndev\nba\npm seciniz");

        String meslek=scan.nextLine();

        String qe="Quality Analiyst";
        String dev="Devolaper";
        String ba="Busines Analyst";
        String pm="Project Manager";

        if(meslek.equalsIgnoreCase("qe")){
            System.out.println("mesleginiz : " + qe);
        }else if (meslek.equalsIgnoreCase("dev")){
            System.out.println("Mesleginiz : " + dev);

        }else if (meslek.equalsIgnoreCase("ba")){
            System.out.println("Mesleginiz : " + ba);

        }else if (meslek.equalsIgnoreCase("pm")){
            System.out.println("Mesleginiz : " + pm);

        }else System.out.println("Hatali secim yaptiniz");
    }
}
