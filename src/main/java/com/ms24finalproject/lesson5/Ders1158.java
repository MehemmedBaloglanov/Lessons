package com.ms24finalproject.lesson5;

import java.util.Scanner;

public class Ders1158 {
    public static void main(String[] args) {
        /*
        if(kosul){
        //Kosul true olarsa bura calisir
        }else if(kosul){
        //Kosul true olan ve kosul 1'in degeri false ise bura calisir'
        }else{
        //Iki kosulda false ise bura calisir
        }
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi girin: ");
        int sayi = scanner.nextInt();

        if (sayi == 1) {
            System.out.println("Sayi 1-dir");
        } else if (sayi == 2) {
            System.out.println("Sayi 2-dir");
        } else if (sayi == 3) {
            System.out.println("Sari 3-dur");
        } else {
            System.out.println("Sayi 1,2,3 den basqa bir rekamdir");
        }
    }
}
