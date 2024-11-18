package com.ms24finalproject.lesson4;

import java.util.Scanner;

public class Ders0528 {
    public static void main(String[] args) {
    /*
    Kullanicidan aldiginiz  boy ve kilo deyerine gore kullanicinin beden kitle indeksini bulma
    Beden kitle indeksi = kilo/boy(m)*boy(m)
     */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz: ");
        int kilo = scanner.nextInt();

        System.out.print("Boyunuzu giriniz: ");
        double boy = scanner.nextDouble();

        double bedenKitleIndeksi = kilo / (boy * boy);

        System.out.println("Beden kitle indeksiniz: " +bedenKitleIndeksi);

    }
}
