package com.ms24finalproject.lesson5;

import java.util.Scanner;

public class Ders0521 {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan 3 sayidan en buyuyunu bul
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen 1 ci sayini girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("Lutfen 2 ci sayini girin: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Lutfen 3 ci sayini girin: ");
        int sayi3 = scanner.nextInt();

        int mak = -1;

        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            mak = sayi1;
            System.out.println("En buyuk sayi: " + mak);
        } else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            mak = sayi2;
            System.out.println("En buyuk sayi: " + mak);
        } else {
            mak = sayi3;
            System.out.println("En buyuk sayi: " + mak);
        }
    }
}
