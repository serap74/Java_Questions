package Sorular_5_StringManipulation;

import java.util.Scanner;

public class Q06 {
      /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("E-posta adresinizi girin");
          String ePosta=scan.nextLine();

          if(ePosta.contains("@hotmail")){
              ePosta=ePosta.replace("@hotmail","@gmail");
          }
              System.out.println(ePosta);
      }
}
