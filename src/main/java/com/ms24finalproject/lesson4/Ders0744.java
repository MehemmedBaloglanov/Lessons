package com.ms24finalproject.lesson4;

import java.util.Scanner;

public class Ders0744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yas = scanner.nextInt();

        scanner.nextLine(); //Dummy line -> bu niye lazimdir cunki burda yas sonraki isim lineni gormur onu gorsun diye
        //ozumuzden bir dene salak line atirik ki onu gorsun

        String ismi = scanner.nextLine();

        System.out.println("Yas: " + yas);
        System.out.println("Isim: " + ismi);


        int yas1 = scanner.nextInt();
        int yas2 = scanner.nextInt();
        int yas3 = scanner.nextInt();

        System.out.println("yas1: " + yas1 + " yas2: " + yas2 + " yas3: " + yas3);
    }
}
