package com.ms24finalproject.lesson6;

import java.util.Scanner;

public class Ders0846 {
    public static void main(String[] args) {
        /*
        do-while loop

        do{
         //Bu islem do-while loopun calismasi icin en az bir kere calisir
        } while(kosul);

        Kosul dogru olana kadar islemler calisir ve do-while loopun sonunda kosul kontrol edilir.
        Eğer kosul false ise do-while loop sonlanir ve islemler tamamlanir.
         */

        int i = 0;
        do{
            System.out.println("i  = " + i);
            i++;
        }while (i<5);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Bir sayi girin: ");
    int sayi = scanner.nextInt();

    int toplam = 0;
    do {
        toplam += sayi % 10;
        sayi /=10;
    }while (sayi>0);

    System.out.println("Girilen sayinin rakamlar toplami: " + toplam);

    }
}
