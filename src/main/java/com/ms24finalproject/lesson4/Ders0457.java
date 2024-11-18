package com.ms24finalproject.lesson4;

import java.util.Scanner;

public class Ders0457 {
    public static void main(String[] args) {
        /*
        Kullanicidan aldiginiz iki sayinin deyerlerini deyistirin
         */

        Scanner scanner = new Scanner(System.in);

        int birinci_sayi;
        int ikinci_sayi;

        System.out.print("Birinci sayini girin: ");
        birinci_sayi = scanner.nextInt();

        System.out.print("Ikinci sayini girin: ");
        ikinci_sayi = scanner.nextInt();

        System.out.println("Deyistirmeden once: " + birinci_sayi + "-" + ikinci_sayi);

        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;
        System.out.println("Deyerler degistirildi: " + birinci_sayi + " - " + ikinci_sayi);

    }
}
