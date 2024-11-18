package com.ms24finalproject.lesson4;

public class Ders1221 {
    public static void main(String[] args) {
        /* Kesr ededleri saxlayan 2 tip deyisken var
        1)double
        2)float
         */

        //Double
        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.23d;

        //Float
        float e = 5.0f;
        float f = (float) 5.0;

        int m = 22 / 7;
        float n = 22f / 7f;
        double l = 22d / 7d;

        System.out.println("m= " + m);
        System.out.println("n= " + n);
        System.out.println("l= " + l);

        int i = 5;
        float j = i;
        System.out.println(j);


        int i1 = 5;
        double j1 = i1;
        System.out.println(j1);

        double k = 3.52;
        float q = (float) k;
        System.out.println(q);

        double say = 70.25;
        double say1 = 60d;
        double say2 = 80.2;
        System.out.println("Ortalama: " + (say + say1 + say2) / 3);


    }
}
