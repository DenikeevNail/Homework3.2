package com.company;

public class Main {

    public static void main(String[] args) {
        String peopleName[] = {"Nail", "Roma", "Adilet"};

        String a = "Nail";

        switch (a) {
            case "Nail":
                System.out.println(peopleName[0] + " Доброе утро ");
            case "Roma":
                System.out.println(peopleName[1] + " Доброго дня ");
            case "Adilet":
                System.out.println(peopleName[2] + " Доброго вечера ");


        }

    }

}


