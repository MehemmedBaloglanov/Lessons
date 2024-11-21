package com.ms24finalproject.lesson7;

public class Ders0611 {

    public static void selamlama(String isim){
        System.out.println("Selam " + isim);
    }

    public static void toplama(int a,int b,int c){
        System.out.println("Toplam: " + (a + b + c));
    }

    public static void main(String[] args) {
        /*
        Parametrli fonksiyonlar
         */

        selamlama("Ahmet");

        toplama(5, 10, 15);
    }
}
