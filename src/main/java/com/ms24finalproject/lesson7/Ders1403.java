package com.ms24finalproject.lesson7;

import java.util.Scanner;

public class Ders1403 {
    public static void main(String[] args) {
        /*
    Method Overloading kullanak bir tane hesap makinesi tasarlamaya çalışın.
    Toplama ve Çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayın.
    */

        Scanner scanner = new Scanner(System.in);
        String islemler = "1.Toplama\n"
                + "2.Cikarma\n"
                + "3.Carpma\n"
                + "4.Bolme\n"
                + "5.Cikis icin q-ye basin";
        System.out.println("****************************************************************");
        System.out.println(islemler);
        System.out.println("****************************************************************");

        while (true) {
            System.out.print("Islemi secin: ");
            String islemSecimi = scanner.nextLine();
            if (islemSecimi.equals("q")) {
                System.out.println("Programdan cikiliyor...");
                break;
            } else if (islemSecimi.equals("1")) {
                System.out.println("Kac deyer toplayacaqsiniz? : (2 ve ya 3)");
                int toplamSayisi = scanner.nextInt();

                if (toplamSayisi == 2) {
                    System.out.print("Birinci sayiyi girin: ");
                    int sayi1 = scanner.nextInt();
                    System.out.print("Ikinci sayiyi girin: ");
                    int sayi2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Toplam: " + topla(sayi1, sayi2));
                } else if (toplamSayisi == 3) {
                    System.out.print("Birinci sayiyi girin: ");
                    int sayi1 = scanner.nextInt();
                    System.out.print("Ikinci sayiyi girin: ");
                    int sayi2 = scanner.nextInt();
                    System.out.print("Ucuncu sayiyi girin: ");
                    int sayi3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Toplam: " + topla(sayi1, sayi2, sayi3));
                } else {
                    System.out.println("Lutfen 2 veya 3 sayi girin.");
                }
            } else if (islemSecimi.equals("2")) {
                System.out.print("Birinci sayiyi girin: ");
                int sayi1 = scanner.nextInt();
                System.out.print("Ikinci sayiyi girin: ");
                int sayi2 = scanner.nextInt();

                System.out.println("Cikarma: " + cikarma(sayi1, sayi2));
            }
            else if (islemSecimi.equals("3")) {
                System.out.println("Kac deyer carpacaksiniz? : (2 ve ya 3)");
                int toplamSayisi = scanner.nextInt();

                if (toplamSayisi == 2) {
                    System.out.print("Birinci sayiyi girin: ");
                    int sayi1 = scanner.nextInt();
                    System.out.print("Ikinci sayiyi girin: ");
                    int sayi2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Carpim: " + carp(sayi1, sayi2));
                }else if(toplamSayisi == 3) {
                    System.out.print("Birinci sayiyi girin: ");
                    int sayi1 = scanner.nextInt();
                    System.out.print("Ikinci sayiyi girin: ");
                    int sayi2 = scanner.nextInt();
                    System.out.print("Ucuncu sayiyi girin: ");
                    int sayi3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Carpim: " + carp(sayi1, sayi2, sayi3));
                } else {
                    System.out.println("Lutfen 2 veya 3 sayi girin.");
                }
            }else if(islemSecimi.equals("4")){
                System.out.print("Birinci sayiyi girin: ");
                int sayi1 = scanner.nextInt();
                System.out.print("Ikinci sayiyi girin: ");
                int sayi2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Bolum: " + bolme(sayi1, sayi2));
            }else {
                System.out.println("Lutfen 1, 2, 3, 4 veya 5'e basarak islem secin.");
            }

        }
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

    public static int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public static int carp(int sayi1, int sayi2, int sayi3) {
        return sayi1 * sayi2 * sayi3;
    }

    public static double bolme(int sayi1, int sayi2) {
        if (sayi2 == 0) {
            System.out.println("Sifira bölünemesin!");
            return 0;
        }
        return (double) sayi1 / sayi2;
    }

    public static int cikarma(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

}
