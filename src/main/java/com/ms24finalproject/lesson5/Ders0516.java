package com.ms24finalproject.lesson5;

import java.util.Scanner;

public class Ders0516 {
    public static void main(String[] args) {
        /*
        Beden Kitle Indeksini hesabla ve kosullar ekle
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz: ");
        int kilo = scanner.nextInt();

        System.out.print("Boyunuzu giriniz: ");
        double boy = scanner.nextDouble();

        double bedenKitleIndeksi = kilo / (boy * boy);

        System.out.println("Beden kitle indeksiniz: " + bedenKitleIndeksi);

        if (bedenKitleIndeksi < 18.5) {
            System.out.println("Zayif");
        } else if (bedenKitleIndeksi >= 18.5 && bedenKitleIndeksi < 25) {
            System.out.println("Normal");
        } else if (bedenKitleIndeksi >= 25 && bedenKitleIndeksi < 30) {
            System.out.println("Fazla Kilolu");
        } else {
            System.out.println("Obez");
        }
    }
}
