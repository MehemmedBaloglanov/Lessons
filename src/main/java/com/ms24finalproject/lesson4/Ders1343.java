package com.ms24finalproject.lesson4;

public class Ders1343 {
    public static void main(String[] args) {
        /*
        Matamatic operatorlari
         + --> Toplama
         - --> Cikarma
         * --> Carpma
         / --> Bolme
         % --> Modulo (Bolumunden Kalan Kisim)
         */

        System.out.println(3 + 4);
        System.out.println(3 + 3.4); //int le double toplananada netice double olur
        System.out.println(7 - 5);
        System.out.println(8 * 2);
        System.out.println(10 / 4); // int i inte bolende cavab int oldugu ucun burda cavab 2 alinir
        System.out.println(10.0 / 4); //double ile int i bolende netice yene double oldugu ucun burda cavab 2.5 alinir
        System.out.println(12 % 5); //Burda edeleri bir birine bolende qalan qaligi verir. Cavab 4 olur 12:5=2 (qaliq:4)


        /*
        Atama operatorlari
         = --> Eger degisken yoksa yeni degisken olusturur
         += --> Degiskenin degerini toplayarak degistirmek icin
         -= --> Degiskenin degerini cikartarak degistirmek icin
         *= --> Degiskenin degerini carparak degistirmek icin
         /= --> Degiskenin degerini  bolerek degistirmek icin
         %= --> Degiskenin degerini mod alarak degistirmek icin
         */

        int p = 4;
        p = p + 3; // p = 7 olur.
        System.out.println(p);

        int q = 4;
        q += 3; // q = 7 olur.
        System.out.println(q);


        /*
         i++ -> 1 vahid artma
         ++i -> 1 vahid artma
         i-- -> 1 vahid azaltma
         --i -> 1 vahid azaltma
         */

        int r = 4;
        System.out.println(r++); // r = 4, cavab 4 olur.
        System.out.println(r); // r = 5, cavab 5 olur.
        int s = 4;
        System.out.println(++s); // s = 5, cavab 5 olur.
        System.out.println(s); // s = 5, cavab 5 olur.
        int t = 4;
        System.out.println(t--); // t = 4, cavab 4 olur.
        System.out.println(t); // t = 3, cavab 3 olur.
        int u = 4;
        System.out.println(--u); // u = 3, cavab 3 olur.
        System.out.println(u); // u = 3, cavab 3 olur.
        
    }
}
