package com.ms24finalproject.lesson7;

public class Ders1005 {


    public static void main(String[] args) {
        int a =4;
        String yazdir = "Merhaba";

        if (a<10){
            int b = 6;
            System.out.println(yazdir);
        }


        for (int i = 0; i<10; i++) {
            System.out.println("i = " + i);
        }
//        System.out.println(i); burda uje i ni istifade elemek mumkun deyil;

        int j;
        for (j = 0; j<10; j++) {
            System.out.println("j = " + j);
        }
        System.out.println(j); //Burda ise j kenarda tanimlandigi ucun istiofade etmek mumkundur


        int b =1;

        while (b<20){
            if (b%2 ==0){
                String yazdir1 = "Cift";
                System.out.println(yazdir1);
            }

            b++;
        }

        toplama(10,20,30);
    }

    public static void toplama(int a, int b, int c){
        System.out.println("Toplam: " + (a + b + c));
    }
}
