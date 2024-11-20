package com.ms24finalproject.lesson6;

import java.util.Scanner;

public class Ders1040 {
    public static void main(String[] args) {
        /*
        While dongusu ile ATM proqrami yazma:

        Islemler
        1. Bakiye sorgulama
        2. Para Cekme
        3. Para yatirma
        4. Cikis
         */

        Scanner scanner = new Scanner(System.in);

        int bakiye = 1000;

        String islemler = "1. Bakiye sorgulama" +
                "\n2. Para Cekme" +
                "\n3. Para yatirma" +
                "\n4. Cikis";

        System.out.println("****************************************************************");
        System.out.println(islemler);
        System.out.println("****************************************************************");


        while (true) {
            System.out.print("Islemi secin: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan cikiliyor...");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye + " AZN");
            } else if (islem.equals("2")) {
                System.out.print("Cekmek istediginiz miktar: ");
                int cekilecekMiktar = scanner.nextInt();
                scanner.nextLine();
                if (cekilecekMiktar <= bakiye) {
                    bakiye -= cekilecekMiktar;
                    System.out.println("Cekim basarili. Yeni bakiye: " + bakiye + " AZN");
                } else {
                    System.out.println("Yetersiz bakiye!");
                }
            } else if (islem.equals("3")) {
                System.out.print("Yatirmak istediginiz miktar: ");
                int yatirilacakMiktar = scanner.nextInt();
                scanner.nextLine();
                bakiye += yatirilacakMiktar;
                System.out.println("Yatirma basarili. Yeni bakiye: " + bakiye + " AZN");
            } else {
                System.out.println("Geçersiz islem!");
            }
        }
    }
}
