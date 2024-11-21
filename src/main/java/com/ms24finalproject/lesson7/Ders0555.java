package com.ms24finalproject.lesson7;

import java.util.Scanner;

public class Ders0555 {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan 2 ededin ebobunu tapmaq
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayiyi girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("Ikinci sayiyi girin: ");
        int sayi2 = scanner.nextInt();

        int ebob = ebob(sayi1,sayi2);
        System.out.println(ebob);
    }

    public static int ebob(int sayi1, int sayi2) {
        int ebob = 1;

        for(int i = 1;i<=sayi1 && i<=sayi2;i++){
            if(sayi1 % i == 0 && sayi2 % i == 0){
                ebob = i;
            }
        }

        return ebob;
    }
}
