package Sorular_6_MethodCretion;

public class Q05 {
    public static void main(String[] args) {
              /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */
        int sonuc = cumle("javacı arkadaşlar zehir gibi maaşallah en kısa zamanda çok bin $'lı iş bulurlar");

        System.out.println("Girilen String'te kelime sayısı : " + sonuc);

    }
    public static int cumle(String str){
        int count=0;
        char space=' ';

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==space){
                count++;
            }
        }
        return count+1;
    }
}
