package com.ms24finalproject.lesson7;

public class Ders0846 {
    public static void main(String[] args) {
        /*
        Overloading
         */
        toplama(5, 7);
        toplama(5, 7, 10);
        toplama("5", "7");

        scoreHesablama("Mahammad",68);
        scoreHesablama(75);
        scoreHesablama("Veli");
    }

    // Overloaded method
    public static void toplama(int a, int b) {
        System.out.println("Toplama " + a + " " + b);
    }

    // Overloaded method
    public static void toplama(int a, int b, int c) {
        System.out.println("Toplama " + a + " " + b + " " +c);
    }

    public static void toplama(String a, String b){
        System.out.println("Toplama " + a+b);
    }

    public static void scoreHesablama(String isim, int puan){
        System.out.println(isim + "'nin skoru: " + puan);
    }

    public static void scoreHesablama(int puan){
        System.out.println("Isimsiz oyuncunun puani: " + puan);
    }

    public static void scoreHesablama(String isim){
        System.out.println(isim + "'nin skoru: 0");
    }
}

