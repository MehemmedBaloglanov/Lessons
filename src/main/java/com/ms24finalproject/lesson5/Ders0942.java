package com.ms24finalproject.lesson5;

import java.util.Scanner;

public class Ders0942 {
    public static void main(String[] args) {
        /*
        if - else block-u

        if(kosul){
         //Kosul dogru ise burada calisir
         } else {
         //Kosul yanlis ise burada calisir
         }
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen yasinizi girin: ");
        int yas = scanner.nextInt();

        if(yas<18){
            System.out.println("Bu mekana giremessiniz!");
        } else{
            System.out.println("Giris yapabilirsiniz!");
        }
    }
}
