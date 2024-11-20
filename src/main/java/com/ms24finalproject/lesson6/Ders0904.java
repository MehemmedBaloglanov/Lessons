package com.ms24finalproject.lesson6;

import java.util.Scanner;

public class Ders0904 {
    public static void main(String[] args) {
        /*
        Girilen bir sayının armstrong sayısını olup olmadığını bulmaya çalışın.
        Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekmektedir.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayısı)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)

        Bu programı do while döngüsü yardımıyla yapabilirsiniz.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int sayi = scanner.nextInt();
        System.out.print("Basamak sayisi: ");
        int basamakSayisi = scanner.nextInt();

        int kalan = sayi;
        int armstrongToplam = 0;
        do {
            int rakam = kalan % 10;
            kalan /= 10;
            armstrongToplam += Math.pow(rakam, basamakSayisi);
        }while (kalan>0);

        if(sayi == armstrongToplam) {
            System.out.println(sayi + " bir armstrong sayisi.");
        }else {
            System.out.println(sayi + " bir armstrong sayisi degil.");
        }
    }
}
