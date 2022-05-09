package Sorular_5_StringManipulation;

public class Q11 {
    /*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
    public static void main(String[] args) {
        String  harfDeposu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char a=harfDeposu.charAt(harfDeposu.indexOf("A"));//A
        char l=harfDeposu.charAt(harfDeposu.indexOf("L"));//L
        char ı=harfDeposu.charAt(harfDeposu.indexOf("I"));//I

        System.out.println(""+a+l+ı);


    }
}
