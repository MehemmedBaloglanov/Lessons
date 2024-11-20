package com.ms24finalproject.lesson6;

import java.util.Scanner;

public class Ders1007 {
    public static void main(String[] args) {
        /*
        While(kosul){
         //Kosulun dogru olmasi durumunda calisacak kisimlar
         }
         */

        int i = 0;
        while (i < 10) {
            System.out.println("Sayı: " + i);
            i++;
        }

        //Factorial hesablama
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi girin: ");
        int sayi = scanner.nextInt();

        int factorial = 1;
        while (sayi > 0) {
            factorial *= sayi;
            sayi--;
        }

        System.out.println("Factorial: " + factorial);


        int a =0;
        while (a < 10) {
            System.out.println("Sayı: " + a);
        }
    }
}
