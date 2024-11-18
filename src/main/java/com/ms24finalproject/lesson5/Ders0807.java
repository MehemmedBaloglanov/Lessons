package com.ms24finalproject.lesson5;

import java.util.Scanner;

public class Ders0807 {
    public static void main(String[] args) {
         /*
    Kullanıcıdan Vize1,Vize2  ve Final notunu alarak bir harf hesaplama sistemi yapmaya çalışın.
    Ayrıca kullanıcıdan okuldaki genel ortalamasını alarak,
    DD alma ve 2.50’nin altında olma koşuluna göre ekrana bir tavsiye mesajı yazdırın.

    Vize1 toplam notun %30'una etki edecek.

    Vize2 toplam notun %30'una etki edecek.

    Final toplam notun %40'ına etki edecek.


    Toplam Not >=  90 -----> AA

    Toplam Not >=  85 -----> BA

    Toplam Not >=  80 -----> BB

    Toplam Not >=  75 -----> CB

    Toplam Not >=  70 -----> CC

    Toplam Not >=  65 -----> DC

    Toplam Not >=  60 -----> DD

    Toplam Not >=  55 -----> FD

    Toplam Not <  55 -----> FF

    */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen Vize1 notunu girin: ");
        double vize1Notu = scanner.nextDouble();
        System.out.print("Lutfen Vize2 notunu girin: ");
        double vize2Notu = scanner.nextDouble();
        System.out.print("Lutfen Final notunu girin: ");
        double finalNotu = scanner.nextDouble();
        System.out.print("Lutfen Okul Genel Ortalamasini girin: ");
        double genelOrtalamasi = scanner.nextDouble();

        double toplamNot = (vize1Notu * 0.30) + (vize2Notu * 0.30) + (finalNotu * 0.40);

        if (toplamNot >= 90) {
            System.out.println("Harf Notunuz AA");
        } else if (toplamNot >= 85) {
            System.out.println("Harf Notunuz BA");
        } else if (toplamNot >= 80) {
            System.out.println("Harf Notunuz BB");
        } else if (toplamNot >= 75) {
            System.out.println("Harf Notunuz CB");
        } else if (toplamNot >= 70) {
            System.out.println("Harf Notunuz CC");
        } else if (toplamNot >= 65) {
            System.out.println("Harf Notunuz DC");
        } else if (toplamNot > 60) {
            System.out.println("Harf Notunuz DD");
            if(genelOrtalamasi<2.50) {
                System.out.println("Genel Ortalamaniz 2.50'nin altinda, lutfen daha iyi notlar alin.");
            }
        } else if (toplamNot >= 55) {
            System.out.println("Harf Notunuz FD");
        } else {
            System.out.println("Harf Notunuz FF");
        }
    }
}
