package Sorular_5_StringManipulation;

import java.util.Scanner;

public class Q04 {
    // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dort harfli bir kelime girin");
        String str = scanner.nextLine();

        if (str.length() != 4) {
            System.out.println("Lutfen 4 harfli bir kelime girin");

        } else {

            System.out.print("Ters kelime: ");
            System.out.print(str.substring(3));
            System.out.print(str.substring(2,3));
            System.out.print(str.substring(1,2));
            System.out.print(str.substring(0,1));


        }
    }
}