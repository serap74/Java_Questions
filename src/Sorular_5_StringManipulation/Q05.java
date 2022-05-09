package Sorular_5_StringManipulation;

public class Q05 {
      /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */
      public static void main(String[] args) {
          String  str1=" $13.99";
          String str2=" $10.55 ";

          str1=str1.replace("$", "");
          str2=str2.replace("$", "");
          System.out.println(str1+str2+"$");

          double str1Sayi=Double.parseDouble(str1);
          double str2Sayi=Double.parseDouble(str2);
          double toplam=(str1Sayi+str2Sayi)/100;
          System.out.println("$" + toplam);


      }
}
