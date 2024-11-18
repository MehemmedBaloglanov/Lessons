package com.ms24finalproject.lesson5;

public class Ders0939 {
    public static void main(String[] args) {
        /*
        Mantiksal operator
        AND &&: İkiside true olarsa netice true olur, ikisi de false olsa netice false olur.
        OR ||: İkisiden biri true olarsa netice true olur, her ikisi false olsa netice false olur.
        NOT (!): False olsa netice true olur, true olsa netice false olur
         */

        System.out.println(3 == 3); //true

        System.out.println(2 < 3); //true

        System.out.println(3 == 3 && 2 < 3); //true

        System.out.println(3 == 3 && 2 > 3); //false

        System.out.println(3 == 3 && 2 > 3 && "Murat" == "Murat"); //false


        System.out.println(3 == 3 || 2 > 3); //true

        System.out.println(3 != 3 || 2 > 3 || "Murat" == "Murad"); //false

        System.out.println(3 == 3 || 2 > 3 || "Murat" == "Murat"); //true




    }
}
