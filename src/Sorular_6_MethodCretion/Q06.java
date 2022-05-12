package Sorular_6_MethodCretion;

public class Q06 {
    public static void main(String[] args) {
          /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
        birkereYazdir("javacılar çoook afilli arkadaşlar");


    }
    public static void birkereYazdir(String str){
        String sonuc="";
        for (int i = 0; i < str.length(); i++) {
            if(!sonuc.contains(str.substring(i,i+1))){
                sonuc+=str.substring(i,i+1);
            }
        }
        System.out.println(sonuc);

    }
}
