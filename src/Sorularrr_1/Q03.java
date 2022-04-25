package Sorularrr_1;

public class Q03 {

    public static void main(String[] args) {

        // verilen 12345 sayısının rakamlarını yukarıdan aşağıya doğru yazdırınız
        // ex: input:
//		    output: 1
//		            2
//		            3
//		            4
//
        int sayi=12345;
        int birler=(sayi%10);
        int onlar=(sayi/10%10);
        int yuzler=(sayi/100%10);
        int binler=(sayi/1000%10);
        int onBinler=(sayi/10000);


        System.out.println(onBinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler);

    }
}
