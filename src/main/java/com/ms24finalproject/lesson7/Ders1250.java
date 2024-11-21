package com.ms24finalproject.lesson7;

public class Ders1250 {

    public static int toplama(int a, int b, int c){
//        System.out.println("Toplama: " + a + " " + b + " " + c);
        return a+b+c;
    }

    public static int ikiilecarpma(int a){
        return a*2;
    }

    public static int ikiiletoplama(int a){
        return a+2;
    }

    public static int dordilecarpma(int a){
        return a*4;
    }


    public static int deneme(int a){
        System.out.println("Cikti yapiliyor...");
        return a*2;

        //burda nese yazilsa islemir cunki returnden asagodadi
    }

    public static void main(String[] args) {
        /*return kavrami
         */

        int dordilecarpma = dordilecarpma(ikiiletoplama(ikiilecarpma(8)));
        System.out.println("Dordiye carpma: " + dordilecarpma);

        System.out.println("Toplam: " + toplama(12,13,14));


        deneme(4);
    }
}
