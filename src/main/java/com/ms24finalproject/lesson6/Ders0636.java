package com.ms24finalproject.lesson6;

import java.util.Scanner;

public class Ders0636 {
    public static void main(String[] args) {
        /*
        Faiz Uygulaması
        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.

        Faiz Oranı : %6 Faiz Oranı

        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamiza hosgeldiniz. Faiz orani 6%");

        int anapara;
        int vade;

        System.out.print("Anapara degerini giriniz: ");
        anapara = scanner.nextInt();

        System.out.print("Vadeyi yil cinsinden giriniz: ");
        vade = scanner.nextInt();

        double toplamPara = anapara;
        double faizOrani = 0.06; // Faiz oranini 0.06 olarak gosterdik

        for (int i = 1; i <= vade; i++) {
            toplamPara = (toplamPara*faizOrani) + toplamPara;
            System.out.println("Yil " + i + "deki toplam para: " + toplamPara);
        }



    }
}
