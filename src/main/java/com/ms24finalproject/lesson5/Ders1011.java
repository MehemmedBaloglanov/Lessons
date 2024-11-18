package com.ms24finalproject.lesson5;

import java.util.Scanner;

public class Ders1011 {
    public static void main(String[] args) {
        /*
        Switch case kullanaraq bir dene hesab makinesi yapmak
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("****************************************************************");
        String islemler = "1.Toplama\n"
                + "2.Cikarma\n"
                + "3.Carpma\n"
                + "4.Bolme\n"
                + "5.Cikis";
        System.out.println(islemler);
        System.out.println("****************************************************************");

        System.out.print("Islemi secin: ");
        int islemSecimi = scanner.nextInt();

        switch(islemSecimi){
          case 1:
              System.out.print("Birinci sayi: ");
              int sayi1 = scanner.nextInt();
              System.out.print("Ikinci sayi: ");
              int sayi2 = scanner.nextInt();
              System.out.println("Toplam: " + (sayi1 + sayi2));
              break;

          case 2:
              System.out.print("Birinci sayi: ");
              sayi1 = scanner.nextInt();
              System.out.print("Ikinci sayi: ");
              sayi2 = scanner.nextInt();
              System.out.println("Cikarma: " + (sayi1 - sayi2));
              break;

          case 3:
              System.out.print("Birinci sayi: ");
              sayi1 = scanner.nextInt();
              System.out.print("Ikinci sayi: ");
              sayi2 = scanner.nextInt();
              System.out.println("Carpma: " + (sayi1 * sayi2));
              break;

          case 4:
              System.out.print("Birinci sayi: ");
              sayi1 = scanner.nextInt();
              System.out.print("Ikinci sayi: ");
              sayi2 = scanner.nextInt();
              if(sayi2 == 0){
                  System.out.println("Sifira bolme yapamazsiniz!");
              } else {
                  System.out.println("Bolum: " + ((double)sayi1 / sayi2));
              }
              break;

          case 5:
              System.out.println("Cikis yaptiniz.");
              break;

          default:
              System.out.println("Yanlis bir islem secimi yaptiniz.");
              break;
        }


    }
}
