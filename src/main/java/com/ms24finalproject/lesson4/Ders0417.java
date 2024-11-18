package com.ms24finalproject.lesson4;

import java.util.Scanner;

public class Ders0417 {
    public static void main(String[] args) {
        /*
        Katetleri verilmis bir duzbucaqli ucbucagin hipetonuzunun tapilmasi
         */

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.print("Birinci Katet: ");
        a = scanner.nextInt();

        System.out.print("Ikinci katet: ");
        b = scanner.nextInt();

        double hipetonus = Math.sqrt(a*a+b*b);

        System.out.println("Hipotenüs: " + hipetonus);


    }
}
