package Sorular_5_StringManipulation;

import java.util.Scanner;

public class Q01 {
    // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz :" );
        String str= scan.nextLine();

        boolean boslukVarmi=str.contains(" ");
        System.out.println("boslukVarMi = " + boslukVarmi);

        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
        System.out.println(str.isEmpty());
    }


}
