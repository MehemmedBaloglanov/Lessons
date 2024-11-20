package com.ms24finalproject.lesson6;

import java.util.Scanner;

public class Ders1021 {
    public static void main(String[] args) {
        /*
        While dongusu kullanaraq kullanici girisi yazin
         */

        Scanner scanner = new Scanner(System.in);

        int giris_haqqi =3;

        String sys_kullanici_adi = "Mahammad";
        String sys_sifre = "123456";

        System.out.println("********************************");
        System.out.println("Kullanici Girisine hosgeldiniz");
        System.out.println("********************************");

        while (true) {
            System.out.print("Kullanici adi: ");
            String kullanici_adi = scanner.nextLine();

            System.out.print("Sifre: ");
            String sifre = scanner.nextLine();

            if (kullanici_adi.equals(sys_kullanici_adi) && sifre.equals(sys_sifre)) {
                System.out.println("Giris basarili!");
                break;
            } else if(kullanici_adi.equals(sys_kullanici_adi) && !sifre.equals(sys_sifre)){
                System.out.println("Sifre yanlis!");
                giris_haqqi--;
            }else if(!kullanici_adi.equals(sys_kullanici_adi) && sifre.equals(sys_sifre)){
                System.out.println("Kullanici adi yanlis!");
                giris_haqqi--;
            }else {
                System.out.println("Kullanici adi ve sifre yanlis! " + giris_haqqi + " hakkiniz kaliyor.");
                giris_haqqi--;
            }
            if(giris_haqqi==0){
                System.out.println("Giris hakkiniz bitti!");
                break;
            }
            }
    }
}

