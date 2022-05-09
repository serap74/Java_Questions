package Sorular_5_StringManipulation;

import java.util.Scanner;

public class Q07 {
    /* TASK :
     * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
     * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
     * Test data: ali eme all
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String  isim=scan.nextLine();

        System.out.println("****************iff************");
        String s1=isim.substring(0,1);
        String s2=isim.substring(1,2);
        String s3=isim.substring(2,3);
        if(isim.length()==3){
            if(!s1.equals(s2) && !s2.equals(s3) && !s1.equals(s3)){
                System.out.println("Girdiginiz isim 3 harfli ve uniq karakterler iceriyor");
            }else System.out.println("Girdiginiz isim 3 harfli fakat uniq karakterler icermiyor");
        }else System.out.println("Girdiginiz kelime 3 harfli degil");

        System.out.println("****Ternary*********");
        char c1=isim.charAt(0);
        char c2=isim.charAt(2);
        char c3=isim.charAt(3);

        String result = isim.length() == 3 ? ((c1 != c2 & c1 != c3 && c2 != c3) ? "Girdiginiz isim 3 harfli ve unique karakterle sahip"
                : "Girdiginiz isim 3 harfli ancak unique karakterle sahip degil "):"Girdiginiz isim 3 harfli değil";


        System.out.println(result);



    }
}
