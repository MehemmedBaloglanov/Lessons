package com.ms24finalproject.lesson6;

import java.util.Scanner;

public class Ders1805 {
    public static void main(String[] args) {
        /*
        for(baslatma;kosul;artirma ve ya azaltma){
         //Kosul dogru ise burada calisir
         }
         */

        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        for(int a = 0; a < 5; a++) {
            System.out.println("a = " + a);
        }

        for(int b =10 ;b>=0;b--) {
            System.out.println("b = " + b);
        }

        int c =0;
        for(;c<5;c++) {
            System.out.println("c = " + c);
        }

        int d = 0;
        int e =10;

        for(;d<10 && e>0;d++,e--){
            System.out.println("d = " + d + ", e = " + e);
        }

        for(int f = 2;f<100;f*=2){
            System.out.println("f = " + f);
        }

        //Factorial bulma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi girin: ");
        int num = scanner.nextInt();

        int factorial = 1;
        for(int g = 1; g<=num; g++){
            factorial *= g;
        }
        System.out.println("Factorial: " + factorial);
    }
}
