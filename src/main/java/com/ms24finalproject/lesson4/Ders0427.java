package com.ms24finalproject.lesson4;

import java.util.Scanner;

public class Ders0427 {
    public static void main(String[] args) {
        /*
         Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı bilgilerini alın ve
        sürücünün toplam ne kadar ödemesini gerektiğini hesaplayın.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Aracın kilometrede kac kurus yakiyor?: ");
        double kilometreYaktigi = scanner.nextDouble();

        System.out.print("Aracınizla kac kilomet gitdiniz?: ");
        double yolYaptigiKilometre = scanner.nextDouble();

        System.out.println("Toplam odemeniz gereken tutar: "  + (kilometreYaktigi*yolYaptigiKilometre) + " tl dir.");
    }
}
