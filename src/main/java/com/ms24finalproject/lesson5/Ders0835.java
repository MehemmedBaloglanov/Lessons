package com.ms24finalproject.lesson5;

import java.util.Scanner;

public class Ders0835 {
    public static void main(String[] args) {
        /*
        Switch-case statements

        switch(degisken){
         case deger1:
          //Burada deger1 degerine esitse calisir
          break;
         case deger2:
          //Burada deger2 degerine esitse calisir
          break;
         default:
          //Burada default degeri ile esit degilse calisir}
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir sayi girin: ");
        int sayi = scanner.nextInt();

        switch (sayi) {
            case 1:
                System.out.println("Sayi 1-dir");
                break;
            case 2:
                System.out.println("Sayi 2-dir");
                break;
            case 3:
                System.out.println("Sayi 3-dir");
                break;
            default:
                System.out.println("Sayi 1, 2 veya 3 olmalidir!");
                break;
        }
    }
}
