package com.ms24finalproject.lesson4;

import java.util.Scanner;

public class Ders1142 {
    public static void main(String[] args) {


    /*
    Scanner userdan input almaq ucun istifade edilir
     */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi girin: ");

        int yas = scanner.nextInt();

        System.out.println("Yasiniz: " + yas);


        //Eger user intden basqa deyer girse onda error atacaq.
        // Basqa deyer girmesinin qarsisini almaq ucun asagidaki kimi bir if ile ozumuzu qarantiye ala bilerik
        System.out.println("Lutfen bir sayi giriniz: ");
        if (scanner.hasNextInt()) {
            int sayi = scanner.nextInt();
            System.out.println("Sayiniz: " + sayi);
        }else {
            System.out.println("Lutfen tam sayi giriniz");
        }
    }
}
