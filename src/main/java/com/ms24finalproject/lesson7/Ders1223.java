package com.ms24finalproject.lesson7;

import java.util.Scanner;

public class Ders1223 {

    public static void selamlama(){
        System.out.println("Merhaba nasilsiniz?");
        System.out.println("Selamlar...");
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir sayi girin: ");
        int num = scanner.nextInt();

        int factorial = 1;
        for(int g = 1; g<=num; g++){
            factorial *= g;
        }
        System.out.println("Factorial: " + factorial);
    }

    public static void main(String[] args) {
        /*
        Erişim_Belirleyici(Opsiyonel) Ekstra_Özellikler Dönüş_Tipi Fonksiyon_Adı(Parametreler){
            // Burası Fonksiyon Bloğu

            // Fonksiyonun yapacağı işlemler burada olacak.
        }
        */
        selamlama();

        factorial();
    }
}
