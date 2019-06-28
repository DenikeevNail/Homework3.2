package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String peopleName[] = {"Nail", "Roma", "Adilet"};
        peopleName = Arrays.copyOf(peopleName, peopleName.length + 1);
        peopleName[3] = "Nazgulya";
        for (int i = 0; i < peopleName.length; i++) {

            switch (i) {
                case 0:
                    System.out.println(peopleName[i] + " Доброе утро ");
                    break;
                case 1:
                    System.out.println(peopleName[i] + " Доброго дня ");
                    break;
                case 2:
                    System.out.println(peopleName[i] + " Доброго вечера ");
                    break;
                case 3:
                    System.out.println(peopleName[i] + " Доброй ночи ");
                    break;

            }

        }

    }
}




